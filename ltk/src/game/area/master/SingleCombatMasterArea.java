package game.area.master;

import game.area.master.AbstractMasterArea;
/**
 *【单挑管理者区域】
 * @author lihongyu19781114@hotmail.com
 * You can use and change this program as you wish.
 * But you should know there is no warranty.
 * Please report any bugs to the author.
 * Legends of the Three Kingdoms(LTK,SanGuoSha)
 */
public final class SingleCombatMasterArea extends AbstractMasterArea {
	private SingleCombatMasterArea() {}
	private static class SingletonHolder { private static final SingleCombatMasterArea INSTANCE = new SingleCombatMasterArea(); }
	public static SingleCombatMasterArea getInstance() { return SingletonHolder.INSTANCE; }
}
