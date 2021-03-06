/**
 * This program decrypts code from Han-abet to the normal and boring
 * alphabet to decode your phrase.
 * 
 * @author Annabel Hartmann
 * @version 2/13/2018
 */

public class HanDecipher {
	
	HanDecipher() {
		
	}

    public static String letters[] = new String[26]; //Initializes the letters of the alphabet (26 letters)
   
    public String HanConverter(String inputString) {
    	
        char characterKey[] = new char[inputString.length()];
        String base = inputString.toLowerCase();
        for(int i=0;i<inputString.length();i++) {
            characterKey[i] = base.charAt(0);
            base = base.substring(1);
        }
        
        for(int j=0;j<inputString.length();j++) {
            if(characterKey[j] == ' ') {
                System.out.print(" ");
            } else if(characterKey[j] == 'b'){
                System.out.print("a");
            } else if(characterKey[j] == 'a') {
                System.out.print("b");
            } else if(characterKey[j] == 'd') {
                System.out.print("c");
            } else if(characterKey[j] == 'c') {
                System.out.print("d");
            } else if(characterKey[j] == 'f') {
                System.out.print("e");
            } else if(characterKey[j] == 'e') {
                System.out.print("f");
            } else if(characterKey[j] == 'h') {
                System.out.print("g");
            } else if(characterKey[j] == 'g') {
                System.out.print("h");
            } else if(characterKey[j] == 'j') {
                System.out.print("i");
            } else if(characterKey[j] == 'i') {
                System.out.print("j");
            } else if(characterKey[j] == 'l') {
                System.out.print("k");
            } else if(characterKey[j] == 'k') {
                System.out.print("l");
            } else if(characterKey[j] == 'n') {
                System.out.print("m");
            } else if(characterKey[j] == 'm') {
                System.out.print("n");
            } else if(characterKey[j] == 'p') {
                System.out.print("o");
            } else if(characterKey[j] == 'o') {
                System.out.print("p");
            } else if(characterKey[j] == 'r') {
                System.out.print("q");
            } else if(characterKey[j] == 'q') {
                System.out.print("r");
            } else if(characterKey[j] == 't') {
                System.out.print("s");
            } else if(characterKey[j] == 's') {
                System.out.print("t");
            } else if(characterKey[j] == 'v') {
                System.out.print("u");
            } else if(characterKey[j] == 'u') {
                System.out.print("v");
            } else if(characterKey[j] == 'x') {
                System.out.print("w");
            } else if(characterKey[j] == 'w') {
                System.out.print("x");
            } else if(characterKey[j] == 'z') {
                System.out.print("y");
            } else if(characterKey[j] == 'y') {
                System.out.print("z");
            } else {
            	System.out.print("Error");
            }
        }   
        return "";
    }
}