/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.BeerBlast;
public class BeerBlast {
    static final String COMMAND = "java BeerBlast slave";

    public static void main(String[] args) throws Exception {
        if (args.length == 1 && args[0].equals("slave")) {
            for (int i = 99; i > 0; i--) {
                System.out.println(i + " bottles of beer on the wall");
                System.out.println(i + " bottles of beer");
                System.out.println("You take one down, pass it around,");
                System.out.println((i-1) + " bottles of beer on the wall");
                System.out.println();
            }
        } else {
            // Master
            Process process = Runtime.getRuntime().exec(COMMAND);
            int exitValue = process.waitFor();
            System.out.println("exit value = " + exitValue);
        }
    }
}
