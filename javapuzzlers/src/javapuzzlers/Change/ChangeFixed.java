/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.Change;

import java.math.BigDecimal;

public class ChangeFixed {
    public static void main(String args[]) {
    	// Always use the BigDecimal(String) constructor, never BigDecimal(double).
        System.out.println(
        		new BigDecimal("2.00").subtract(new BigDecimal("1.10"))
        		);
    }
}
