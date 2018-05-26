/**
 * This code is the format of all the other code;
 * product,vehicle,car,truck and tool. This uses
 * a list to compile all the information needed 
 * for the correct output. 
 * 
 * @author Annabel Hartmann
 * @version 2/28/2018
 */

import java.util.ArrayList;

public class InventoryDemo {
	
	public static ArrayList<Product> products = new ArrayList<Product>();
    public static void main(String[] args){
    	
    	Car car1 = new Car("Jaguar", 1000000.00);
        Car car2= new Car("Neon", 17000.00);
        Tool saw1 = new Tool("JigSaw", 149.18);
        Car car3 = new Car("Jaguar", 110000.00);
        Car car4 = new Car("Neon", 17500.00);
        Car car5 = new Car("Neon", 17875.32);
        Truck truck1 = new Truck("RAM", 35700.00);
        Tool saw2 = new Tool("CircularSaw", 200.00);
        Tool saw3 = new Tool("CircularSaw", 150.00);
                        
        products.add(car1);
        products.add(car2);
        products.add(saw1);
        products.add(car3);
        products.add(car4);
        products.add(car5);
        products.add(truck1);
        products.add(saw2);
        products.add(saw3);
                        
        takeInventory("JigSaw");
        takeInventory("Neon");
        takeInventory("Jaguar");
        takeInventory("RAM");
        takeInventory("CircularSaw");
        
        if (saw1.compareTo(saw2) == 1){
        	System.out.println("The first saw is more expensive");
         } else if (saw1.compareTo(saw2) == 0){
             System.out.println("The saws are the same price.");
             }else{
            	 System.out.println("The second saw is more expensive");
               }                    	
    }

    public static void takeInventory(String name) {
    	int c = 0;
        double totalCost = 0.0;
        
        for(Product prod : products) {
        	if(prod.getName().equalsIgnoreCase(name)) {
        		c++;
                totalCost += prod.getCost();
                }
        	}
        System.out.println(name + ": Quantity = " + c + ", Total Cost = " + totalCost);
        }                      
}