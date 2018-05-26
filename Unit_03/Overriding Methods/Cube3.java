/**
 * This program uses a super class to use the information from the Box3 code. 
 * 
 * 
 * @author Annabel Hartmann
 * @version 2/5/2018
 */
public class Cube3 extends Box3 {
	private int length, width, height;
	
	public Cube3(int l, int w, int h) {
		super(l, w, h);
		length = l;
		width = w;
		height = h;
	}
	
	public String toString() {
		String d =  "Cube 3 - " + length + " X " + width +" X " + height;
		return d;
	}


}