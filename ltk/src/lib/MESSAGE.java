package lib;

public abstract class MESSAGE {
	// GameList[START]
	public enum GameListForSelect {
		Exit,
		SingleCombat_1v1,
	}
//	public final static String[] GameListForDisplay = {
//		"1)SingleCombat_1v1",
//		"0)Exit",
//	};
//	public final static String GameListMessage = "Select" + "("
//	+ GameListForSelect.SingleCombat_1v1.ordinal() + "/"
//	+ GameListForSelect.Exit.ordinal()
//	+ "):";
	public final static String[] GameListForDisplay = {
		"1)单挑",
		"0)退出",
	};
	public final static String GameListMessage = "选择" + "("
	+ GameListForSelect.SingleCombat_1v1.ordinal() + "/"
	+ GameListForSelect.Exit.ordinal()
	+ "):";
	// GameList[END]
}
