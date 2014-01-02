package game;

import java.util.Scanner;

import lib.COMMON;
import lib.DEBUG;

import game.AbstractGame;
/**
 *【单挑游戏】
 * @author lihongyu19781114@hotmail.com
 * You can use and change this program as you wish.
 * But you should know there is no warranty.
 * Please report any bugs to the author.
 * Legends of the Three Kingdoms(LTK,SanGuoSha)
 */
public final class SingleCombatGame extends AbstractGame {
	// GameList[START]
	private static String[] GameListForDisplay = {
		"1)SingleCombat_1v1",
		"0)Exit",
	};
	private enum GameListForSelect {
		Exit,
		SingleCombat_1v1,
	}
	// GameList[END]

	public static void main(String[] args) {		// {wrapper method}
		DEBUG.println("[DEBUG]"+DEBUG.MethodName());
		startNewGame();
	}

	public static void startNewGame() {				// {delegation method}
		DEBUG.println("[DEBUG]"+DEBUG.MethodName());
		showGameList();
		selectGame();
		createRule();
		gameStart();
	}

	private static void showGameList() {
		DEBUG.println("[DEBUG]"+DEBUG.MethodName());
		COMMON.println("SelectGame:");
		for(String gamelistfordisplay: GameListForDisplay) {
			COMMON.println(gamelistfordisplay);
		}
	}

	private static boolean isValidSelectedGame(int selectedgame) {
		try {
			for(GameListForSelect gamelistforselect_value: GameListForSelect.values()) {
				if(selectedgame == gamelistforselect_value.ordinal()) return true;
			}
			return false;
		} catch(Exception e) {
			return false;
		}
	}

	private static void selectGame() {
		DEBUG.println("[DEBUG]"+DEBUG.MethodName());
		int selectedgame = COMMON.DEFAULT_INT;
		do {
			try {
				selectedgame = (new Scanner(System.in)).nextInt();
			} catch(Exception e) {
				selectedgame = COMMON.DEFAULT_INT;
			}
		} while(!isValidSelectedGame(selectedgame));

		if(selectedgame == GameListForSelect.Exit.ordinal()) {
			gameOver();
		}
	}

	private static void createRule() {
		DEBUG.println("[DEBUG]"+DEBUG.MethodName());
	}

	private static void gameStart() {
		DEBUG.println("[DEBUG]"+DEBUG.MethodName());
	}

	private static void gameOver() {
		DEBUG.println("[DEBUG]"+DEBUG.MethodName());
		System.exit(0);
	}
}
