/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.LinePrinter;
public class LinePrinter {
  //Avoid Unicode escapes except where they are truly necessary.
  public static void main(String[] args) {
    // Note: \ u000A is Unicode representation of linefeed (LF)
    char c = 0x000A;
    System.out.println(c);
  }
}
