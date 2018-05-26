/**
 * This class organizes all the classes and runs them as the should.
 * Specifically it takes an array of pages that is created in the code
 * does the mathematical equations and prints them out. Then they also 
 * compare the page amount from the English and math homework. 
 * 
 * @author Annabel Hartmann
 * @version 2/28/2018
 */

import java.util.Scanner;
import java.util.*;
public class testHomework3 {
	
    public static void main(String[]args) { 
    	Scanner in = new Scanner(System.in);
    	
    	List<Homework3> hw = new ArrayList<Homework3>();
    	
   		MyMath3 math = new MyMath3();
   		math.createAssignment(6);
   		MyScience3 sci = new MyScience3();
   		sci.createAssignment(9);
   		MyEnglish3 eng = new MyEnglish3();
    	eng.createAssignment(5);
   		MyJava3 java = new MyJava3();
   		java.createAssignment(9);
   		
   		System.out.println("Welcome Student, Teacher or Parent to Homework Hacker!");
   		System.out.println("This is a tracker for homework! I am Bobo!");
   		System.out.println("What would you like to do?");
   		System.out.println("------------------------------------------------------");
   		System.out.println("1 - Homework Hacker \n2 - Joke for Motiavtion \n3 - Quit");
   		int option = in.nextInt();
    			
    	if (option == 1) {
 
   			System.out.println("------------------------------------------------------");
   			
   			hw.add(math);
   			hw.add(sci);
   			hw.add(eng);
   			hw.add(java);
   	      
   	        for (Homework3 inner : hw) {;
   	            System.out.println(inner);
   	        }
   	           if (math.compareTo(eng) == 0 ) {

   		       System.out.println("\nThe homework for math and english are the same number of pages.");

   	           } else if (math.compareTo(eng) == 1) {

   		       System.out.println("\nThe homework for math has more number of pages than english.");
   	           } else if (math.compareTo(eng) == -1) {
   	        
   	        	   System.out.println("\nThe homework for math has more number of pages than english.");
   	           }
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