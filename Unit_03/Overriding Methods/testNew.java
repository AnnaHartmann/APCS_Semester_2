/**
 * This program "testNew" is to format the information created from Rectangle3, Box3 and Cube3. 
 * This code also allows me to practice the use of equals() method and the showEffectBoth() method.
 * 
 * @author Annabel Hartmann
 * @version 2/5/18
 */
public class testNew {
	
	public static void main() {
		Rectangle3 rect = new Rectangle3(5, 20); //input information for rectangle3
		Box3 boxA = new Box3(4, 4, 4); //input information for the first version of box3
		Box3 boxB = new Box3(4, 10, 5); //input information for the second version of box3
		Cube3 cube = new Cube3(4, 4, 4); //input information for cube3
		
		//showEffectBoth() method used for each initialized version of the classes
		showEffectBoth(rect);
		showEffectBoth(boxA);
		showEffectBoth(boxB);
		showEffectBoth(cube);
		
		//equals() method used to compare the box3(s) to the cube3 information
		equals(boxA, cube);
		equals(boxB, cube);
	}
	
	public static void showEffectBoth(Rectangle3 r) { //print statement for Rectangle3 for showEffectBoth()
		System.out.println(r);
	}
	
	public static void equals(Rectangle3 r1, Rectangle3 r2) { //equals method to check weather the rectangles are equal and stating when they are the same size. 
		String subR1 = r1.toString();
		String subR2 = r2.toString();
		
		int subR1Index = subR1.indexOf("-") + 2;
		int subR2Index = subR2.indexOf("-") + 2;
		
		subR1 = subR1.substring(subR1Index);
		subR2 = subR2.substring(subR2Index);
		
		if (subR1.equals(subR2)) {
			System.out.println(subR1 + " is the same size as " + subR2);
			
		} else {
			System.out.println(subR1 + " is not the same size as " + subR2);
			
		}
		
	}
	
	public static void main(String[] args) { //prints the information from main() method
		main();
	}
}