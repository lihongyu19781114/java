/**
 * This code is copied and edited from Effective Java
 * @author lihongyu19781114@homail.com
 * You can use and change this program as you wish.
 * There is no warranty for this free software.
 * Please report any bugs to the author.
 */

package effectivejava.PreferClassHierarchiesToTaggedClasses;

//Tagged class - vastly inferior to a class hierarchy!//DON'T DO THIS!
class Figure_TaggedClass {
	enum Shape { RECTANGLE, CIRCLE };
	// Tag field - the shape of this figure
	final Shape shape;
	// These fields are used only if shape is RECTANGLE
	double length;	double width;
	// This field is used only if shape is CIRCLE
	double radius;
	// Constructor for circle
	Figure_TaggedClass(double radius) {
		shape = Shape.CIRCLE;	this.radius = radius;
	}
	// Constructor for rectangle
	Figure_TaggedClass(double length, double width) {
		shape = Shape.RECTANGLE;	this.length = length;	this.width = width;
	}
	double area() {
		switch(shape) {
		case RECTANGLE:	return length * width;
		case CIRCLE:	return Math.PI * (radius * radius);
		default:		throw new AssertionError();
		}
	}
}
