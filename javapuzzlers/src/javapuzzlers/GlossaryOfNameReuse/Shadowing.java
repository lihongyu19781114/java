package javapuzzlers.GlossaryOfNameReuse;

// A variable, method, or type shadows all variables, methods, or types,
// respectively, with the same name in a textually enclosing scope.
// If an entity is shadowed, you cannot refer to it by its simple name;
// depending on the entity, you cannot refer to it at all [JLS 6.3.1]

public final class Shadowing {

	static String sentence = "I don't know.";

	public static void main(String[] args) {
        String sentence = "I know!";   // shadows static field
        System.out.println(sentence);  // prints local variable
	}
}

// Although shadowing is generally discouraged, one common idiom does involve shadowing.
// Constructors often reuse a field name from their class as a parameter name to pass the value of the named field.
// This idiom is not without risk, but most Java programmers have decided that the stylistic benefits outweigh the risks

class Belt {
    @SuppressWarnings("unused")
	private final int size;
    public Belt(int size) { // Parameter shadows Belt.size
        this.size = size;
    }
}

