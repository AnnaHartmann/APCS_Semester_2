/**
 * This class organizes all the classes and runs them as they are promted to!
 * Specifically it asks for an input from the user which it then prints out 
 * the necessary and appropriate options. (Homework Help, Joke and Quit)
 * 
 * @author Annabel Hartmann
 * @version 2/26/2018
 */

import java.util.Scanner;
public class testHomework2 {
	
    public static void main(String[]args) { 
    	Scanner in = new Scanner(System.in);
    			
    	MyEnglish2 eng = new MyEnglish2();
   		MyJava2 java = new MyJava2();
   		MyMath2 math = new MyMath2();
   		MyScience2 sci = new MyScience2();

   		System.out.println("Welcome Student, Teacher or Parent to Homework Hacker!");
   		System.out.println("This is a tracker for homework! I am Bobo!");
   		System.out.println("What would you like to do?");
   		System.out.println("------------------------------------------------------");
   		System.out.println("1 - Homework Hacker \n2 - Joke for Motiavtion \n3 - Quit");
   		int option = in.nextInt();
    			
    	if (option == 1) {
    		
    		System.out.println("Please tell Bobo How many pages of English you must study!");
    		int ePages = in.nextInt();
    		System.out.println("Please tell Bobo How many pages of Java you must study!");
    		int jPages = in.nextInt();
    		System.out.println("Please tell Bobo How many pages of Mathematics you must study!");
   			int mPages = in.nextInt();
   			System.out.println("Please tell Bobo How many pages of Science you must study!");
   			int sPages = in.nextInt();
 
   			System.out.println("------------------------------------------------------");
    			
   			System.out.println("Before reading:");
   	        eng.createAssignment(ePages);
   	        System.out.println(eng.toString());
    	    System.out.println("After reading:");
   	        eng.doReading();
            System.out.println(eng.toString());
    	        
   	        System.out.println("Before reading:");
            java.createAssignment(jPages);
    	    System.out.println(java.toString());
   	        System.out.println("After reading:");
   	        java.doReading();
   	        System.out.println(java.toString());
    	        
   	        System.out.println("Before reading:");
   	        math.createAssignment(mPages);
            System.out.println(math.toString());
    	    System.out.println("After reading:");
   	        math.doReading();
   	        System.out.println(math.toString());
    	        
    	    System.out.println("Before reading:");
    	    sci.createAssignment(sPages);
            System.out.println(sci.toString());
            System.out.println("After reading:");
   	        sci.doReading();
   	        System.out.println(sci.toString());
   	        
   	        System.out.println("Bobo wishes you have a good day!");
    			
    	} else if (option == 2) {
    				
    		System.out.println("Teacher: Patrick where is your homework?");
    		System.out.println("Patrick: My dog ate it.");
    		System.out.println("Teacher: Your \"dog\" ate your coding homework?");
    		System.out.println("Patrick: I mean if I'm being honest he just took a huge byte out of it.");
    			
    	} else if (option == 3) {
    				
    		System.out.println("Bobo wishes you have a good day!");
    		
    	} else {
    				
    		System.out.println("Error Invalid Input");
    	}		
    }
}