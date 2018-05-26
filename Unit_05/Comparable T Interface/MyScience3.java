/**
 * This is MyScience3.java and it extends the Homework3 
 * class and implements the doReading() method from the last
 * however also uses return statements to make sure that the correct
 * number of pages is printed.This class subtracts 3 pages from the reading count
 * 
 * @author Annabel Hartmann
 * @version 2/28/2018
 */

public class MyScience3 extends Homework3{
	
	MyScience3() {
	}
	
	public void createAssignment(int p) {
		setReadPages(p);
		setHwType("Science");
	}

	public int doReading() {
        return pagesRead -= 3;  // subtract 3 from the current page count.
    }
	
	public String toString() {
		return "Be sure to read " + doReading() + " pages for your " + getHwType() + " homework!";
	}
}