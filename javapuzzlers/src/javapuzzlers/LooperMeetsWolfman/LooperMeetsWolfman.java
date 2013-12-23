/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.LooperMeetsWolfman;
public class LooperMeetsWolfman {
	// watch out for overflow: Like the Wolfman, it's a killer.
    public static void main(String[] args) {
        // Place your declaration for i here
    	int i = Integer.MIN_VALUE;
    	// long i = Long.MIN_VALUE;
        while (i != 0 && i == -i) {
        }
    }
}
