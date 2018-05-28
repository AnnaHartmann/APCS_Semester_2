/**
 * This code formats the candidate class however
 * uses printf statements and array lists.
 * This code also adds the new requirements of the
 * insertPosition and insert and insertCandidate.
 * Made sure the outputs were correct!
 * 
 * @author Annabel Hartmann
 * @version 3/7/18
 */

import java.util.ArrayList;
public class TestCandidate6 {
	
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
        Candidate mickey = new Candidate("Mickey Jones", 3000);
        election.add(mickey);        
        Candidate rebecca = new Candidate("Rebecca Morgan", 2000);
        election.add(rebecca); 
        Candidate kathleen = new Candidate("Kathleen Turner", 8000);
        election.add(kathleen);        
        Candidate tory = new Candidate("Tory Parker", 500);
        election.add(tory);        
        Candidate ashton = new Candidate("Ashton Davis", 10000);
        election.add(ashton);
        
        System.out.println("Original:");
        printResults(election);
        System.out.println("");
        System.out.println("Total # of votes in election: " + getTotal(election));
        System.out.println("");
        
        insertPosition(election,5,"Mickey Duck",14000);
        System.out.println("Added Mickey Duck, 14000 votes:");
        System.out.println("");
        printResults(election);
        System.out.println("");
        System.out.println("Total # of votes in election: " + getTotal(election));
        System.out.println("");
        
        insertCandidate(election,"Kathleen Turner","Donald Mouse",2500);
        System.out.println("");
        printResults(election);
        System.out.println("");
        System.out.println("Total # of votes in election: " + getTotal(election));
        System.out.println("");
        
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
    
    public static void insertPosition(ArrayList<Candidate> list, int location, String name, int votes) {          
       list.add(location, new Candidate(name, votes));
    }
    
    public static void insertCandidate(ArrayList<Candidate> list, String find, String name, int votes) {
        int location = 0;
        for(int index = 0; index < list.size(); index++) {
          if (list.get(index).getName().equals(find)) {
               location = index;
          }
        }
        list.add(location, new Candidate(name, votes));
    }  
}