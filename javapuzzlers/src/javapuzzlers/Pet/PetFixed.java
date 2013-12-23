/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.Pet;

// use the THRead(Runnable) constructor instead of extending Thread

public final class PetFixed {
	public final String name;
	public final String food;
	public final String sound;

	public PetFixed(String name, String food, String sound) {
		this.name = name;
		this.food = food;
		this.sound = sound;
	}

	public void eat() {
		System.out.println(name + ": Mmmmm, " + food);
	}
	public void play() {
		System.out.println(name + ": " + sound + " " + sound);
	}
	public void sleep() {
		System.out.println(name + ": Zzzzzzz...");
	}

	public void live() {
		new Thread(new Runnable() {
			public void run() {
				while (true) {
					eat();
					play();
					sleep();
				}
			}
		}).start();
	}
	public static void main(String[] args) {
		new PetFixed("Fido", "beef", "Woof").live();
	}
}
