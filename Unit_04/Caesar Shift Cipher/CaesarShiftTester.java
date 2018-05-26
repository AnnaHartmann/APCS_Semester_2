/**
 * This code formats the code from the other two java codes (CaesarShiftEncryption + CaesarShiftDecryption) 
 * There isn't much that is special in this code other than that it formats everything from previous codes. 
 * 
 * @author Annabel Hartmann
 * @version 2/12/2018
 */

import java.util.Scanner;
public class CaesarShiftTester {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        
        CaesarShiftEncryption encrypt = new CaesarShiftEncryption();
        CaesarShiftDecryption decrypt = new CaesarShiftDecryption();
        
        System.out.println("- The Caesar Shifter 900 -");
        System.out.println("Booting up... \n");
        System.out.println("Welcome to the Caesar Shifter 900. What would you like to do today?");
        System.out.println("1) Encrypt English Text to Caeser Cipher");
        System.out.println("2) Decrypt Caesar Ciphered Text to English Text");
        System.out.println("3) Exit Program \n");
        System.out.print(" > ");
        int input = in.nextInt();
        in.nextLine();
        
        System.out.println("One moment please... \n");
        
        if(input == 1) {
            System.out.println("You chose \"Encrypt English Text to Caeser Cipher\" ");
            System.out.println("Please insert the phrase you want to encrypt");
            System.out.print(" > ");
            String encryptText = in.nextLine();
            System.out.print("Your encrypted text is ");
            encrypt.CaesarConverter(encryptText);
            System.out.print("\n");
            System.out.println(" Have a nice day!");
            
        } else if(input == 2) {
        	System.out.println("You chose \"Decrypt Caesar Ciphered Text to English Text\" ");
            System.out.println("Please insert the phrase you want to decrypt, without puncation");
            System.out.print(" > ");
            String decryptText = in.nextLine();
            System.out.print("Your encrypted text is ");
            decrypt.CaesarConverter(decryptText);
            System.out.print("\n");
            System.out.println(" Have a nice day!");
            
        } else if(input == 3) {
            System.exit(0);
        } else {
        	System.out.println("Sorry you didn't input an accepted option. Please Reboot and try again.");
        }
    }
}