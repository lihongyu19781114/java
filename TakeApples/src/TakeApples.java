import java.util.Scanner;

/**
 * @author Android_iPhone@CSDN
 */
public class TakeApples {
    /**
     * @param args Command-Line Arguments
     */
    public static void main(final String[] args) {
        System.out.print("Please input total number of apples:");
        leftNumberOfApples = DEFAULT_VALUE_0;
        do {
            try {
                leftNumberOfApples = (new Scanner(System.in)).nextInt();
            } catch (Exception e) {
                leftNumberOfApples = DEFAULT_VALUE_0;
            }
        } while (leftNumberOfApples <= DEFAULT_VALUE_0);

        gameStart(randomBoolean());
    } // main

    /**
     * @param youTakeFirst [youTakeFirst(true)] or [computerTakeFirst(false)]
     * @return [COMPUTER_WIN(true)] or [YOU_WIN(false)]
     */
    public static boolean gameStart(final boolean youTakeFirst) {
        boolean yourTurn = youTakeFirst;
        do {
            if (!gameOver()) {
                if (yourTurn) { youTake(); }
            } else {
                System.out.println("You Win!");
                return YOU_WIN;
            }
            if (!gameOver()) {
                computerTake();
                yourTurn = true;
            } else {
                System.out.println("Computer Win!");
                return COMPUTER_WIN;
            }
        } while(true);
    } // gameStart

    /**
     * @return [GameOver(true)] or [GameIsNotOver(false)]
     */
    private static boolean gameOver() {
        return (leftNumberOfApples <= DEFAULT_VALUE_0);
    } // gameOver

    /***/
    private static void youTake() {
        System.out.print("Please input number of apples you take:");
        int takeNumberOfApples = DEFAULT_VALUE_0;
        do {
            try {
                if (debugMode) {
                    takeNumberOfApples = randomInt(
                            RANDOM_LOWER_BOUND,
                            RANDOM_UPPER_BOUND);
                } else {
                    takeNumberOfApples = (new Scanner(System.in)).nextInt();
                }
            } catch (Exception e) {
                takeNumberOfApples = DEFAULT_VALUE_0;
            }
        } while(!isValidTake(takeNumberOfApples));

        if (debugMode) { System.out.println(takeNumberOfApples); }

        leftNumberOfApples -= takeNumberOfApples;
        if (leftNumberOfApples != DEFAULT_VALUE_0) {
            System.out.println("->Number of apples after your take is:"
                    + leftNumberOfApples);
        }
    }

    /***/
    private static void computerTake() {
        int takeNumberOfApples = DEFAULT_VALUE_0;
        do {
            takeNumberOfApples = randomInt(
                    RANDOM_LOWER_BOUND,
                    RANDOM_UPPER_BOUND);
        } while(!isValidTake(takeNumberOfApples));

        if (takeNumberOfApples == 1) {
            System.out.println("Computer takes "
                    + takeNumberOfApples + " apple");
        } else {
            System.out.println("Computer takes "
                    + takeNumberOfApples + " apples");
        }

        leftNumberOfApples -= takeNumberOfApples;
        if (leftNumberOfApples != DEFAULT_VALUE_0) {
            System.out.println("->Number of apples after computer's take is:"
                    + leftNumberOfApples);
        }
    }

    /**
     * @param lowerbound range [lowerbound, upperbound]
     * @param upperbound range [lowerbound, upperbound]
     * @return A random int in range [lowerbound, upperbound]
     */
    private static int randomInt(final int lowerbound, final int upperbound) {
        return (int) (
                (upperbound - lowerbound + 1) * Math.random() + lowerbound);
    }

    /**
     * @return true or false randomly
     */
    private static boolean randomBoolean() {
        return randomInt(0, 1) != 0;
    }

    //[START]Game Rule's Definition
    /**
     * @param takeNumberOfApples in (0, leftNumberOfApples]
     * @return [ValidTake(true)] or [NotValidTake(false)]
     */
    private static boolean isValidTake(final int takeNumberOfApples) {
        final int int1 = 1;
        final int int3 = 3;
        final int int5 = 5;
        final int int8 = 8;
        return (takeNumberOfApples == int1
            || takeNumberOfApples == int3
            || takeNumberOfApples == int5
            || takeNumberOfApples == int8)
            && (DEFAULT_VALUE_0 < takeNumberOfApples
            && takeNumberOfApples <= leftNumberOfApples);
    }

    /***/
    private static final int DEFAULT_VALUE_0    = 0;
    /***/
    private static final int RANDOM_LOWER_BOUND = 1;
    /***/
    private static final int RANDOM_UPPER_BOUND = 8;
    //[END]Game Rule's Definition

    //[START]Debug's Definition
    /***/
    private static final boolean COMPUTER_WIN       = true;
    /***/
    private static final boolean YOU_WIN            = !COMPUTER_WIN;
    /***/
    private static       boolean debugMode         = false;
    /***/
    private static       int     leftNumberOfApples = DEFAULT_VALUE_0;
    /**
     * @param bDebugMode [debugMode(true)] or [releaseMode(false):default]
     * @param iLeftNumberOfApples total number of apples when gameStart
     */
    public static void setDebugDefinition(
            final boolean bDebugMode, final int iLeftNumberOfApples) {
        TakeApples.debugMode = bDebugMode;
        TakeApples.leftNumberOfApples = iLeftNumberOfApples;
    }
    //[END]Debug's Definition
}
