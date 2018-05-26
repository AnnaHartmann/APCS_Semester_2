/**
 * This code is to practice the use of super(), math.sqrt. 
 *
 * @author Annabel Hartmann
 * @version 1/31/18
 */
public class IsoscelesRight extends Triangle {
	private double sideA;
	private double sideB;
	private double sideC;
	
	public IsoscelesRight(double a, double b, double c) {
		super(a,b,c);
		sideA = a;
		sideB = a;
		sideC = c ;
	}
	
	public double getSideC() {
		double c = sideA * Math.sqrt(2);
		return c;
	}
}
