package game.character.player;

import game.character.player.AbstractPlayerCharacter;

/**
 *【单挑玩家角色】
 * @author lihongyu19781114@hotmail.com
 * You can use and change this program as you wish.
 * But you should know there is no warranty.
 * Please report any bugs to the author.
 * Legends of the Three Kingdoms(LTK,SanGuoSha)
 */
public final class SingleCombatPlayerCharacter extends AbstractPlayerCharacter {
	private SingleCombatPlayerCharacter() {}
	private static class SingletonHolder { private static final SingleCombatPlayerCharacter INSTANCE = new SingleCombatPlayerCharacter(); }
	public static SingleCombatPlayerCharacter getInstance() { return SingletonHolder.INSTANCE; }
}
