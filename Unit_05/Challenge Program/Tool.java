/**
 * This code is the tool code and it extends the Product and 
 * Comparable<Tool> it utilizes compareTo and correctly creates
 * getName and getCost
 * 
 * @author Annabel Hartmann
 * @version 2/28/2018
 */

public class Tool implements Product, Comparable<Tool> {
	
	private String name;
	private double cost;
	
	public Tool(String name, double cost){
		this.name = name;
		this.cost = cost;
	}
	
	public String getName(){
		return name;
	}
	
	public double getCost(){
		return cost;
	}
	
    public int compareTo(Tool obj){
    	if(cost > obj.cost){
    		return 1;
    	}
    	else if(cost == obj.cost){
    		return 0;
    	}
    	else return -1;
    }


}