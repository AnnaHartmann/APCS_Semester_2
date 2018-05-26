/**
 * This code is to print out the end results after you input the phrase you want to test for a palindrome. 
 * In this is I call recusive code, I also added a print statement of what the code creates after it runs
 * through the palindrome helper. 
 *
 * @author Annabel Hartmann
 * @version 1/24/18
 */
import java.util.Scanner;

public class RecursivePalindromeTester {
	public static void code(){
		
		Scanner in = new Scanner(System.in);
		RecursivePalindrome palindrome = new RecursivePalindrome();
		System.out.print(" > ");
		String phrase = in.nextLine();
		
		if (phrase.equalsIgnoreCase("quit")) {
			System.out.println("Have a nice day!");
		} else {
			Boolean palindromeBool = palindrome.palindromeHelper(phrase);
			if (palindromeBool) {
				System.out.println("It tis! The phrase \"" + phrase + "\" is a palindrome!");
				System.out.println();
				code();
			} else {
				System.out.println("Uh Oh! The phrase \"" + phrase + "\" is not a palindrome!");
				System.out.println();
				code();
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println("                           Palindrome Tester                          ");
		System.out.println("~--------------------------------------------------------------------~");
		System.out.println("Do you want to know if that phrase you're thinking of is a palindrome?");
		System.out.println("Then enter it here!");
		System.out.println("To end the code please type \"quit\"!");
		System.out.println();
		code();
	}

}