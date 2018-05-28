/**
 * This code formats the code known as Music2.java! It also
 * searches for the appropriate songs and has the appropriate 
 * output for each! This code contains printMusic(), selectionSort(),
 * searchTitle(), searchYear(), searchSinger() and main()! (In that
 * order!) 
 * 
 * @author Annabel Hartmann
 * @version 2/2/18
 */

public class TestMusic2 {
	
	public static void printMusic(Music2[] myMusic) {
		
		System.out.println("My music Library: ");
		System.out.println("_________________________");
		
		for(Music2 song : myMusic) {
			System.out.println(song.toString());
		}
		System.out.print("\n\n");
	}
	
	public static void selectionSort(Music2[] myMusic, String sortType) {
		
		int i, x;
		int maxPosition;
		Music2 temp;
		
		for (i = myMusic.length - 1; i >= 0; i--) {
			maxPosition = 0;
			
			for (x = 0; x <= i; x++) {
				
				if (sortType.equalsIgnoreCase("singer")) {
					if (myMusic[x].getSinger().compareTo(myMusic[maxPosition].getSinger()) > 0)
						maxPosition = x;

				} else if (sortType.equalsIgnoreCase("year")) {
					if (myMusic[x].getYear() > myMusic[maxPosition].getYear())
						maxPosition = x;
					
				} else {
					if (myMusic[x].getTitle().compareTo(myMusic[maxPosition].getTitle()) > 0)
						maxPosition = x;
				}
			}
			temp = myMusic[i];
			myMusic[i] = myMusic[maxPosition];
			myMusic[maxPosition] = temp;
		}
	}
	
	public static void searchTitle(Music2[] myMusic, String title) {
		
		selectionSort(myMusic, "title");
		
		int a = myMusic.length;
		int b = -1;
		int songTitle;
		
		while (a - b > 1) {
			
			songTitle = (a + b) / 2;
			if (myMusic[songTitle].getTitle().compareTo(title) > 0) {
				a = songTitle;
			} else {
				b = songTitle;
			}
		}
		
		if ((b >= 0) && (myMusic[b].getTitle().compareTo(title) == 0)) {
			System.out.println("Search - Title - " + title);
			System.out.println("Found: " + myMusic[b].toString() + " \n");
			
		} else {
			System.out.println("Search - Title - " + title);
			System.out.println("Not Found.   \n");
		}
	}
	
	public static void searchYear(Music2[] myMusic, int  year) {
		
	selectionSort(myMusic, "year");
		
		int a = myMusic.length;
		int b = -1;
		int songYear;
		
		while (a - b > 1) {
			
			songYear = (a + b) / 2;
			
			if (myMusic[songYear].getYear() > year) {
				a = songYear;
			} else {
				b = songYear;
			}
		}
		
		if ((b >= 0) && (myMusic[b].getYear() == year))	{
			System.out.println("Search - Year - " + year);
			System.out.println("Found: " + myMusic[b].toString() + " \n");
			
		} else {
			System.out.println("Search - Year - " + year);
			System.out.println("Not Found.  \n");
		}
	}
	
	public static void searchSinger(Music2[] myMusic, String singer) {
		
		selectionSort(myMusic, "singer");
		
		int a = myMusic.length;
		int b = -1;
		int songSinger;
		
		while (a - b > 1) {
			songSinger = (a + b) / 2;
			
			if (myMusic[songSinger].getSinger().compareTo(singer) > 0) {
				a = songSinger;
			} else {
				b = songSinger;
			}
		}
		
		if ((b >= 0) && (myMusic[b].getSinger().compareTo(singer) == 0)) {
			System.out.println("Search - Singer - " + singer);
			System.out.println("Found: " + myMusic[b].toString() +  " \n");
			
		} else {
			System.out.println("Search - Singer - " + singer);
			System.out.println("Not Found.  \n");
		}
	}
	
	public static void main(String[] args) {
		
		Music2[] myMusic = new Music2 [10];
		
		myMusic[0] = new Music2("Pieces of You", 1994, "Jewel");
		myMusic[1] = new Music2("Jagged Little Pill", 1995, "Alanis Morisette");
		myMusic[2] = new Music2("Whats If Its You", 1995, "Reba McEntire");
		myMusic[3] = new Music2("Misunderstood", 2001, "Pink");
		myMusic[4] = new Music2("Laundry Service", 2001, "Shakira");
		myMusic[5] = new Music2("Taking the Long Way", 2006, "Dixie Chicks");
		myMusic[6] = new Music2("Under My Skin", 2004, "Avril Lavigne");
		myMusic[7] = new Music2("Let Go", 2002, "Avril Lavigne");
		myMusic[8] = new Music2("Let It Go", 2007, "Tim McGraw");
		myMusic[9] = new Music2("White Flag", 2004, "Dido");
		
		
		printMusic(myMusic);
		
		searchTitle(myMusic, "Misunderstood");
		searchTitle(myMusic, "Under Paid");
		searchYear(myMusic, 2005);
		searchYear(myMusic, 2006);
		searchSinger(myMusic, "Darth Maul");
		searchSinger(myMusic, "Dido");
		
		System.out.println("Have a nice day!");
	}
}