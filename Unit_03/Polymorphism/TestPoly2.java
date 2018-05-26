/**
 * The TestPoly class is to format all our previous information 
 * taking the information from Cirle2, Cylinder 2, Oval 2 and OvalCylinder2.
 * It's also so I can practice polymorphism.add().
 * 
 * @author Annabel Hartmann
 * @version 2/2/2018
 */

import java.util.ArrayList;
public class TestPoly2 {
	public static void showCenter(Circle2 circle) {
        System.out.println("For " + circle + ", center is at " + circle.center() + ".");
        System.out.println();
    }
	
    public static void main(String args[]) {
        ArrayList<Circle2> polymorphism = new ArrayList<Circle2>();
        
        polymorphism.add( new Circle2(2, 4, 6) );
        polymorphism.add( new Cylinder2(10, 15, 3, 4) );
        polymorphism.add( new Oval2(25, 10, 4, 7) );
        polymorphism.add( new OvalCylinder2(40, 10, 3, 7, 10) );
        for ( Circle2 poly : polymorphism) showCenter(poly);
        System.out.println("Have a great day!");
    }
}
