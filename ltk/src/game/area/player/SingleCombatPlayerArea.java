package game.area.player;

import game.area.player.AbstractPlayerArea;
/**
 *【单挑玩家区域】
 * @author lihongyu19781114@hotmail.com
 * You can use and change this program as you wish.
 * But you should know there is no warranty.
 * Please report any bugs to the author.
 * Legends of the Three Kingdoms(LTK,SanGuoSha)
 */
public final class SingleCombatPlayerArea extends AbstractPlayerArea {
	private SingleCombatPlayerArea() {}
	private static class SingletonHolder { private static final SingleCombatPlayerArea INSTANCE = new SingleCombatPlayerArea(); }
	public static SingleCombatPlayerArea getInstance() { return SingletonHolder.INSTANCE; }
}
