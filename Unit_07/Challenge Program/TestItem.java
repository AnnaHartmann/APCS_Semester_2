/**
 * This code follows the TestItem instructions and uses sort and merge methods. 
 * This code has methods first and them the main method last. It has a nice 
 * message at the end as well. This code takes the general code from the Item class
 * and formats it here as well. 
 * 
 * 
 * @author Annabel Hartmann
 * @version 3/20/18
 */


public class TestItem {
	
	public static void printInventory(Item[] hardware)	{ //printInventory START
		
		System.out.println(" itemID    itemName    inStore    price");
		System.out.println("________________________________________");
		
		for (Item item : hardware) {
			System.out.println(item);
		}
	} //printInventory END
	
	public static void sortID(Item[] hardware) { //sortID START
		
		Item[] destination = new Item[hardware.length];
		
		for (int i = 0; i < hardware.length; i++)	{
			
			Item next = hardware[i];
			int index = 0;
			int k = i;
			
			while (k > 0 && index == 0) {
				
				if (next.getItemID().compareTo(destination[k - 1].getItemID()) > 0) {
					index = k;
				} else {
					destination[k] = destination[k - 1];
				}
				k--;
			}
			destination[index] = next;
		}
		printInventory(destination);
	} //sortID END
	
	public static void sortName(Item[] hardware) { //sortName START
		Item[] destination = new Item[hardware.length];
		
		for (int i = 0; i < hardware.length; i++) {
			
			Item next = hardware[i];
			int index = 0;
			int k = i;
			
			while (k > 0 && index == 0) {
				
				if (next.getItemName().compareTo(destination[k - 1].getItemName()) < 0) {
					index = k;
				} else {
					destination[k] = destination[k - 1];
				}
				k--;
			}
			destination[index] = next;
		}
		printInventory(destination);
	} //sortName END
	
	public static void sortInStore(Item[] hardware, int sortType) { //sortInStore START
		int i;
		int k;
		int posmax;
		Item temp;
		
		for (i = hardware.length - 1; i >= 0; i--) {
			
			posmax = 0;
			
			for (k = 0; k <= i; k++) {
				
				if (sortType == 2) {
					if (hardware[k].getInStore() < hardware[posmax].getInStore())
						posmax = k;
				} else {
					if (hardware[k].getInStore() > hardware[posmax].getInStore())
						posmax = k;
				}
			}
			temp = hardware[i];
			hardware[i] = hardware[posmax];
			hardware[posmax] = temp;
		}
	} //sortInStore END
	
	public static void sortPrice(Item[] x, int low, int high) { //sortPrice START
		
		if (low == high)
			return;
		
		int mid = (low + high) / 2;
		
		sortPrice(x, low, mid);
		sortPrice(x, mid + 1, high);
		
		mergePrice(x, low, mid, high);
	} //sortPrice END
	
	public static void mergePrice(Item[] x, int low, int mid, int high)	{ //mergePrice START
		
		Item[] temp = new Item[high - low + 1];
		
		int i = low, j = mid + 1, n = 0;
		
		while (i <= mid || j <= high) {
			
			if (i > mid) {
				
				temp[n] = x[j];
				j++;
			} else if (j > high) {
				temp[n] = x[i];
				i++;
			} else if (x[i].getPrice() > x[j].getPrice()) {
				temp[n] = x[i];
				i++;
			} else {
				temp[n] = x[j];
				j++;
			}
			n++;
		}
		
		for (int k = low; k <= high; k++)
			x[k] = temp[k - low];
		
	} //mergePrice END
	
	public static void main(String[] args) { //main START
		
		Item[] hardware = new Item [6]; 
				
		hardware[0] = new Item("1011", "Air Filters", 200, 10.5);
		hardware[1] = new Item("1034", "Door Knobs", 60, 21.5);
		hardware[2] = new Item("1101", "Hammers", 90, 9.99);
		hardware[3] = new Item("1600", "Levels", 80, 19.99);
		hardware[4] = new Item("1500", "Ceiling Fans", 100, 59);
		hardware[5] = new Item("1201", "Wrench Sets", 55, 80);
		
		
		System.out.println("Original Array: ");
		printInventory(hardware);
		System.out.println();
		
		System.out.println("Sorted by ID: ");
		sortID(hardware);
		System.out.println();
		
		System.out.println("Sorted by Name: ");
		sortName(hardware);
		System.out.println();
		
		System.out.println("Sorted By inStore: ");
		sortInStore(hardware, 1);
		printInventory(hardware);
		System.out.println();
		
		System.out.println("Sorted by Price: ");
		sortPrice(hardware, 0, hardware.length - 1);
		printInventory(hardware);
		
		System.out.println();
		System.out.println("Have as nice day!");
	} //main END
}