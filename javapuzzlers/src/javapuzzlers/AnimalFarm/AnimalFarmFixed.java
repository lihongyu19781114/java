/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.AnimalFarm;

public class AnimalFarmFixed {

	public static void main(String[] args) {
        final String pig = "length: 10";
        final String dog = "length: " + pig.length();

        System.out.println("Animals are equal: "
                + pig == dog); // NG

        // When using the string concatenation operator,
        // always parenthesize nontrivial operands.
        System.out.println("Animals are equal: "
                + (pig == dog)); // NG

        // When comparing object references,
        // you should use the equals method in preference to the == operator
        // unless you need to compare object identity rather than value.
        System.out.println("Animals are equal: "
                           + pig.equals(dog)); // OK
	}

}
