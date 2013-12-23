/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.Creator;
public class Creator {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++)
//            Creature creature = new Creature();
        System.out.println(Creature.numCreated());
    }
}

class Creature {
    private static long numCreated = 0;

    public Creature() {
        numCreated++;
    }

    public static long numCreated() {
        return numCreated;
    }
}
