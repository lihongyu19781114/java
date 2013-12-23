/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.PrivateMatter;
class Base {
    public String className = "Base";
}

class Derived extends Base {
//    private String className = "Derived";
}

public class PrivateMatter {
    public static void main(String[] args) {
//        System.out.println(new Derived().className);
    }
}
