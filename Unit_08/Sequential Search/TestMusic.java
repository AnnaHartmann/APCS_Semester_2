/**
 * This code formats the Music.java code. This has the methods that are necessary along with a bit of stylized output!
 * Things print as they should and have a nice message at the end of it! This code uses the sequential search to find 
 * song titles, song artists and the year they were created so the user can find them easily!
 * 
 * @author Annabel Hartmann
 * @version 3/23/18
 */

public class TestMusic {
	
	public static void printMusic(Music[] myMusic) {
		
		System.out.println("My music Library: ");
		System.out.println("_________________________");
		
		for(Music song : myMusic) {
			System.out.println(song.toString());
		}
		System.out.print("\n\n");
	}
	
	public static void searchTitle(Music[] myMusic, String title) {
		
		int numOfTitles = 0;
		String cdSong = "";
		
		for(Music song : myMusic) {
			
			if(song.getTitle().toLowerCase().contains(title.toLowerCase())) {
				cdSong = cdSong + song.toString();
				numOfTitles++;
				
			}
		}
		
		if(numOfTitles == 0) {		
			System.out.println("Search - Title - " + title);
			System.out.println(title + " was not found in your library");
			System.out.println("\n");
			
		} else if(numOfTitles == 1) {
			System.out.println("Search - Title - " + title);
			System.out.println("We found " + title + " in your library:");
			System.out.println(cdSong+ "\n");
			
		} else if(numOfTitles > 1)	{ 
			System.out.println("Search - Title - " + title);
			System.out.println(cdSong+ "\n");
			
		}
	}
	
	public static void searchYear(Music[] myMusic, int  year) {
		
		int numOfYear = 0;
		String cdSong = "";
		
		for(Music song : myMusic) {
			
			if(song.getYear() == year) {
				cdSong = cdSong + song.toString() + "\n";
				numOfYear++;			
			}
		}
		
		if(numOfYear == 0) {
			System.out.println("Search - Year - " + year);
			System.out.println("Find Results:"); 
			System.out.println("------------------------------------");
			System.out.println("There are no listings for " + year);
			System.out.println(cdSong);
			
		} else if(numOfYear == 1) {			
			System.out.println("Search - Year - " + year);
			System.out.println("Find Results:");
			System.out.println(cdSong);
			System.out.println("------------------------------------");
			System.out.println("There were " + numOfYear + " listings for " + year);
			System.out.println("\n");
			
		} else if(numOfYear > 1) {			
			System.out.println("Search - Year - " + year);
			System.out.println("Find Results:");
			System.out.println(cdSong);
			System.out.println("------------------------------------");
			System.out.println("There were " + numOfYear + " listings for " + year);
			System.out.println("\n");
		}
	}
	
	public static void searchSinger(Music[] myMusic, String singer)	{
		
		int numOfSingers = 0; 
		String cdSong = "";
		
		for(Music song : myMusic) {
			
			if(song.getSinger().toLowerCase().contains(singer.toLowerCase())) {
				cdSong = cdSong + song.toString() + "\n";
				numOfSingers++;
			}
		}
		
		if(numOfSingers == 0) {
			System.out.println("Search - Singer - " + singer);
			System.out.println("Find Results:");
			System.out.println("------------------------------------");
			System.out.println("There are no listings for \"" + singer + "\"");
			System.out.println("\n\n");
			
		} else if(numOfSingers == 1) {		
			System.out.println("Search - Singer - " + singer);
			System.out.println("Find Results:");
			System.out.println(cdSong);
			System.out.println("------------------------------------");
			System.out.println("There were " + numOfSingers + " listings for " + singer);
			System.out.println("\n");
			
		} else if(numOfSingers > 1)	{		
			System.out.println("Search - Singer - " + singer);
			System.out.println("Find Results:");
			System.out.println(numOfSingers + " matches were found for \"" + singer + "\"");
			System.out.println(cdSong);
			System.out.println("------------------------------------");
			System.out.println("There were " + numOfSingers + " listings for " + singer);
			System.out.println("\n");
		}
	}	
	
	public static void main(String[] args) {
		
		Music[] myMusic = new Music [10];
		
		myMusic[0] = new Music("Pieces of You", 1994, "Jewel");
		myMusic[1] = new Music("Jagged Little Pill", 1995, "Alanis Morisette");
		myMusic[2] = new Music("Whats If Its You", 1995, "Reba McEntire");
		myMusic[3] = new Music("Misunderstood", 2001, "Pink");
		myMusic[4] = new Music("Laundry Service", 2001, "Shakira");
		myMusic[5] = new Music("Taking the Long Way", 2006, "Dixie Chicks");
		myMusic[6] = new Music("Under My Skin", 2004, "Avril Lavigne");
		myMusic[7] = new Music("Let Go", 2002, "Avril Lavigne");
		myMusic[8] = new Music("Let It Go", 2007, "Tim McGraw");
		myMusic[9] = new Music("White Flag", 2004, "Dido");
		
		
		printMusic(myMusic);
		
		searchTitle(myMusic, "Let Go");
		searchTitle(myMusic, "Some Day");
		searchYear(myMusic, 2001);
		searchYear(myMusic, 2003);
		searchSinger(myMusic, "Avril Lavigne");
		searchSinger(myMusic, "Tony Curtis");
		
		System.out.println("Have a nice day!");
	}
}