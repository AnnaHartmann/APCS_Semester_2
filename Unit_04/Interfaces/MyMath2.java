/**
 * This is the MyMath code, this extends Homework2
 * however this code does implements the doReading() method. 
 * It also subtracts 2 pages from the current page count.  
 * 
 * @author Annabel Hartmann
 * @version 2/26/2018
 */

public class MyMath2 extends Homework2 implements Processing
{
    MyMath2() {
	}
	
	public void createAssignment(int p) {
		setReadPages(p);
		setHwType("Math");
	}
	
	public void doReading() 
    {
        this.pagesRead -= 2;  // subtract 2 from the current page count.
    }
	
	public String toString() {
		return "Be sure to read " + getReadPages() + " pages for your " + getHwType() + " homework!";
	}
}