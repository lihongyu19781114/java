package game.board;

import game.board.AbstractBoard;
/**
 *【单挑游戏桌子】
 * @author lihongyu19781114@hotmail.com
 * You can use and change this program as you wish.
 * But you should know there is no warranty.
 * Please report any bugs to the author.
 * Legends of the Three Kingdoms(LTK,SanGuoSha)
 */
public final class SingleCombatBoard extends AbstractBoard {
	private SingleCombatBoard() {}
	private static class SingletonHolder { private static final SingleCombatBoard INSTANCE = new SingleCombatBoard(); }
	public static SingleCombatBoard getInstance() { return SingletonHolder.INSTANCE; }
}
