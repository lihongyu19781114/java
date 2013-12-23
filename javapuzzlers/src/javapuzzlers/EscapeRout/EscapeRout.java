/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.EscapeRout;
public class EscapeRout {
  public static void main(String[] args) {
    // \u0022 is the Unicode escape for double-quote (")
    System.out.println("a\u0022.length() + \u0022b".length());

    // Java provides no special treatment for Unicode escapes within string literals.
    // If the author of the program had actually wanted this behavior, it would have been much clearer to say:
    System.out.println("a".length() + "b".length());

    // In summary, prefer escape sequences to Unicode escapes in string and character literals.
    // Do not use Unicode escapes to represent ASCII characters.
  }
}
