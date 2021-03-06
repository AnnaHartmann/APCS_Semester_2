/**
 * This program decrypts code from Caesar Cipher. 
 * This code does this by using characterKey, inputString and by 
 * lower casing the code to make sure there isn't any mix ups with letters. 
 * 
 * @author Annabel Hartmann
 * @version 2/12/2018
 */

public class CaesarShiftDecryption {
	
    public static String letters[] = new String[26]; //Initializes the letters of the alphabet (26 letters)
   
    public String CaesarConverter(String inputString) {
    	
        char characterKey[] = new char[inputString.length()];
        String base = inputString.toLowerCase();
        for(int i=0;i<inputString.length();i++) {
            characterKey[i] = base.charAt(0);
            base = base.substring(1);
        }
        
        for(int j=0;j<inputString.length();j++) {
            if(characterKey[j] == ' ') {
                System.out.print(" ");
            } else if(characterKey[j] == 'a') {
                System.out.print("x");
            } else if(characterKey[j] == 'b') {
                System.out.print("y");
            } else if(characterKey[j] == 'c') {
                System.out.print("z");
            } else {
                System.out.print((char)(characterKey[j] - 3));
            }
        }   
        return "";
    }
}