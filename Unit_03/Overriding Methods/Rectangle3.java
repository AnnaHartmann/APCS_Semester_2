/**
 * Rectangle2 demo
 * 
 * ©FLVS 2007
 * @author R. Enger 
 * @version 5/6/2007
 */
public class Rectangle3 {
	private int length;
	private int width;

	/**
	 * Constructor for objects of class rectangle
	 */
	public Rectangle3(int l, int w) {
		length = l;
		width = w;
	}

	public int getLength() {
		return length;
	}
	
	public int getWidth() {
	    return width;
	}
	
	public String toString() {
	    return "Rectangle - " + length + " X " + width;
	}
}
