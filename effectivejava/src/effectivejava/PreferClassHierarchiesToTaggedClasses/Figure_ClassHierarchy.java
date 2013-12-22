/**
 * This code is copied and edited from Effective Java
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package effectivejava.PreferClassHierarchiesToTaggedClasses;

//Class hierarchy replacement for a tagged class//IMPROVED VERSION
abstract class Figure_ClassHierarchy {
	abstract double area();
}

class Circle_Figure_ClassHierarchy extends Figure_ClassHierarchy {
	final double radius;
	Circle_Figure_ClassHierarchy(double radius) { this.radius = radius; }
	double area() { return Math.PI * (radius * radius); }
}

class Rectangle_Figure_ClassHierarchy extends Figure_ClassHierarchy {
	final double length;
	final double width;
	Rectangle_Figure_ClassHierarchy(double length, double width) {
		this.length = length;
		this.width = width;
	}
	double area() { return length * width; }
}