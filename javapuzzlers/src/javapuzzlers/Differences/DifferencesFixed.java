/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.Differences;

import java.util.HashSet;
import java.util.Set;

public class DifferencesFixed {
	// integer literals beginning with a 0 are interpreted as octal values
	// Never pad an integer literal with zeros
	public static void main(String[] args) {
		int vals[] = { 789, 678, 567, 456, 345, 234, 123, 12 };
		Set<Integer> diffs = new HashSet<Integer>();

		for (int i = 0; i < vals.length; i++)
			for (int j = i; j < vals.length; j++)
				diffs.add(vals[i] - vals[j]);
		System.out.println(diffs.size());
	}
}
