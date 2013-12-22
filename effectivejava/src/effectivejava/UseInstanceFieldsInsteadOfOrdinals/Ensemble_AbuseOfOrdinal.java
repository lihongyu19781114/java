/**
 * This code is copied and edited from Effective Java
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package effectivejava.UseInstanceFieldsInsteadOfOrdinals;

//Abuse of ordinal to derive an associated value - DON'T DO THIS
public enum Ensemble_AbuseOfOrdinal {
	SOLO, DUET, TRIO, QUARTET, QUINTET,
	SEXTET, SEPTET, OCTET, NONET, DECTET;
	public int numberOfMusicians() { return ordinal() + 1; }
}
