package javapuzzlers.Tweedledum;

public class TweedledumFixed {
	// Do not use compound assignment operators on variables of type byte, short, or char.
	public static void main(String[] args) {
		short short_x = 0;
		int   int_x   = 0;
        int   i       = 123456;
        short_x		+= i;			// ERR : Contains a hidden cast!
        //short_x	 = short_x + i;	// NG  : Won't compile - "possible loss of precision"
        int_x		 = int_x   + i; // OK

        System.out.println("short_x = " + short_x); // ERR
        System.out.println("int_x = "   + int_x);   // OK
	}
}
