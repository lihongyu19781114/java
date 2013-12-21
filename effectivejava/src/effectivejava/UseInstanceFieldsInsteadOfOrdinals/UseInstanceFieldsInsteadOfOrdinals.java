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
