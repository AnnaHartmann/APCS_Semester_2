/**
 * This is MyScience3.java and it extends the Homework3 
 * class and uses anything that is necessary from the base 
 * code from java 3. This class subtracts 4 pages from the 
 * current page count
 * 
 * @author Annabel Hartmann
 * @version 2/28/2018
 */

public class MyJava3 extends Homework3 {
	
	MyJava3() {
	}
	
	public void createAssignment(int p) {
		setReadPages(p);
		setHwType("Java");
	}
	
	public int doReading() {
        return pagesRead -= 4;  // subtract 4 from the current page count.
    }
	
	public String toString() {
		return "Be sure to read " + doReading() + " pages for your " + getHwType() + " homework!";
	}
}