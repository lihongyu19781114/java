package javapuzzlers.Abc;

public class AbcModified {

	public static void main(String[] args) {
        String letters = "ABC";
        char[] numbers = { '1', '2', '3' };

        System.out.println(letters + " easy as " + numbers); // NG
		// To convert a char array to a string, invoke String.valueOf(char[]).
        System.out.println(letters + " easy as " + String.valueOf(numbers)); // OK

        System.out.print(letters + " easy as "); // OK
        System.out.println(numbers); // OK

        Object numbers1 = new char[] { '1', '2', '3' };
        System.out.print(letters + " easy as "); // OK
        System.out.println(numbers1); // NG
	}

}
