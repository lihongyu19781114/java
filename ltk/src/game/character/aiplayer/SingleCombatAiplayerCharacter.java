package game.character.aiplayer;

import game.character.aiplayer.AbstractAiplayerCharacter;

/**
 *【单挑智能玩家角色】
 * @author lihongyu19781114@hotmail.com
 * You can use and change this program as you wish.
 * But you should know there is no warranty.
 * Please report any bugs to the author.
 * Legends of the Three Kingdoms(LTK,SanGuoSha)
 */
public final class SingleCombatAiplayerCharacter extends AbstractAiplayerCharacter {
	private SingleCombatAiplayerCharacter() {}
	private static class SingletonHolder { private static final SingleCombatAiplayerCharacter INSTANCE = new SingleCombatAiplayerCharacter(); }
	public static SingleCombatAiplayerCharacter getInstance() { return SingletonHolder.INSTANCE; }
}
