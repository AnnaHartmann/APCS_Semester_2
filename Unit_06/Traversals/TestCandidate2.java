/**
 * This code formats the candidate class however
 * uses printf statements and array lists.
 * This is only different from the first code
 * because it uses array lists instead of just arrays.
 * 
 * @author Annabel Hartmann
 * @version 3/5/18
 */

import java.util.ArrayList;
public class TestCandidate2 {
	
    public static void main(String[] args) {
    	
    	ArrayList<Candidate> election = new ArrayList<Candidate>();
    	
        Candidate john = new Candidate("John Smith", 5000);
        election.add(john);
        Candidate mary = new Candidate("Mary Miller", 4000);
        election.add(mary);
        Candidate michael = new Candidate("Michael Duffy", 6000);
        election.add(michael);
        Candidate tim = new Candidate("Tim Robinson", 2500);
        election.add(tim);
        Candidate joe = new Candidate("Joe Ashtony", 1800);
        election.add(joe);
        
        System.out.println("~ Results per candidate ~");
        System.out.println("_________________________");
        System.out.println("");
        printVotes(election);
        System.out.println("");
        printResults(election);
        System.out.println("");
        System.out.println("Total # of votes in election: " + getTotal(election));
    }
    
    public static void printResults(ArrayList<Candidate> election) {
        double total = getTotal(election);
        System.out.println("      Candidate     Votes Received       % of Total Votes");
        System.out.println("_________________________________________________________");
        for(Candidate t : election){
        	System.out.printf("%15s%14d%20.0f\n", t.getName(), t.getVotes(), ((double)t.getVotes() / total)* 100);
        }
    }
    
    public static int getTotal(ArrayList<Candidate> election) {
    	int total = 0;
    		
    	for(Candidate t : election) {
            total += t.getVotes();
        }     
        return total;
    }

    public static void printVotes(ArrayList<Candidate> election) {
    	for(int i = 0; i < election.size(); i++) {
            System.out.println(election.get(i));
        }
    }
}