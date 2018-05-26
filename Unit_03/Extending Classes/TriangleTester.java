/**
 * This program is to format the triangle,isoscelesright and equilateral codes. 
 * This is also to practice polymorph functions/methods
 *
 * @author Annabel Hartmann
 * @version 1/31/18
 */
public class TriangleTester {
    public static void main (String []args) {
        Triangle one = new Equilateral(4.0, 5.0, 6.0);
        Equilateral two = new Equilateral(5.0, 5.0, 5.0);
        IsoscelesRight three = new IsoscelesRight(1.5, 1.5, 1.5);
            
        System.out.println("~Triangles~");
        polyMorph(one);
        polyMorph(two);
        polyMorph(three);
    }
        
    public static void polyMorph(Triangle r) {
       System.out.println("Triangle has sides A = " + r.getSideA() + " B = " + r.getSideB()+ " C = " + r.getSideC());
       System.out.println("");

    }
        
    public static void polyMorph(Equilateral r) {
       System.out.println("Equilateral Triangle has sides A = " + r.getSideA() + " B = " + r.getSideB()+ " C = " + r.getSideC());
       System.out.println("");

    }
        
    public static void polyMorph(IsoscelesRight r) {
       System.out.println("Isosceles Right Triangle has sides A = " + r.getSideA() + " B = " + r.getSideB()+ " C = " + r.getSideC());
       System.out.println("");

    }
}
