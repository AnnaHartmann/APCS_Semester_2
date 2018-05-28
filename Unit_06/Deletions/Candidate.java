/**
 * This class is similar to the original candidate
 * that was created in the last lesson 
 * 
 * @author Annabel Hartmann
 * @version 3/8/18
 */

public class Candidate {
    
    public String name;
    public int votes;
    
    public Candidate(String n, int v) {
        this.name = n;
        this.votes = v;
    }
    
    public String getName() {
        return name;
    }
    
    public String setName(String replace) {
        return name = replace;
    }
    
    public int getVotes() {
        return votes;
    }
    
    public int setVote(int replace) {
        return votes = replace;
    }
    
    public String toString() {
        return getName() + " received " + getVotes() + " votes. ";
    }
    
    public void replaceName(String n){ 
        System.out.println("Replacing " + name + " with " + n);
        name = n;
    }
    
    public void replaceCandidate(Candidate c){ 
        System.out.println("Replacing " + name + "'s votes to " + c.getName());
        votes = c.getVotes();
    }
    
    public void replaceVotes(int v){ 
        System.out.println("Replacing " + name + "'s votes to " + v);
        votes = v;
    }
}