package effectivejava.PreferClassHierarchiesToTaggedClasses;

public final class PreferClassHierarchiesToTaggedClasses {

	/**
	 * @param args
	 */
public static void main(String[] args) {
	Figure_TaggedClass circle_taggedclass = new Figure_TaggedClass(2.0);
	Figure_TaggedClass rectangle_taggedclass = new Figure_TaggedClass(2.0, 2.0);
	System.out.println(2.0+":["+circle_taggedclass.area()+"]"+":["+rectangle_taggedclass.area()+"]");

	Circle_Figure_ClassHierarchy circle_classhierarchy = new Circle_Figure_ClassHierarchy(2.0);
	Rectangle_Figure_ClassHierarchy rectangle_classhierarchy = new Rectangle_Figure_ClassHierarchy(2.0, 2.0);
	System.out.println(2.0+":["+circle_classhierarchy.area()+"]"+":["+rectangle_classhierarchy.area()+"]");
}

}
