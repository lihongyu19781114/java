/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.DatingGame;
import java.util.*;

public class DatingGame {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(1999, 12, 31); // Year, Month, Day
        System.out.print(cal.get(Calendar.YEAR) + " ");

        Date d = cal.getTime();
        System.out.println(d.getDay());
    }
}
