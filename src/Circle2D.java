/*
/ * Class: CMSC201 
 * Instructor: Dr. Grigoriy Grinberg
 * Description: Define the Circle2D class that contains: 
•	Two double data fields named x and y that specify the center of the circle with get methods.
•	A data field radius with a get method.
•	A no-arg constructor that creates a default circle with (0, 0) for (x, y) and 1 for radius.
•	A constructor that creates a circle with the specified x, y, and radius.
•	A method getArea() that returns the area of the circle.
•	A method getPerimeter() that returns the perimeter of the circle.
•	A method contains(double x, double y) that returns true if the specified point (x, y) is inside this circle. See Figure 10.14(a).
•	A method contains(Circle2D circle) that returns true if the specified circle is inside this circle. See Figure 10.14(b).
•	A method overlaps(Circle2D circle) that returns true if the specified circle overlaps with this circle. 
 * Due: 03/29/2020
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Ramita Shrestha
*/

public class Circle2D {
	/** Data Fields */
	private double x, y, r;
	/** Create a default Circle 2D with (0, 0) for (x, y) and 1 for r which is radius */
	public Circle2D() {
		this(0, 0, 1);

	}
	/** Create a Circle2D with specified x,y, and r which is radius*/
	public Circle2D(double x, double y, double r) {
		this.x = x;
		this.y = y;
		this.r = r;	
	}
	/** Return the area of the circle */
	public double getArea() {
		return Math.PI * r * r;
	}
	/** Return the perimeter of the circle */
	public double getPerimeter() {
		return 2 * Math.PI * r;
	}
	/** Return true if the specified point (x, y) is inside this circle */
	public boolean contains(double x, double y) {
		// distance < r1
		double distanceToCenter = getDistanceToCenter(x, y);
		return distanceToCenter < this.getR();
	}

	public boolean contains(Circle2D circle) {
		// distance < r1 - r2
		double distanceToCenter = getDistanceToCenter(circle.getX(), circle.getY());
		return distanceToCenter < this.r - circle.getR();
	}
	/** Return true if the specified circle overlaps with this circle */
	public boolean overlaps(Circle2D circle) {
		// distance <= r1 + r2
		double distanceToCenter = getDistanceToCenter(circle.getX(), circle.getY());
		return distanceToCenter <= this.r + circle.getR();
	}
	/** Return x */
	public double getX() {
		return x;
	}
	/** Return y */
	public double getY() {
		return y;
	}
	/** Return r */
	public double getR() {
		return r;
	}

	private double getDistanceToCenter(double x1, double y1) {
		// Distance better two points = Math.sqrt ((x1- x2) * (x1 - x2) + (y1 - y2) * (y1
		// - y2))
		double x1x2 = this.x - x1;
		double y1y2 = this.y - y1;
		return Math.sqrt(x1x2 * x1x2 + y1y2 * y1y2);
	}

}
