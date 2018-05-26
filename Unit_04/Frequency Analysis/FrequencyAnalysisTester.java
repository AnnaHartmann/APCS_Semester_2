/**
 * This code formats the frequency from the FrequencyAnalysis code
 * while having a fun little quote from Warhammer 40K~!
 * 
 * @author Annabel Hartmann
 * @version 2/15/2018
 */

import java.io.IOException;

public class FrequencyAnalysisTester {
        public static void main(String[] args) throws IOException {
            FrequencyAnalysis plain = new FrequencyAnalysis("plaintext.txt");
            FrequencyAnalysis cipher = new FrequencyAnalysis("ciphertext.txt");
                
            int[] pFrequencies = plain.getPFrequency();
            int[] cFrequencies = cipher.getCFrequency();
                
            int pSum = 0, cSum = 0;
            
            for(int i = 0; i < 26; i++){
            	pSum += pFrequencies[i];
                cSum += cFrequencies[i];
            }
            
            System.out.println("        - Plain Text -                       - Cipher Text -");
            
            for(int i = 0; i < 26; i++){
            	
            	System.out.print("The frequency of \"" + (char)('a' + i)+ "\" is ");
            	System.out.printf("%1.2f%%        ", (100 * (pFrequencies[i] / (double) pSum)));
            
            	System.out.print("The frequency of \"" + (char)('a' + i)+ "\" is ");
            	System.out.printf("%1.2f%%        \n", (100 * (cFrequencies[i] / (double) cSum)));
            }
            System.out.println("Praise be Sigma!");
        } 
}