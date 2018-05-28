/**
 * This code allows for the overall formatting of the Movie2 variables which are the arrays within this code.
 * This code has printMovies, sortTitles, sortYears, sortStudios. It's formatted so the method is on top and then
 * main args being at the bottom. It does seem like my movies at the end for some of the system.out.print() methods 
 * have switched. 
 * 
 * @author Annabel Hartmann
 * @version 3/14/18
 */

public class TestMovie2 {
	
    public static void printMovies(Movie2[] theMovies) { //printMovies
    	
    	for(Movie2 movie : theMovies) {
    		
            System.out.println(movie);
        }
    } //printMovies END
    
    public static Movie2[] sortTitles(Movie2[] theMovies, int p) { //sortTitles 
    	
        Movie2[] titleSort = new Movie2[theMovies.length];
        
        if(p == 1) {            
        
        	for(int x = 0; x < theMovies.length; x++) {   
                
        		String title = theMovies[x].getTitle();
                int i = 0;
                int c = x;
                
                while(c > 0 && i == 0) {
                    
                	if(title.compareTo(titleSort[c - 1].getTitle()) >= 1) {
                        i = c;
                        } else {
                        	titleSort[c] = titleSort[c - 1];
                	}
                c --;
                }
        	titleSort[i] = theMovies[x];
        	}
        } else if(p == 2) {
        	
            for(int x = theMovies.length - 1; x > -1; x--) {
            	
            	String title = theMovies[x].getTitle();
                int i = theMovies.length - 1;
                int c = x;
                
                while(c < theMovies.length - 1 && i == theMovies.length - 1) {
                	
                    if(title.compareTo(titleSort[c + 1].getTitle()) >= 1) {
                        i = c;
                    } else {
                        titleSort[c] = titleSort[c + 1];
                        }
                    c ++;
                    }
                titleSort[i] = theMovies[x];
                }
            }
        return titleSort;
        } //sortTitles END
    
    public static Movie2[] sortYears(Movie2[] theMovies, int p) { //sortYears
    	
        Movie2[] yearSort = new Movie2[theMovies.length];
        
        if(p == 1) {
        	
        	for(int x = 0; x < theMovies.length; x++) {
        		
                int year = theMovies[x].getYear();
                int i = 0;
                int c = x;
                
                while(c > 0 && i == 0) {
                	
                	if(year > yearSort[c - 1].getYear()) {
                        i = c;
                        } else {
                        	yearSort[c] = yearSort[c - 1];
                        	}
                	c --;
                	}
                yearSort[i] = theMovies[x];
                }
        	} else if(p == 2) {
        		
        		for(int x = theMovies.length - 1; x > -1; x--) {
                
        			int year = theMovies[x].getYear();
        			int i = theMovies.length - 1;
        			int c = x;
        				
        			while(c < theMovies.length - 1 && i == theMovies.length - 1) {
        				
        				if(year > yearSort[c + 1].getYear()) {
                        i = c; 
                        } else {
                        	yearSort[c] = yearSort[c + 1];
                        	}
        				c ++;
        				}
        			yearSort[i] = theMovies[x];
        			}
        		}
        return yearSort;
        } //sortYear END
    
    public static Movie2[] sortStudios(Movie2[] theMovies, int p) { //sortStudios
    	
        Movie2[] studioSort = new Movie2[theMovies.length];
        
        if(p == 1) {
        	
        	for(int x = 0; x < theMovies.length; x++) {
        		
        		String studio = theMovies[x].getStudio();
                int i = 0;
                int c = x;
                
                while(c > 0 && i == 0) {
                	
                    if(studio.compareTo(studioSort[c - 1].getStudio()) >= 1) {
                    	
                        i = c;
                        
                        } else {
                        	studioSort[c] = studioSort[c - 1];
                        	}
                    c --;
                    }
                studioSort[i] = theMovies[x];
                }
        	} else if(p == 2) {
        		for(int x = theMovies.length - 1; x > -1; x--) {
        			
        			String studio = theMovies[x].getStudio();
        			int i = theMovies.length - 1;
        			int c = x;
        			
        			while(c < theMovies.length - 1 && i == theMovies.length - 1) {
        				
        				if(studio.compareTo(studioSort[c + 1].getStudio()) >= 1) {
        					i = c;
        					} else {
        						studioSort[c] = studioSort[c + 1];                    
        						}
        				c ++;
        				}
        			studioSort[i] = theMovies[x];            
        			}
        		}
        return studioSort;
        } //sortStudios END
    
    public static void main(String[] args) { //main
    	
        Movie2[] theMovies = new Movie2[10];
        theMovies[0] = new Movie2(2001, "The Muppets Take Manhattan", "Columbia Tristar");
        theMovies[1] = new Movie2(2004, "Mulan Special Edition", "Disney");
        theMovies[2] = new Movie2(2004, "Shrek 2", "Dreamworks");
        theMovies[3] = new Movie2(2004, "The Incredibles", "Pixar");
        theMovies[4] = new Movie2(2006, "Nanny McPhee", "Universal");
        theMovies[5] = new Movie2(2006, "The Curse of the Were-Rabbit", "Aardman");
        theMovies[6] = new Movie2(2002, "Ice Age", "20th Century Fox");
        theMovies[7] = new Movie2(2002, "Lilo & Stitch", "Disney");
        theMovies[8] = new Movie2(2005, "Robots", "20th Century Fox");
        theMovies[9] = new Movie2(2001, "Monsters Inc.", "Pixar");
        
        System.out.println("Before Sorting Moves:");
        printMovies(theMovies);
        System.out.println();
        
        System.out.println("Movies Sorted by Title - ascending:");
        Movie2[] titleSort = sortTitles(theMovies, 1);
        printMovies(titleSort);
        System.out.println();
        
        System.out.println("Movies Sorted by Year - descending:");
        Movie2[] yearSort = sortYears(theMovies, 2);
        printMovies(yearSort);
        System.out.println();
        
        System.out.println("Movies Sorted by Studio - ascending:");
        Movie2[] studioSort = sortStudios(theMovies, 1);
        printMovies(studioSort);
    } //main END    
}