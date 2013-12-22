package javapuzzlers.InTheLoop;

public class InTheLoopFixed {

    public static final int END = Integer.MAX_VALUE;
    public static final int START = END - 100;

    public static void main(String[] args) {
        int count = 0;
        for (long i = START; i <= END; i++) // Whenever you use an integral type, be aware of the boundary conditions.
            count++;
        System.out.println(count);
    }

}
