/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.com.javapuzzlers;
import java.io.File;

public class MeToo {
    public static void main(String[] args) {
    System.out.println(MeToo.class.getName().
        replaceAll("\\.", File.separator) + ".class");
  }
}
