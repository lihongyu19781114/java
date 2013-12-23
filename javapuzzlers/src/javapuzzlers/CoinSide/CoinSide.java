/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.CoinSide;
import java.util.Random;

// Upgrade to the latest release of the Java platform.

public class CoinSide {
    private static Random rnd = new Random();

    public static CoinSide flip() {
        return rnd.nextBoolean() ?
            Heads.INSTANCE : Tails.INSTANCE;
    }

    public static void main(String[] args) {
        System.out.println(flip());
    }
}

class Heads extends CoinSide {
    private Heads() { }
    public static final Heads INSTANCE = new Heads();

    public String toString() {
        return "heads";
    }
}

class Tails extends CoinSide {
    private Tails() { }
    public static final Tails INSTANCE = new Tails();

    public String toString() {
        return "tails";
    }
}
