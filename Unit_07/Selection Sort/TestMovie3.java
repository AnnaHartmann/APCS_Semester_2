/**
 * This code takes from the Movie3 code and formats the code along with ordering code using 
 * selection sort. While I almost mixed up insertion and selection I believe that I did do it right
 * since well the code prints correctly! I have the appropriate methods (printMovies(), sortTitles(),
 * sortYears(), sortStudios()). In these methods I use if Else if statements and added an extra
 * else statement just in case I had any bugs or errors in my main method. 
 * 
 * @author Annabel Hartmann
 * @version 3/16/18
 */

public class TestMovie3 {
    
    public static void printMovies(Movie3[] myMovie) { //printMovies
        
        for(Movie3 movie : myMovie) {
            
            System.out.println(movie);
        }
    } //printMovies END
    
    public static Movie3[] sortTitles(Movie3[] myMovies, int p) { //sortTitles
        
        int i;
        int a, b;
        Movie3 temp;
        
        for (i = myMovies.length - 1; i >= 0; i--) {
            b = 0;
            
            for (a = 0; a <= i; a++) {
                
                if(p == 1) {
                    
                    if (myMovies[a].getTitle().compareTo(myMovies[b].getTitle()) > 0)
                        b = a;
                    } else if(p == 2) {         
                        
                        if (myMovies[a].getTitle().compareTo(myMovies[b].getTitle()) < 0)
                        b = a;
                    } else {
                        
                        System.out.println("ERROR"); //Just in case I mess something up with the print statements
                    }
                }
            
            temp = myMovies[i];
            myMovies[i] = myMovies[b];
            myMovies[b] = temp; 
        }
        
        return myMovies;
    } //sortTitles END
    
    public static Movie3[] sortYears(Movie3[] myMovies, int p) { //sortYears
        int i;
        int a, b;
        Movie3 temp;
        
        for (i = myMovies.length - 1; i >= 0; i--) {
            
            b = 0;
            
            for (a = 0; a <= i; a++) {
                
                if(p == 1) {
                    
                    if (myMovies[a].getYear() > myMovies[b].getYear())
                        b = a;
                } else if(p == 2) {
                
                    if (myMovies[a].getYear() < myMovies[b].getYear())
                        b = a;      
                } else {
                    
                    System.out.println("ERROR"); //Just in case I mess something up with the print statements           
                }
            }
            
            temp = myMovies[i];
            myMovies[i] = myMovies[b];
            myMovies[b] = temp;
        }
        
        return myMovies;
    } //sortYears END
    
    public static Movie3[] sortStudios(Movie3[] myMovies, int p) { //sortStudios
        
        int i;
        int a, b;
        Movie3 temp;
        
        for (i = myMovies.length - 1; i >= 0; i--) {
            
            b = 0;
            
            for (a = 0; a <= i; a++) {
                
                if(p == 1) {
                    
                    if (myMovies[a].getStudio().compareTo(myMovies[b].getStudio()) > 0)
                        b = a;
                } else if (p == 2) {
                    
                    if (myMovies[a].getStudio().compareTo(myMovies[b].getStudio()) < 0)
                        b = a;
                } else {
                    
                    System.out.println("ERROR");//Just in case I mess something up with the print statements
                }
            }
            
            temp = myMovies[i];
            myMovies[i] = myMovies[b];
            myMovies[b] = temp;
        }
        
        return myMovies;
    } //sortStudios END
    
    public static void main(String[] args) { //main
        
        Movie3[] myMovie = new Movie3[10];
        myMovie[0] = new Movie3(2001, "The Muppets Take Manhattan", "Columbia Tristar");
        myMovie[1] = new Movie3(2004, "Mulan Special Edition", "Disney");
        myMovie[2] = new Movie3(2004, "Shrek 2", "Dreamworks");
        myMovie[3] = new Movie3(2004, "The Incredibles", "Pixar");
        myMovie[4] = new Movie3(2006, "Nanny McPhee", "Universal");
        myMovie[5] = new Movie3(2006, "The Curse of the Were-Rabbit", "Aardman");
        myMovie[6] = new Movie3(2002, "Ice Age", "20th Century Fox");
        myMovie[7] = new Movie3(2002, "Lilo & Stitch", "Disney");
        myMovie[8] = new Movie3(2005, "Robots", "20th Century Fox");
        myMovie[9] = new Movie3(2001, "Monsters Inc.", "Pixar");
        
        System.out.println("Before Sorting Moves:");
        printMovies(myMovie);
        System.out.println();
        
        System.out.println("Movies Sorted by Title - descending:");
        Movie3[] titleSort = sortTitles(myMovie, 2);
        printMovies(titleSort);
        System.out.println();
        
        System.out.println("Movies Sorted by Year - descending:");
        Movie3[] yearSort = sortYears(myMovie, 2);
        printMovies(yearSort);
        System.out.println();
        
        System.out.println("Movies Sorted by Studio - ascending:");
        Movie3[] studioSort = sortStudios(myMovie, 1);
        printMovies(studioSort);
    } //main END    
}