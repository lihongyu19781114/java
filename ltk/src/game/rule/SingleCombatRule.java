package game.rule;

import lib.DEBUG;
import game.SingleCombatGame;
import game.area.aiplayer.SingleCombatAiplayerArea;
import game.area.master.SingleCombatMasterArea;
import game.area.player.SingleCombatPlayerArea;
import game.board.SingleCombatBoard;
import game.character.aiplayer.SingleCombatAiplayerCharacter;
import game.character.master.SingleCombatMasterCharacter;
import game.character.player.SingleCombatPlayerCharacter;
import game.rule.AbstractRule;
/**
 *【单挑游戏规则】
 * @author lihongyu19781114@hotmail.com
 * You can use and change this program as you wish.
 * But you should know there is no warranty.
 * Please report any bugs to the author.
 * Legends of the Three Kingdoms(LTK,SanGuoSha)
 */
public final class SingleCombatRule extends AbstractRule {
	public static void createRule() {
		DEBUG.println(DEBUG.ClassName()+"."+DEBUG.MethodName()+"("+DEBUG.FileName()+":"+DEBUG.LineNumber()+")");
		createGameInfo();
		createCards();
		createPlayerAreas();
		createMasterArea();
		createBoard();
		createAiplayers();
		createPlayer();
		createMaster();
	}

	private static void createGameInfo() {
		DEBUG.println(DEBUG.ClassName()+"."+DEBUG.MethodName()+"("+DEBUG.FileName()+":"+DEBUG.LineNumber()+")");
		singlecombatgameinfo = SingleCombatGameInfo.getInstance();
	}

	private static void createCards() {
		DEBUG.println(DEBUG.ClassName()+"."+DEBUG.MethodName()+"("+DEBUG.FileName()+":"+DEBUG.LineNumber()+")");
		singlecombatcards = SingleCombatCards.getInstance();
	}

	private static void createPlayerAreas() {
		DEBUG.println(DEBUG.ClassName()+"."+DEBUG.MethodName()+"("+DEBUG.FileName()+":"+DEBUG.LineNumber()+")");
		singlecombatplayerarea = SingleCombatPlayerArea.getInstance();
		singlecombataiplayerarea = SingleCombatAiplayerArea.getInstance();
	}

	private static void createMasterArea() {
		DEBUG.println(DEBUG.ClassName()+"."+DEBUG.MethodName()+"("+DEBUG.FileName()+":"+DEBUG.LineNumber()+")");
		singlecombatmasterarea = SingleCombatMasterArea.getInstance();
	}

	private static void createBoard() {
		DEBUG.println(DEBUG.ClassName()+"."+DEBUG.MethodName()+"("+DEBUG.FileName()+":"+DEBUG.LineNumber()+")");
		singlecombatboard = SingleCombatBoard.getInstance();
	}

	private static void createAiplayers() {
		DEBUG.println(DEBUG.ClassName()+"."+DEBUG.MethodName()+"("+DEBUG.FileName()+":"+DEBUG.LineNumber()+")");
		singlecombataiplayercharacter = SingleCombatAiplayerCharacter.getInstance();
	}

	private static void createPlayer() {
		DEBUG.println(DEBUG.ClassName()+"."+DEBUG.MethodName()+"("+DEBUG.FileName()+":"+DEBUG.LineNumber()+")");
		singlecombatplayercharacter = SingleCombatPlayerCharacter.getInstance();
	}

	private static void createMaster() {
		DEBUG.println(DEBUG.ClassName()+"."+DEBUG.MethodName()+"("+DEBUG.FileName()+":"+DEBUG.LineNumber()+")");
		singlecombatmastercharacter = SingleCombatMasterCharacter.getInstance();
	}

	public static void gameStart() {
		DEBUG.println(DEBUG.ClassName()+"."+DEBUG.MethodName()+"("+DEBUG.FileName()+":"+DEBUG.LineNumber()+")");
		SingleCombatMasterCharacter.gameStart();
	}

	public static void gameOver() {
		DEBUG.println(DEBUG.ClassName()+"."+DEBUG.MethodName()+"("+DEBUG.FileName()+":"+DEBUG.LineNumber()+")");
		SingleCombatGame.gameOver();
	}

	@SuppressWarnings("unused")
	private static SingleCombatGameInfo singlecombatgameinfo;
	@SuppressWarnings("unused")
	private static SingleCombatCards singlecombatcards;
	@SuppressWarnings("unused")
	private static SingleCombatPlayerArea singlecombatplayerarea;
	@SuppressWarnings("unused")
	private static SingleCombatAiplayerArea singlecombataiplayerarea;
	@SuppressWarnings("unused")
	private static SingleCombatMasterArea singlecombatmasterarea;
	@SuppressWarnings("unused")
	private static SingleCombatBoard singlecombatboard;
	@SuppressWarnings("unused")
	private static SingleCombatAiplayerCharacter singlecombataiplayercharacter;
	@SuppressWarnings("unused")
	private static SingleCombatPlayerCharacter singlecombatplayercharacter;
	@SuppressWarnings("unused")
	private static SingleCombatMasterCharacter singlecombatmastercharacter;
}

final class SingleCombatGameInfo {
	private SingleCombatGameInfo() {}
	private static class SingletonHolder { private static final SingleCombatGameInfo INSTANCE = new SingleCombatGameInfo(); }
	public static SingleCombatGameInfo getInstance() { return SingletonHolder.INSTANCE; }
}

final class SingleCombatCards {
	private SingleCombatCards() {}
	private static class SingletonHolder { private static final SingleCombatCards INSTANCE = new SingleCombatCards(); }
	public static SingleCombatCards getInstance() { return SingletonHolder.INSTANCE; }
}
