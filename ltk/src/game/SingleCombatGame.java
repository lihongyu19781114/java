package game;

import java.util.Scanner;

import lib.COMMON;
import lib.DEBUG;
import lib.MESSAGE;

import game.AbstractGame;
import game.rule.SingleCombatRule;
/**
 *【单挑游戏】
 * @author lihongyu19781114@hotmail.com
 * You can use and change this program as you wish.
 * But you should know there is no warranty.
 * Please report any bugs to the author.
 * Legends of the Three Kingdoms(LTK,SanGuoSha)
 */
public final class SingleCombatGame extends AbstractGame {
	public static void main(String[] args) {		// {wrapper method}
		DEBUG.println(DEBUG.ClassName()+"."+DEBUG.MethodName()+"("+DEBUG.FileName()+":"+DEBUG.LineNumber()+")");
		startNewGame();
	}

	public static void startNewGame() {				// {delegation method}
		DEBUG.println(DEBUG.ClassName()+"."+DEBUG.MethodName()+"("+DEBUG.FileName()+":"+DEBUG.LineNumber()+")");
		showGameList();
		selectGame();
		createRule();
		gameStart();
	}

	private static void showGameList() {
		DEBUG.println(DEBUG.ClassName()+"."+DEBUG.MethodName()+"("+DEBUG.FileName()+":"+DEBUG.LineNumber()+")");
		for(String gamelistfordisplay: MESSAGE.GameListForDisplay) {
			COMMON.println(gamelistfordisplay);
		}
		COMMON.print(MESSAGE.GameListMessage);
	}

	private static boolean isValidSelectedGame(int selectedgame) {
		try {
			for(MESSAGE.GameListForSelect gamelistforselect_value: MESSAGE.GameListForSelect.values()) {
				if(selectedgame == gamelistforselect_value.ordinal()) return true;
			}
			return false;
		} catch(Exception e) {
			return false;
		}
	}

	private static void selectGame() {
		DEBUG.println(DEBUG.ClassName()+"."+DEBUG.MethodName()+"("+DEBUG.FileName()+":"+DEBUG.LineNumber()+")");
		int selectedgame = COMMON.DEFAULT_INT;
		do {
			try {
				selectedgame = (new Scanner(System.in)).nextInt();
			} catch(Exception e) {
				selectedgame = COMMON.DEFAULT_INT;
			}
		} while(!isValidSelectedGame(selectedgame));

		if(selectedgame != MESSAGE.GameListForSelect.SingleCombat_1v1 .ordinal()) {
			System.exit(0);
		}
	}

	private static void createRule() {
		DEBUG.println(DEBUG.ClassName()+"."+DEBUG.MethodName()+"("+DEBUG.FileName()+":"+DEBUG.LineNumber()+")");
		SingleCombatRule.createRule();
	}

	private static void gameStart() {
		DEBUG.println(DEBUG.ClassName()+"."+DEBUG.MethodName()+"("+DEBUG.FileName()+":"+DEBUG.LineNumber()+")");
		SingleCombatRule.gameStart();
	}

	public static void gameOver() {
		DEBUG.println(DEBUG.ClassName()+"."+DEBUG.MethodName()+"("+DEBUG.FileName()+":"+DEBUG.LineNumber()+")");
		startNewGame();
	}
}
