/**
 * This code formats the candidate class however
 * uses printf statements and arrays.
 * I used and inserted the insertCandidate and
 * insertPosition methods. The output prints correctly.
 * 
 * @author Annabel Hartmann
 * @version 3/7/18
 */

public class TestCandidate5 {
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
        
        insertPosition(election, 5, "Mickey Duck", 14000);
        System.out.println("Adding Mickey Duck, 14000 votes:");
        System.out.println("");
        printResults(election);
        System.out.println("");
        System.out.println("Total # of votes in election: " + getTotal(election));
        System.out.println("");
        
        insertCandidate(election, "Kathleen Turner", "Donald Mouse", 2500);
        System.out.println("Adding Donald Mouse, 100 votes:");
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
    
    public static void insertPosition(Candidate[] list, int location, String name, int votes) {          
    	for(int i = list.length - 1; i > location; i--)
    		list[i] = list[i-1];
    		list[location] = new Candidate(name, votes);
    }
    
    public static void insertCandidate(Candidate[] list, String find, String name, int votes) {
    	int location = 0;
        
        for(int i = 0; i < list.length; i++)
        if (list[i].getName().equals(find))
               location = i;
           
        for(int i = list.length - 1; i > location; i--)
        	list[i] = list[i-1];
        	list[location] = new Candidate(name, votes);
    }  
}