/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.Classifier;
public class Classifier {
    public static void main(String[] args) {
        System.out.println(
            classify('n') + classify('+') + classify('2'));
    }

    static String classify(char ch) {
        if ("0123456789".indexOf(ch) >= 0)
            return "NUMERAL ";
        if ("abcdefghijklmnopqrstuvwxyz".indexOf(ch) >= 0)
            return "LETTER ";
        // The best way to comment out a section of code is to use a sequence of single-line comments.
/*
 *      (Operators not supported yet)
 *      if ("+-* /&|!=".indexOf(ch) >= 0)
 *          return "OPERATOR ";
 */
        return "UNKNOWN ";
    }
}
