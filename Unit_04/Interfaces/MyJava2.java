/**
 * This is MyScience2.java and it extends the Homework2 
 * class and implements the doReading() method from Processing!
 * This class subtracts 4 pages from the current page count
 * 
 * @author Annabel Hartmann
 * @version 2/26/2018
 */

public class MyJava2 extends Homework2 implements Processing {
	
	MyJava2() {
	}
	
	public void createAssignment(int p) {
		setReadPages(p);
		setHwType("Java");
	}
	
	public void doReading() {
        this.pagesRead -= 4;  // subtract 4 from the current page count.
    }
	
	public String toString() {
		return "Be sure to read " + getReadPages() + " pages for your " + getHwType() + " homework!";
	}
}