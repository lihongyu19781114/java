/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.BigProblem;
import java.math.BigInteger;

public class BigProblem {
    public static void main(String[] args) {
        BigInteger fiveThousand  = new BigInteger("5000");
        BigInteger fiftyThousand = new BigInteger("50000");
        BigInteger fiveHundredThousand
                                 = new BigInteger("500000");

        BigInteger total = BigInteger.ZERO;
        total.add(fiveThousand);
        total.add(fiftyThousand);
        total.add(fiveHundredThousand);
        System.out.println(total);
    }
}
