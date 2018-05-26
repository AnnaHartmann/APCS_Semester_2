/**
 * This program formats all the types of homework code (MyMath,MyScience,MyEnglish,MyJava) and the Homework.java code.
 * This code uses a scanner and includes a fun original joke and a fun dialogue with it. 
 * 
 * @author Annabel Hartmann
 * @version 2/22/2018
 */

import java.util.Scanner;
public class testHomework {
	public static void main(String[]args) {
		
	    Scanner in = new Scanner(System.in);
		
	    MyEnglish eng = new MyEnglish();
		MyJava java = new MyJava();
		MyMath math = new MyMath();
		MyScience sci = new MyScience();
		
		
		System.out.println("Welcome Student, Teacher or Parent to Homework Hacker!");
		System.out.println("This is a tracker for homework! I am Bobo!");
		System.out.println("What would you like to do?");
		System.out.println("------------------------------------------------------");
		System.out.println("1 - Homework Hacker \n2 - Joke for Motiavtion \n3 - Quit");
		int option = in.nextInt();
		
		if (option == 1) {
		
		System.out.println("Please tell Bobo How many pages of English you must study!");
		int ePages = in.nextInt();
		System.out.println("Please tell Bobo How many pages of Java you must study!");
		int jPages = in.nextInt();
		System.out.println("Please tell Bobo How many pages of Mathematics you must study!");
		int mPages = in.nextInt();
		System.out.println("Please tell Bobo How many pages of Science you must study!");
		int sPages = in.nextInt();
		
		System.out.println("------------------------------------------------------");
		math.createAssignment(mPages);
		sci.createAssignment(sPages);
		eng.createAssignment(ePages);
		java.createAssignment(jPages);
		System.out.println("Bobo wishes you have a good day!");
		
		System.out.println(math.toString());
		System.out.println(sci.toString());
		System.out.println(eng.toString());
		System.out.println(java.toString());
		} else if (option == 2) {
			System.out.println("Teacher: Patrick where is your homework?");
			System.out.println("Patrick: My dog ate it.");
			System.out.println("Teacher: Your \"dog\" ate your coding homework?");
			System.out.println("Patrick: I mean if I'm being honest he just took a huge byte out of it.");
		} else if (option == 3) {
			System.out.println("Bobo wishes you have a good day!");
		} else {
			System.out.println("Error Invalid Input");
		}		
	}
}