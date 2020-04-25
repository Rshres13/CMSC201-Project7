
/*
/ * Class: CMSC201 
 * Instructor: Dr. Grigoriy Grinberg
 * Description: Circle2D Test
 * Due: 03/29/2020
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Ramita Shrestha
*/
public class TestCircle2D {
    // Main method
	public static void main(String[] args) {
		Circle2D c1 = new Circle2D (2, 3, 2.5);
		Circle2D c2 = new Circle2D (4, 5, 10.5);
		Circle2D c3 = new Circle2D (3, 5, 2.3);
		// Display result 
		System.out.println("Area of Circle [c1]: " + c1.getArea());
		System.out.println("Perimeter of Circle [c1]: " + c1.getPerimeter());
		System.out.println("Does point (3, 3 ) contain in Circle [c1]: " + c1.contains(3,3));
		System.out.println("Does circle (4, 5, 10.5) contain in Circle [c1]: " + c1.contains(c2));
		System.out.println("Does circle (3, 5, 2.3) overlap over Circle [c1]: " + c1.overlaps(c3));

	}

}
