/**
 * This code formats my other code while creating a program that takes a "secret agent" pin 
 * along with formatting the code to have a bit of fun bits and do what the other two codes need
 * a display for! 
 * 
 * @author Annabel Hartmann
 * @version 2/13/2018
 */

import java.util.Scanner;
public class HanCipherTester {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        
        HanCipher encrypt = new HanCipher();
        HanDecipher decrypt = new HanDecipher();
        
        System.out.println("Booting up... \n");
        System.out.println("Welcome Agent. Please Input your Agent # (Ex. 0103)");
        int code = in. nextInt();
        System.out.println("Ah! Agent #" + code + " What can I do for you today?");
        System.out.println("1) Encrypt English Text to Caeser Cipher");
        System.out.println("2) Decrypt Caesar Ciphered Text to English Text");
        System.out.println("3) Joke? ");
        System.out.println("4) Exit Program \n");
        System.out.print(" > ");
        int input = in.nextInt();
        in.nextLine();
        
        if(input == 1) {
            System.out.println("Got it! Please insert the text you want to encrypt then Chap!");
            System.out.print(" > ");
            String encryptText = in.nextLine();
            System.out.println("Righty-ho! Coming right up for you Agent #" + code + "\n");
            System.out.print("Output: ");
            encrypt.HanConverter( encryptText);
            System.out.println("\n Have a nice day!");
            
        } else if(input == 2) {
            System.out.println("10-4, Please insert the encryption that you want decrypted!");
            System.out.print(" > ");
            String decryptText = in.nextLine();
            System.out.println("Righty-ho! Coming right up for you Agent #" + code + "\n");
            System.out.print("Output: ");
            decrypt.HanConverter(decryptText);
            System.out.println("\n Have a nice day!");
            
        } else if(input == 3) {
            System.out.println("I am a program that's meant to encrypt and decrypt code not make jokes!");
            
        } else if(input == 4) {
        	System.exit(0);
        	
    	} else {
        	System.out.println("Sorry you didn't input an accepted option. Please Reboot and try again.");
        }
    }
}