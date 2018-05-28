/**
 * This code takes the formulas and format from the toString and
 * prints it within this code. This code doesn't add anything special
 * other than it prints the code correctly and has a nice message at the end!
 * 
 * @author Annabel Hartmann
 * @version 4/9/2018
 */

public class TestProgStudentData {
	
	public static void main(String[] args) {	
		
		double[] gradesArray1 = {89.00, 78.00, 95.00, 63.00, 94.00};
		double[] gradesArray2 = {88.00, 90.00, 100.00, 88.00, 90.00, 100.00};
			
		StudentData student1 = new StudentData("John   ", "Doe  ", gradesArray1);
		StudentData student2 = new StudentData("Lindsay", "Green", gradesArray2);
			
		System.out.println(student1);
		System.out.println(student2);
		System.out.println("I hope that your day is well and you're doing great!");
	}
}
