/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.DatingGame;

import java.util.Calendar;
//import java.util.Date;

public class DatingGameFixed {
	// Date represents January as 0, and Calendar perpetuates this mistake.
	// Date.getDay returns the day of the week represented by the Date instance, not the day of the month.
	// Be careful when using Calendar or Date; always consult the API documentation.
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(1999, Calendar.DECEMBER, 31); // Year, Month, Day
		System.out.print(cal.get(Calendar.YEAR) + " ");

//		Date d = cal.getTime();
		System.out.println(cal.get(Calendar.DAY_OF_MONTH)/*d.getDay()*/);
	}
}
