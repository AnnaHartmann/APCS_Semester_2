/**
 * This code changes the typical sort methods from selection sort to merge sort and also adds the 
 * merge code into the code (mergeTitles, mergeYears, mergeStudios). It formats what was created 
 * in the movie4 code and prints out neatly and properly. Comments showing what are merge sort methods
 * and what are merge methods are indicated throughout the code. 
 * 
 * @author Annabel Hartmann
 * @version 3/19/18
 */

public class TestMovie4 {
    
    public static void printMovies(Movie4[] myMovie) { //printMovies
        
        for(Movie4 movie : myMovie) {
            
            System.out.println(movie);
        }
    } //printMovies END
    
     public static void sortTitles(Movie4[] x, int low, int high) { //sortTitles() - merge sort method
        
         if (low == high) {
             return;
         }
         
         int mid = (low + high) / 2;
         
         sortTitles(x, low, mid);    
         sortTitles(x, mid + 1, high);
        
         mergeTitles(x, low, mid, high);
    } //sortTitles END
     
     public static void mergeTitles(Movie4[] x, int low, int mid, int high) { //mergeTitles() - merge method
        
        Movie4[] temp = new Movie4[high - low + 1];
        
        int l = low, m = mid + 1, i = 0;
        
        while (l <= mid || m <= high) {
            
            if (l > mid) {
                
                temp[i] = x[m];
                m++;
            } else if (m > high){
                
                temp[i] = x[l];
                l++;
            } else if (x[l].getTitle().compareTo(x[m].getTitle()) < 0) {
                
                temp[i] = x[l];
                l++;
            } else {
                
                temp[i] = x[m];
                m++;
            }
            
            i++;
        }
        
        for (int a = low; a <= high; a++) {
            x[a] = temp[a - low];
        }
    } //mergeTitles END
    
     public static void sortYears(Movie4[] x, int low, int high) { //sortYears() - merge sort method
        
         if (low == high) {
            return;
         }
        
        int mid = (low + high) / 2;
        
        sortYears(x, low, mid);
        sortYears(x, mid + 1, high);
        
        mergeYears(x, low, mid, high);
    } //sortYears END
     
     public static void mergeYears(Movie4[] x, int low, int mid, int high) { //mergeYears() - merge method
        Movie4[] temp = new Movie4[high - low + 1];
        
        int l = low, m = mid + 1, i = 0;
        
        while (l <= mid || m <= high) {
            
            if (l > mid) {
                
                temp[i] = x[m];
                m++;
            } else if (m > high) {
                
                temp[i] = x[l];
                l++;
            } else if (x[l].getYear() > x[m].getYear()) {
                
                temp[i] = x[l];
                l++;
            } else {
                
                temp[i] = x[m];
                m++;
            }
            
            i++;
        }
        
        for (int a = low; a <= high; a++) {
            x[a] = temp[a - low];
        }
    } //mergeYears END
    
     public static void sortStudios(Movie4[] x, int low, int high) { //sortStudios() - merge sort method
         
         if (low == high) {
            return;
         }
        
        int mid = (low + high) / 2;
        
        sortStudios(x, low, mid);
        sortStudios(x, mid + 1, high);
        
        mergeStudios(x, low, mid, high);
    } //sortStudios END
    
    public static void mergeStudios(Movie4[] x, int low, int mid, int high) { //mergeStudios() - merge method
        
        Movie4[] temp = new Movie4[high - low + 1];
        
        int l = low, m = mid + 1, i = 0;
        
        while (l <= mid || m <= high) {
            
            if (l > mid) {
                
                temp[i] = x[m];
                m++;
            } else if (m > high) {
                
                temp[i] = x[l];
                l++;
            } else if (x[l].getStudio().compareTo(x[m].getStudio()) < 0) {
                
                temp[i] = x[l];
                l++;
            } else {
                
                temp[i] = x[m];
                m++;
            }
            i++;
        }
        
        for (int a = low; a <= high; a++) {
            x[a] = temp[a - low];
        }
    } //mergeStudios END
    
    public static void main(String[] args) { //main
        
        Movie4[] myMovie = new Movie4[10];
        myMovie[0] = new Movie4(2001, "The Muppets Take Manhattan", "Columbia Tristar");
        myMovie[1] = new Movie4(2004, "Mulan Special Edition", "Disney");
        myMovie[2] = new Movie4(2004, "Shrek 2", "Dreamworks");
        myMovie[3] = new Movie4(2004, "The Incredibles", "Pixar");
        myMovie[4] = new Movie4(2006, "Nanny McPhee", "Universal");
        myMovie[5] = new Movie4(2006, "The Curse of the Were-Rabbit", "Aardman");
        myMovie[6] = new Movie4(2002, "Ice Age", "20th Century Fox");
        myMovie[7] = new Movie4(2002, "Lilo & Stitch", "Disney");
        myMovie[8] = new Movie4(2005, "Robots", "20th Century Fox");
        myMovie[9] = new Movie4(2001, "Monsters Inc.", "Pixar");
        
        System.out.println("Before Sorting Moves:");
        printMovies(myMovie);
        System.out.println();
        
        System.out.println("Movies Sorted by Title - ascending:");
        sortTitles(myMovie, 0, myMovie.length - 1);
        printMovies(myMovie);
        System.out.println();
        
        System.out.println("Movies Sorted by Year - descending:");
        sortYears(myMovie, 0, myMovie.length -1);
        printMovies(myMovie);
        System.out.println();
        
        System.out.println("Movies Sorted by Studio - ascending:");
        sortStudios(myMovie, 0, myMovie.length -1);
        printMovies(myMovie);
        
        System.out.println("Have a nice day!");
    } //main END    
}