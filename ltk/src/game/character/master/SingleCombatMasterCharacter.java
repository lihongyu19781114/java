package game.character.master;

import lib.DEBUG;
import game.character.master.AbstractMasterCharacter;
import game.rule.SingleCombatRule;
/**
 *【单挑管理者角色】
 * @author lihongyu19781114@hotmail.com
 * You can use and change this program as you wish.
 * But you should know there is no warranty.
 * Please report any bugs to the author.
 * Legends of the Three Kingdoms(LTK,SanGuoSha)
 */
public final class SingleCombatMasterCharacter extends AbstractMasterCharacter {
	private SingleCombatMasterCharacter() {}
	private static class SingletonHolder { private static final SingleCombatMasterCharacter INSTANCE = new SingleCombatMasterCharacter(); }
	public static SingleCombatMasterCharacter getInstance() { return SingletonHolder.INSTANCE; }

	public static void gameStart() {
		DEBUG.println(DEBUG.ClassName()+"."+DEBUG.MethodName()+"("+DEBUG.FileName()+":"+DEBUG.LineNumber()+")");
	}

	public static void gameOver() {
		DEBUG.println(DEBUG.ClassName()+"."+DEBUG.MethodName()+"("+DEBUG.FileName()+":"+DEBUG.LineNumber()+")");
		SingleCombatRule.gameOver();
	}
}
