/**
 * This code is to format all my previous code, while I could have probably done this with polymorph I preferred doing it this way.
 * This code is also so I can practice the use of hierarchies and see how they interact. 
 * 
 * @author Annabel Hartmann
 * @version 2/1/18
 */
import java.util.Scanner;
public class TestTerrain {
	public static void main (String []args) {
		Scanner in = new Scanner(System.in);
		
		//Forest Land
		System.out.println("Let's create a map!");
		System.out.println("Please insert the length and width of Windhelm*! (Example: 100 200)");
		System.out.print(" > ");
		int lengthF = in.nextInt();
		int widthF = in.nextInt();
		System.out.println("Please insert the # of trees you'd like Windhelm to have");
		System.out.print(" > ");
		int treesF = in.nextInt();
		Forest.forest(lengthF, widthF, treesF);
		System.out.println("\n");
		
		//Mountain Land
		System.out.println("Let's create another map! Let's do a Mountain Map!");
		System.out.println("Please insert the length and width of the Mountain Land! (Example: 100 200)");
		System.out.print(" > ");
		int lengthMT = in.nextInt();
		int widthMT = in.nextInt();
		System.out.println("Please insert the # of mountains in Mountain Land!");
		System.out.print(" > ");
		int mountainMT = in.nextInt();
		Mountain.mountains(lengthMT, widthMT, mountainMT);
		System.out.println("\n");
		
		//Winter Mountain Land
		System.out.println("Let's create a map of Snowdin* w/ weather!");
		System.out.println("Please insert the length and width of the Winter Mountain Terrain! (Example: 100 200)");
		System.out.print(" > ");
		int lengthWMT = in.nextInt();
		int widthWMT = in.nextInt();
		System.out.println("Please insert the temperature of the Mountain Land!");
		System.out.print(" > ");
		double tempWMT = in.nextInt();
		System.out.println("Please insert the # of mountains you would like!");
		System.out.print(" > ");
		int mountainWMT = in.nextInt();
		WinterMountain.winterMT(lengthWMT, widthWMT, mountainWMT, tempWMT);
		System.out.println("\n");
		
		System.out.println("~Full Output~");
		Forest.forest(lengthF, widthF, treesF);
		System.out.println();
		Mountain.mountains(lengthMT, widthMT, mountainMT);
		System.out.println();
		WinterMountain.winterMT(lengthWMT, widthWMT, mountainWMT, tempWMT);
		System.out.println();
		System.out.println("\n");
		System.out.println("*Windhelm is a place in Skyrim");
		System.out.println("*Snowdin is a place in Undertale");
	}

}
