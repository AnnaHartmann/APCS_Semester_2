/**
 * This is MyScience2.java and it extends the Homework2 
 * class and implements the doReading() method from Processing!
 * This class subtracts 3 pages from the reading count
 * 
 * @author Annabel Hartmann
 * @version 2/26/2018
 */

public class MyScience2 extends Homework2 implements Processing{
	
	MyScience2() {
	}
	
	public void createAssignment(int p) {
		setReadPages(p);
		setHwType("Science");
	}

	public void doReading() 
    {
        this.pagesRead -= 3;  // subtract 3 from the current page count.
    }
	
	public String toString() {
		return "Be sure to read " + getReadPages() + " pages for your " + getHwType() + " homework!";
	}
}