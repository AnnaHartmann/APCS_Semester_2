/**
 * This program is made to initialize the sides of the triangles for the rest of the code that extends off of it. 
 *
 * @author Annabel Hartmann
 * @version 1/31/18
 */
public class Triangle {
	private double sideA;
	private double sideB;
	private double sideC;
	
	public Triangle (double a, double b, double c) {
		sideA = a;
		sideB = b;
		sideC = c;
	}
	
	public double getSideA() {
		return sideA;
	}
	
	public double getSideB() {
		return sideB;
	}
	
	public double getSideC() {
		return sideC;
	}

}
