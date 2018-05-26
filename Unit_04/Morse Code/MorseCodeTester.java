/**
 * This code calls for the input from the user and then calls the MorseCode.java to convert it into morse code.
 * This code then outputs the morse code and formats what was in the MorseCode.java
 * 
 * @author Annabel Hartmann
 * @version 2/8/2018
 */ 

import java.util.Scanner;
import java.io.*;

public class MorseCodeTester {
   
	public static void main(String [] args) throws IOException { 
       Scanner in = new Scanner(System.in);
       System.out.println("Hello Agent. Please enter your phrase.");
       System.out.println("*No puncuation is required.");
       System.out.print(" > ");
       String toMorse = in.nextLine();
       
       MorseCode m = new MorseCode(toMorse);
       m.read();
       m.Convert();
       System.out.println("Here you go Agent:");
       System.out.println(m.getPhraseSolved());
       System.out.println("Have a great day, Agent!");
   }
}