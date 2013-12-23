/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.PingPong;
public class PingPong {
    public static synchronized void main(String[] a) {
        Thread t = new Thread() {
            public void run() { pong(); }
        };
        t.run();
        System.out.print("Ping");
    }

    static synchronized void pong() {
        System.out.print("Pong");
    }
}
