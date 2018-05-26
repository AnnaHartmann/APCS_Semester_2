/**
 * This is MyEnglish3.java and it extends the Homework3
 * class and uses the code already in Homework3. This
 * code also subtracts 1 page from the page count. 
 * 
 * @author Annabel Hartmann
 * @version 2/28/2018
 */

public class MyEnglish3 extends Homework3 {
	
	MyEnglish3() {
	}
	
	public void createAssignment(int p) {
		setReadPages(p);
		setHwType("English");
	}
	
	public int doReading() 
    {
       return pagesRead -= 1;  // subtract 1 from the current page count.
    }
	
	public String toString() {
		return "Be sure to read " + doReading() + " pages for your " + getHwType() + " homework!";
	}

}