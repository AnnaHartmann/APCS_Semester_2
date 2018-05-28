/**
 * This class stores the methods;
 * Dispenser(), Dispenser(int numOfItem, int costOfItem),
 * getCount(), getProductCost() and makeSale(). It also holds
 * the instance variables of numOfItem and cost and it makes sure
 * that the possible inputed options for the two variables are valid
 * or they throw an argument exception. 
 * 
 * @author Annabel Hartmann
 * @version 4/10/2018
 * 
 */
public class Dispenser {
	
	private int numberOfItem, cost;
	
	public Dispenser() {
		numberOfItem = 50;
		cost = 50;
	}
	
	public Dispenser(int numOfItem, int costOfItem) {
		
		if(numOfItem > 0) {
			numberOfItem = numOfItem; 
		} else {
			throw new IllegalArgumentException("This means you are paying for no candy. Why are you here if you want no candy?");
		}
		
		if(costOfItem > 0) {
			cost = costOfItem;
		} else {
			throw new IllegalArgumentException("This is a candy store! Store means you have to pay!");
		}
	}
	
	public int getCount() {
		return numberOfItem;
	}
	
	public int getProductCost() {
		return cost;
	}
	
	public void makeSale() {
		numberOfItem--;
	}
}
