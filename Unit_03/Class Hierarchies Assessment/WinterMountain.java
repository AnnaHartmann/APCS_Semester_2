/**
 * This program is to utilize super() functions along with "this." functions and how to add new attributes from prior code. 
 * 
 * @author Annabel Hartmann
 * @version 2/1/18
 */
public class WinterMountain extends Mountain{
	private double temp;
	WinterMountain(int l, int w, int mountains, double t){
		super(l, w, mountains);
		temp = t;
	}
	
	public static void winterMT(int l, int w, int mountains, double t){
		System.out.print("Welcome to Snowdin! This place is " + l + " X " + w + "! Looks like the temperature is " + t + "! Look at all " + mountains + " of those mountains!");
	}
}
