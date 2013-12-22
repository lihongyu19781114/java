package javapuzzlers.FadeToBlack;

// It is possible to refer to an obscured type name.
// The trick is to use the name in a syntactic context where a type is allowed but a variable is not.

public class FadeToBlackFixed {
	// This method should read and print the value of the field Z in class X.Y

//	static class Xy extends X.Y { }
//
//	public static void main(String[] args){
////		System.out.println(((X.Y)null).Z);					// Good
//		System.out.println(Xy.Z);								// Better
//	}
	public static <T extends X.Y> void main(String[] args){		// Best
		System.out.println(T.Z);
	}
}

//class XFixed {
//	static class YFixed {
//		static String ZFixed = "Black";
//	}
//
//	static CFixed YFixed = new CFixed();
//}
//
//class CFixed {
//	String ZFixed = "White";
//}