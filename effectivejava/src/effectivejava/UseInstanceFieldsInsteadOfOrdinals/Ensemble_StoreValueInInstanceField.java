package effectivejava.UseInstanceFieldsInsteadOfOrdinals;

//Never derive a value associated with an enum from its ordinal; store it in an instance field instead.//IMPROVED VERSION
public enum Ensemble_StoreValueInInstanceField {
	SOLO(1), DUET(2), TRIO(3), QUARTET(4), QUINTET(5),
	SEXTET(6), SEPTET(7), OCTET(8), DOUBLE_QUARTET(8),
	NONET(9), DECTET(10), TRIPLE_QUARTET(12);
	private final int numberOfMusicians;
	Ensemble_StoreValueInInstanceField(int size) { this.numberOfMusicians = size; }
	public int numberOfMusicians() { return numberOfMusicians; }
}
