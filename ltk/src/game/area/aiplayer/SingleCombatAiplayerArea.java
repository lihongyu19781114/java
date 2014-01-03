package game.area.aiplayer;

import game.area.aiplayer.AbstractAiplayerArea;
/**
 *【单挑智能玩家区域】
 * @author lihongyu19781114@hotmail.com
 * You can use and change this program as you wish.
 * But you should know there is no warranty.
 * Please report any bugs to the author.
 * Legends of the Three Kingdoms(LTK,SanGuoSha)
 */
public final class SingleCombatAiplayerArea extends AbstractAiplayerArea {
	private SingleCombatAiplayerArea() {}
	private static class SingletonHolder { private static final SingleCombatAiplayerArea INSTANCE = new SingleCombatAiplayerArea(); }
	public static SingleCombatAiplayerArea getInstance() { return SingletonHolder.INSTANCE; }
}
