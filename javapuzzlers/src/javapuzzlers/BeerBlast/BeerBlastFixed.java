/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.BeerBlast;

import java.io.IOException;
import java.io.InputStream;

// you must drain the output stream of a child process in order to ensure its termination; the same goes for the error stream
// If you elect not to merge the output and error streams, you must drain them concurrently.
// APIs should make it easy to do the right thing and difficult or impossible to do the wrong thing.

public class BeerBlastFixed {
	static final String COMMAND = "java BeerBlast slave";

	public static void main(String[] args) throws Exception {
		if (args.length == 1 && args[0].equals("slave")) {
			for (int i = 99; i > 0; i--) {
				System.out.println(i + " bottles of beer on the wall");
				System.out.println(i + " bottles of beer");
				System.out.println("You take one down, pass it around,");
				System.out.println((i-1) + " bottles of beer on the wall");
				System.out.println();
			}
		} else {
			// Master
			Process process = Runtime.getRuntime().exec(COMMAND);

			drainInBackground(process.getInputStream());

			int exitValue = process.waitFor();
			System.out.println("exit value = " + exitValue);
		}
	}

	static void drainInBackground(final InputStream is) {
		new Thread(new Runnable() {
			public void run() {
				try {
					while(is.read() >= 0);
				} catch (IOException e) {
					// return on IOException
				}
			}
		}).start();
	}
}
