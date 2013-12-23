/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.ShadesOfGray;
public class ShadesOfGray {
    public static void main(String[] args){
        System.out.println(X.Y.Z);
    }
}

class X {
    static class Y {
        static String Z = "Black";
    }

    static C Y = new C();
}

class C {
    String Z = "White";
}
