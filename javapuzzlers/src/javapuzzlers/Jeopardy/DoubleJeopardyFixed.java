/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.Jeopardy;

// the final modifier means something completely different on methods and fields.

class JeopardyFixed {
    public static final String PRIZE = "$64,000";
    public static final String prize() {
    	return PRIZE;
    }
}

public class DoubleJeopardyFixed extends JeopardyFixed {
	public static final String PRIZE = "2 cents";

	public static void main(String[] args) {
		System.out.println(JeopardyFixed.prize() + " " + DoubleJeopardyFixed.PRIZE);
	}
}
