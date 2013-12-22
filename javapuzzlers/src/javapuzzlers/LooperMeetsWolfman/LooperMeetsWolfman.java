package javapuzzlers.LooperMeetsWolfman;
public class LooperMeetsWolfman {
	// watch out for overflow: Like the Wolfman, it's a killer.
    public static void main(String[] args) {
        // Place your declaration for i here
    	int i = Integer.MIN_VALUE;
    	// long i = Long.MIN_VALUE;
        while (i != 0 && i == -i) {
        }
    }
}
