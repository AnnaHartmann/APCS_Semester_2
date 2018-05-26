/**
 * This is the MyMath3 code, this extends Homework3
 * due to the fact that it extends homework3 I don't
 * have to repeat code and it also modifies the 
 * doReading() method so that way I can use it easily in it's output!
 * 
 * @author Annabel Hartmann
 * @version 2/28/2018
 */

public class MyMath3 extends Homework3 {
  
	MyMath3() {
	}
	
	public void createAssignment(int p) {
		setReadPages(p);
		setHwType("Math");
	}
	
	public int doReading()  {
        return pagesRead -= 2;  // subtract 2 from the current page count.
    }
	
	public String toString() {
		return "Be sure to read " + doReading() + " pages for your " + getHwType() + " homework!";
	}
}