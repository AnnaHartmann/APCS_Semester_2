/**
 * This code formats the candidate class however
 * uses printf statements and arrays.
 * However I couldn't get the output for the 
 * candidate, votes received and % total to align correctly.
 * 
 * @author Annabel Hartmann
 * @version 3/5/18
 */

public class TestCandidate {
	
    public static void main(String[] args) {
    	
    	Candidate[] election = new Candidate[5];
    	
    	election[0] = new Candidate("John Smith", 5000);
    	election[1] = new Candidate("Mary Miller", 4000);        
    	election[2] = new Candidate("Michael Duffy", 6000);
    	election[3] = new Candidate("Tim Robinson", 2500);
        election[4] = new Candidate("Joe Ashtony", 1800);   
        
        System.out.println("~ Results per candidate ~");
        System.out.println("_________________________");
        System.out.println("");
        printVotes(election);
        System.out.print("");
        printResults(election);
        System.out.println("");
        System.out.println("Total # of votes in election: " + getTotal(election));
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
        for(int i = 0; i < list.length; i++)
           total = list[i].getVotes() + total;
          
        return total;
    }
    
    public static void printVotes(Candidate[] list) {
        System.out.println();
        for(int i = 0; i < list.length; i++)
           System.out.println(list[i]);
    }
}