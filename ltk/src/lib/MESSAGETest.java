package lib;

import org.junit.Test;


public class MESSAGETest {
	@Test
	public void testMESSAGE() {
		for(String gamelistfordisplay: MESSAGE.GameListForDisplay) {
			COMMON.println(gamelistfordisplay);
		}
		COMMON.print(MESSAGE.GameListMessage);
	}
}
