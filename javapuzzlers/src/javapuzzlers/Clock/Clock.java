/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.Clock;
public class Clock {
    public static void main(String[] args) {
        int minutes = 0;
        for (int ms = 0; ms < 60*60*1000; ms++)
            if (ms % 60*1000 == 0)
                minutes++;
        System.out.println(minutes);
    }
}
