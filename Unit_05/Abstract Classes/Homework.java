/**
 * This code is the homework code that is the base of getting the type of homework,
 * get and set the pages that must be read and creating the assignment so there can 
 * be an assignment in the code.
 * 
 * @author Annabel Hartmann
 * @version 2/22/2018
 */

public abstract class Homework {
	
	private int pagesRead = 0;
	private String typeHw = "null";
	
	Homework() {
	}
	
	public int getReadPages() {
		return pagesRead;
	}
	
	public void setReadPages(int pagesRead) {
		this.pagesRead = pagesRead;
	}
	
	public String getHwType()  {
		return typeHw;
	}
	
	public void setHwType(String typeHomework) {
		this.typeHw = typeHomework;
	}
	
	public abstract void createAssignment(int p);
}