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
