/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

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
