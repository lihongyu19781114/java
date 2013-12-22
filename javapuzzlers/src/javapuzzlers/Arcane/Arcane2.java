package javapuzzlers.Arcane;
public class Arcane2 {
	// catch clauses that catch Exception or Throwable are legal regardless of the contents of the corresponding try clause.
    public static void main(String[] args) {
        try {
            // If you have nothing nice to say, say nothing
        } catch(Exception e) {
            System.out.println("This can't happen");
        }
    }
}
