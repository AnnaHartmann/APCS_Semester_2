/**
 * This code encrypts normal English text into encrypted Caesar Cipher text.
 * This code uses characterKey, if else-if statements and inputString
 * along with using .toLowerCase() to make sure the conversion doesn't mix up any letters. 
 * 
 * @author Annabel Hartmann
 * @version 2/12/2018
 */

public class CaesarShiftEncryption {
	
    CaesarShiftEncryption(){
    }
    
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
            } else if(characterKey[j] == 'x'){
                System.out.print("a");
            } else if(characterKey[j] == 'y') {
                System.out.print("b");
            } else if(characterKey[j] == 'z') {
                System.out.print("c");
            } else {
                System.out.print((char)(characterKey[j] + 3));
            }
        }   
        return "";
    }
}