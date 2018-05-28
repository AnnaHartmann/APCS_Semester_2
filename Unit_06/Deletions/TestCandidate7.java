/**
 * This code formats the candidate class however
 * uses printf statements and arrays.
 * I semi reorganized and commented on code as needed
 * so that way I can keep everything in a nice neat manner.
 * This code adds the deletion methods; deleteByLocation()
 * and deleteByName();
 * 
 * @author Annabel Hartmann
 * @version 3/8/18
 */

public class TestCandidate7 {
	
    public static void main(String[] args) {
    	
    	Candidate[] election = new Candidate[10]; //initialize the array, 10 elements
    	
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
        
        //Start of the formatted print statements
        System.out.println("Original:");
        printResults(election);
        System.out.println("");
        System.out.println("Total # of votes in election: " + getTotal(election));
        System.out.println("");
        
        deleteByLocation(election, 6);
        System.out.println("Deleting Location 6:");
        printResults(election);
        System.out.println("");
        System.out.println("Total # of votes in election: " + getTotal(election));
        System.out.println("");
        
        deleteByName(election, "Kathleen Turner");
        System.out.println("Deleting Kathleen Turner:");
        printResults(election);
        System.out.println("");
        System.out.println("Total number of votes in election: " + getTotal(election));
        //end of formatted print statements
        
    }
    
    public static int getTotal(Candidate[] election) { //this method finds the total votes that are needed to print after every candidate list
        int total = 0;
        
        for(int i = 0; i < election.length; i++)
        	if(election[i] == null) {
            } else {
                total = election[i].getVotes() + total;
            	}
        return total;       
    }
    
    public static void printVotes(Candidate[] election) { //this method prints the votes per candidate. 
        System.out.println();
        
        for(int i = 0; i < election.length; i++)
        System.out.println(election[i]);
    }
    
    public static void printResults(Candidate[] election) { //this is the roster for the candidates and how it will specifically be printed out
    	double total = getTotal(election);
        
        System.out.println("      Candidate     Votes Received       % of Total Votes");
        System.out.println("_________________________________________________________");
        
        for(int i = 0; i < election.length; i++) {
        	if (election[i] == null) {
        	} else {
        		System.out.printf("%15s%14d%20.0f\n", election[i].getName(), election[i].getVotes(), ((election[i].getVotes() / total) * 100));
        	}
        }
    }
    
    public static void changeName(Candidate[] election, String find, String replace) {  //this allows for the code to find the candidate name that it wants and replaces the name with someone else's
        for(int i = 0; i < election.length; i++) 
            if (election[i].getName().equals(find)) 
                election[i].setName(replace); 
    }
    
    public static void changeVote(Candidate[] election, int find, int replace) { //changeVote finds a certain vote amount in the array and replaces it with another vote amount
        for(int i = 0; i < election.length; i++) 
        if (election[i].getVotes() == find) 
            election[i].setVote(replace); 
    }
    
    public static void insertPosition(Candidate[] election, int location, String addName, int addString) { //insert position just adds a new position into the roster         
            for(int i = election.length - 1; i > location; i--)
            election[i] = election[i-1];
            election[location] = new Candidate(addName, addString);
    }
    
    public static void insertCandidate(Candidate[] election, String find, String addName, int addString) { //this inserts a candidate into the roster
        int location = 0;
    
        for(int i = 0; i < election.length; i++)
        if (election[i].getName().equals(find))
               location = i;
           
        for(int i = election.length - 1; i > location; i--)
               election[i] = election[i-1];
               election[location] = new Candidate(addName, addString);
    }
    
    public static void deleteByLocation(Candidate[] election, int location) {  //this finds the location of a specific array and removes it      
        if ((location > 0) && (location < election.length)) {
            for(int i = location; i < election.length -1; i++)
                election[i] = election[i + 1];
                election[election.length-1] = null;
        }
    }
    
    public static void deleteByName(Candidate[] election, String find) { //deleteByName finds a name and deletes it from the roster
      int location = 0;
      int i;
      
        for(i = 0; i < election.length; i++)
        	
        	if ((election[i] != null) && (election[i].getName().equals(find))) { 
        		location = i;
        		break;
        		} else if (election[i] == null) {
        			location = -1;
        			break;
        			}
        
        if ((i != election.length) && (location >= 0)) {
        	
        	for(i = location; i < election.length -1; i++)
        		election[i] = election[i + 1];
            	election[election.length-1] = null;
        }
    }
}