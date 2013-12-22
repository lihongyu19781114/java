/**
 * This code is copied and edited from Effective Java
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package effectivejava.UseInstanceFieldsInsteadOfOrdinals;

public final class UseInstanceFieldsInsteadOfOrdinals {
	public static void main(String[] args) {
		for (Ensemble_AbuseOfOrdinal ensemble : Ensemble_AbuseOfOrdinal.values()) { // DON'T DO THIS
			System.out.println(ensemble.numberOfMusicians());
		}
		for (Ensemble_StoreValueInInstanceField ensemble : Ensemble_StoreValueInInstanceField.values()) { // IMPROVED VERSION
			System.out.println(ensemble.numberOfMusicians());
		}
	}

}
