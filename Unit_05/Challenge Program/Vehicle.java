/**
 * This class implements product and
 * appropriately creates the getName()
 * and getCost() along with initializing 
 * the name and cost. 
 * 
 * @author Annabel Hartmann
 * @version 2/28/2018
 */

public abstract class Vehicle implements Product {
	private String name;
	private double cost;
	
	public Vehicle (String name, double cost){
		this.name = name;
		this.cost = cost;
	}
	
	public String getName(){
		return name;
	}
	
	public double getCost(){
		return cost;
	}
}