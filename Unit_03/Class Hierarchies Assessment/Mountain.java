/**
 * This program is to utilize super() functions along with "this." functions. 
 * 
 * @author Annabel Hartmann
 * @version 2/1/18
 */
public class Mountain extends Terrain{
	private int mountains;
	
	Mountain(int l, int w, int mountains) {
		super(l, w);
		this.mountains = mountains;
	}
	
	public static void mountains(int l, int w, int mountains){
		System.out.print("Mountain Land has dimensions " + l + " X " + w + " and has " + mountains + " mountains");
	}
}
