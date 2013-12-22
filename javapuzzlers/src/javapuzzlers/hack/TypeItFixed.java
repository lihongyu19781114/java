package javapuzzlers.hack;

public class TypeItFixed {
	private static class ClickIt extends CodeTalkFixed {
		// A package-private method cannot be directly overridden by a method in a different package [JLS 8.4.8.1].
		void printMessage() {
			System.out.println("Hack");
		}
	}

	public static void main(String[] args) {
		ClickIt clickit = new ClickIt();
		clickit.doIt();
	}
}