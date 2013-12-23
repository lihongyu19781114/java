/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.ColorPoint;

// it is possible to observe the value of a final instance field before its value has been assigned
// circular instance initialization can and should always be avoided.
// never call overridable methods from constructors, either directly or indirectly [EJ Item 15]

// You can fix the problem by initializing the field name lazily,
// when it is first used,
// rather than eagerly, when the Point instance is created.

class PointFixed {
	protected final int x, y;
	private String name; // Lazily initialized
	PointFixed(int x, int y) {
		this.x = x;
		this.y = y;
//		name = makeName();									// 3. Invoke subclass method // name initialization removed
	}

	protected String makeName() {
		return "[" + x + "," + y + "]";
	}

	// Lazily computes and caches name on first use
	public final synchronized String toString() {
		if(name == null)
			name = makeName();
		return name;
	}
}

public class ColorPointFixed extends PointFixed {
	private final String color;
	ColorPointFixed(int x, int y, String color) {
		super(x, y);										// 2. Chain to Point constructor
		this.color = color;									// 5. Initialize blank final-Too late
	}

	protected String makeName() {
		return super.makeName() + ":" + color;				// 4. Executes before subclass constructor body!
	}

	public static void main(String[] args) {
		System.out.println(new ColorPointFixed(4, 2, "purple"));	// 1. Invoke subclass constructor
	}
}

