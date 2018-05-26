/**
 * This code is to practice the use of ploymorph methods and functions along with referencing the Box and Cube code. 
 *
 * @author Annabel Hartmann
 * @version 1/31/18
 */
public class TestCube {
    public static void main (String []args) {
            Box one = new Box(2, 4, 5);
            Cube two = new Cube(3, 3, 3);
            
            System.out.println("~Cube~");
            polyMorph(one);
            polyMorph(two);
            
    }
        
    public static void polyMorph(Box r) {
        System.out.println("One's dimensions are: " + r.getLength() + " x " + r.getWidth());
        System.out.println("");

    }
        
    public static void polyMorph(Cube r) {
       System.out.println("Cubes's dimensions are: " + r.getLength() + " x " + r.getWidth() + " x " + r.getHeight());

    }
}
