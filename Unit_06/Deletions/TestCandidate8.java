/**
 * This code formats the candidate class however
 * uses printf statements and array lists.
 * This code was also reorganized a bit and has the 
 * notes just as TestCandidate7 does. This also uses 
 * the new methods deleteByLocation and deleteByName.
 * 
 * @author Annabel Hartmann
 * @version 3/8/18
 */

import java.util.ArrayList;
public class TestCandidate8 {
	
    public static void main(String[] args) {
    	
    	ArrayList<Candidate> election = new ArrayList<Candidate>(); //Initialize array list and named the list election 
    	
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
        
        //Start of the formatted print statements
        System.out.println("Original:");
        printResults(election);
        System.out.println("");
        System.out.println("Total # of votes in election: " + getTotal(election));
        System.out.println("");
        
        deleteByLoc(election, 6);
        System.out.println("Deleted location 6:");
        printResults(election);
        System.out.println("");
        System.out.println("Total # of votes in election: " + getTotal(election));
        System.out.println("");
        
        deleteByName(election, "Kathleen Turner");
        System.out.println("Deleted Kathleen Turner:");
        printResults(election);
        System.out.println("");
        System.out.println("Total # of votes in election: " + getTotal(election));
        System.out.println("");
        //end of formatted print statements
    }
    
    public static void printResults(ArrayList<Candidate> election) { //this method finds the total votes that are needed to print after every candidate list
        double total = getTotal(election);
        System.out.println("      Candidate     Votes Received       % of Total Votes");
        System.out.println("_________________________________________________________");
        for(Candidate t : election){
        	System.out.printf("%15s%14d%20.0f\n", t.getName(), t.getVotes(), ((double)t.getVotes() / total)* 100);
        }
    }
    
    public static int getTotal(ArrayList<Candidate> election) { //this method prints the votes per candidate. 
    	int total = 0;
    		
    	for(Candidate t : election) {
            total += t.getVotes();
        }     
        return total;
    }
    
    public static void insertPosition(ArrayList<Candidate> list, int location, String name, int votes) {  //insert position just adds a new position into the roster       
       list.add(location, new Candidate(name, votes));
    }
    
    public static void insertCandidate(ArrayList<Candidate> list, String find, String name, int votes) { //this inserts a candidate into the roster
        int location = 0;
        for(int index = 0; index < list.size(); index++) {
          if (list.get(index).getName().equals(find)) {
               location = index;
          }
        }
        list.add(location, new Candidate(name, votes));
    }
    
    public static void deleteByLoc(ArrayList<Candidate> list, int location) { //this finds the location of a specific array and removes it
       list.remove(location);
    }
    
    public static void deleteByName(ArrayList<Candidate> list, String find) { //deleteByName finds a name and deletes it from the roster
        int location = 0;
        int index;
        
        for(index = 0; index < list.size(); index++) {
          if (list.get(index).getName().equals(find)) {
              location = index;
              break;
            }
        }
        
        if (index != list.size()) {
         list.remove(location);
        }
    } 
}