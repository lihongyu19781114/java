/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.Thing;

public class MyThingFixed extends Thing{
	private final int arg;
	public MyThingFixed() {
		this(0);
	}

	private MyThingFixed(int i) {
		super(i);
		arg = i;
	}
}
