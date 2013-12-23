/**
 * This code is copied and edited from Java Puzzlers
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package javapuzzlers.Copy;
import java.io.*;

public class Copy {
    static void copy(String src, String dest) throws IOException {
        InputStream in = null;
        OutputStream out = null;
        try {
            in = new FileInputStream(src);
            out = new FileOutputStream(dest);
            byte[] buf = new byte[1024];
            int n;
            while ((n = in.read(buf)) > 0)
                out.write(buf, 0, n);
        } finally {
            if (in != null) in.close();
            if (out != null) out.close();
        }
    }

    public static void main(String[] args) throws IOException {
        if (args.length != 2)
            System.out.println("Usage: java Copy <source> <dest>");
        else
            copy(args[0], args[1]);
    }
}
