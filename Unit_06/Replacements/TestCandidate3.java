/**
 * This code formats the candidate class however
 * uses printf statements and arrays.
 * However I couldn't get the output for the 
 * candidate, votes received and % total to align correctly.
 * This is similar to the previes TestCandidate however as said
 * it uses arrays and uses the replace methods. 
 * 
 * @author Annabel Hartmann
 * @version 3/6/18
 */

public class TestCandidate3 {
	
    public static void main(String[] args) {
    	
    	Candidate[] election = new Candidate[10];
    	
    	election[0] = new Candidate("John Smith", 5000);
    	election[1] = new Candidate("Mary Miller", 4000);        
    	election[2] = new Candidate("Michael Duffy", 6000);
    	election[3] = new Candidate("Tim Robinson", 2500);
        election[4] = new Candidate("Joe Ashtony", 1800);
        election[5] = new Candidate("Mickey Jones", 3000);
        election[6] = new Candidate("Rebecca Morgan", 2000);        
        election[7] = new Candidate("Kathleen Turner", 8000);
        election[8] = new Candidate("Tory Parker", 500);
        election[9] = new Candidate("Ashton Davis", 10000); 
        

        System.out.println("Original:");
        printResults(election);
        System.out.println("");
        System.out.println("Total # of votes in election: " + getTotal(election));
        System.out.println("");
        
        election[2].replaceName("Johnny Elmos");
        System.out.println("");
        printResults(election);
        System.out.println("");
        System.out.println("Total # of votes in election: " + getTotal(election));
        System.out.println("");
        
        election[5].replaceVotes(2500);
        System.out.println("");
        printResults(election);
        System.out.println("");
        System.out.println("Total # of votes in election: " + getTotal(election));
        System.out.println("");
        
        election[7].replaceName("John Kennedy");
        System.out.println("");
        printResults(election);
        System.out.println("");
        System.out.println("Total # of votes in election: " + getTotal(election));
        System.out.println("");
        
        election[7].replaceVotes(8500);
        System.out.println("");
        printResults(election);
        System.out.println("");
        System.out.println("Total # of votes in election: " + getTotal(election));
        System.out.println("");
    }
    
    public static void printResults(Candidate[] list) {
        double total = getTotal(list);
        System.out.println("");
        System.out.println("      Candidate     Votes Received       % of Total Votes");
        System.out.println("_________________________________________________________");
        for(int i = 0; i < list.length; i++){
        	System.out.printf("%15s%14d%20.0f\n", list[i].getName(), list[i].getVotes(), ((double)list[i].getVotes() / total) * 100);
        }
    }
    
    public static int getTotal(Candidate[] list) {
        int total = 0;
        for(int i = 0; i < list.length; i++) {
           total = list[i].getVotes() + total;
        }
        return total;
    }
    
}