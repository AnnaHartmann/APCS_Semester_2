/**
 * This is MyEnglish2.java and it extends the Homework2 
 * class and implements the doReading() method from Processing!
 * This class subtracts 1 page from the courage page count
 * 
 * @author Annabel Hartmann
 * @version 2/26/2018
 */

public class MyEnglish2 extends Homework2 implements Processing
{
	MyEnglish2() {
	}
	
	public void createAssignment(int p) {
		setReadPages(p);
		setHwType("English");
	}
	
	public void doReading() 
    {
        this.pagesRead -= 1;  // subtract 1 from the current page count.
    }
	
	public String toString() {
		return "Be sure to read " + getReadPages() + " pages for your " + getHwType() + " homework!";
	}

}