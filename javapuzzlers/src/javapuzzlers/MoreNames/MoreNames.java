/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.MoreNames;
import java.util.*;

public class MoreNames {
    private Map<String,String> m = new HashMap<String,String>();

    public void MoreNames() {
        m.put("Mickey", "Mouse");
        m.put("Mickey", "Mantle");
    }

    public int size() {
        return m.size();
    }

    public static void main(String args[]) {
        MoreNames moreNames = new MoreNames();
        System.out.println(moreNames.size());
    }
}
