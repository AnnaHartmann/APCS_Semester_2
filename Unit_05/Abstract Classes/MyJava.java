/**
 * This code of java is the homework specific code for java that 
 * extends from the homework.java code. It has no arguments has 
 * the variable type p and sets homework type to Java. 
 * 
 * @author Annabel Hartmann
 * @version 2/22/2018
 */

public class MyJava extends Homework {
	
	MyJava() {
	}
	
	public void createAssignment(int p) {
		setReadPages(p);
		setHwType("Java");
	}
	
	public String toString() {
		return "Be sure to read" + getReadPages() + " pages for your " + getHwType() + " homework!";
	}
}