package javapuzzlers.Change;

import java.math.BigDecimal;

public class ChangeModified {
    public static void main(String args[]) {
    	// Always use the BigDecimal(String) constructor, never BigDecimal(double).
        System.out.println(
        		new BigDecimal("2.00").subtract(new BigDecimal("1.10"))
        		);
    }
}
