/**
 * This is the code that formats all of Contact.Java
 * it has all of the sequential and binary search
 * methods that are necessary of this code and prints
 * the appropriate code!
 * 
 * @author Annabel Hartmann
 * @version 4/3/18
 */

public class TestContact {
	
	public static void printContacts(Contact[] myContacts) { //START printContacts
		
		System.out.println(" Name           Relation    Birthday    Phone             Email");
		System.out.println("---------------------------------------------------------------------------------");
		
		for (Contact contact : myContacts) {
			System.out.println(contact);
		}
		System.out.println();
	} //END printContacts
	
	public static void findByName(Contact[] myContacts, String toFind) { //START findByName - Binary Search
		
		sortContacts(myContacts, "name");
		
		int b = myContacts.length;
		int a = -1;
		int probe;
		
		while (b - a > 1) {
			
			probe = (b + a) / 2;
			
			if (myContacts[probe].getName().compareTo(toFind) > 0) {
				b = probe;
			} else {
				a = probe;
			}
		}
		
		if ((a >= 0) && (myContacts[a].getName().compareTo(toFind) == 0)) {
			System.out.println("Find Name - " + toFind);
			System.out.println("Found: " + myContacts[a].toString() + "\n\n");
			
		} else {
			System.out.println("Find Name - " + toFind);
			System.out.println("Not Found. \n\n");
		}
	} //END findByName
	
	public static void findByRelation(Contact[] myContacts, String toFind) { //START findByRelation - Sequential Search
		int numFound = 0;
		String output = "";
		
		for(Contact contact : myContacts) {
			if(contact.getRelation().toLowerCase().contains(toFind.toLowerCase())) {
				output = output + contact.toString() + "\n";
				numFound++;
			}
		}
		
		if(numFound == 0) {
			System.out.println("Find Relation - " + toFind);
			System.out.println("Find Results: ");
			System.out.println("There were no listings for " + toFind + "\n\n");
			
		} else if(numFound == 1) {
			System.out.println("Find Relation - " + toFind);
			System.out.println("Find Results: ");
			System.out.println(output);
			System.out.println("There was 1 listing for " + toFind + "\n\n");
			
		} else if(numFound > 1)	{
			System.out.println("Find Relation - " + toFind);
			System.out.println("Find Results: ");
			System.out.println(output);
			System.out.println("There was " + numFound + " listings for " + toFind + "\n\n");
		}
	} //END findByRelation
	
	public static void findByBMonth(Contact[] myContacts, String toFind) { //START findByBhMonth - Sequential Search
		
		int numFound = 0;
		String output = "";
		
		for(Contact contact : myContacts) {
			if(contact.getBday().toLowerCase().contains(toFind.toLowerCase())) {
				output = output + contact.toString() + "\n";
				numFound++;
			}
		}
		
		if(numFound == 0) {
			System.out.println("Find Bday - " + toFind);
			System.out.println("Find Results: ");
			System.out.println("There were no listings for " + toFind + "\n\n");
			
		} else if(numFound == 1) {
			System.out.println("Find Bday - " + toFind);
			System.out.println("Find Results: ");
			System.out.println(output);
			System.out.println("There was 1 listing for " + toFind + "\n\n");
			
		} else if(numFound > 1)	{
			System.out.println("Find Bday - " + toFind);
			System.out.println("Find Results: ");
			System.out.println(output);
			System.out.println("There was " + numFound + " listings for " + toFind + "\n\n");
		}
	} //END findByBMonth
	
	public static void findByPhone(Contact[] myContacts, String toFind) { //START findByPhone - Sequential Search
		int numFound = 0;
		String output = "";
		
		for(Contact contact : myContacts) {
			
			if(contact.getPhone().toLowerCase().contains(toFind.toLowerCase()))	{
				output = output + contact.toString() + "\n";
				numFound++;
			}
		}
		
		if(numFound == 0) {
			System.out.println("Find Phone - " + toFind);
			System.out.println("Find Results: ");
			System.out.println("There were no listings for " + toFind + "\n\n");
			
		} else if(numFound == 1) {
			System.out.println("Find Phone - " + toFind);
			System.out.println("Find Results: ");
			System.out.println(output);
			System.out.println("There was 1 listing for " + toFind + "\n\n");
			
		} else if(numFound > 1)	{
			System.out.println("Find Phone - " + toFind);
			System.out.println("Find Results: ");
			System.out.println(output);
			System.out.println("There was " + numFound + " listings for " + toFind + "\n\n");
		}
	} //END findByPhone
	
	public static void findByEmail(Contact[] myContacts, String toFind)	{ //START findByEmail - Binary Search
		
		sortContacts(myContacts, "email");
		
		int b = myContacts.length;
		int a = -1;
		int probe;
		
		while (b - a > 1) {
			probe = (b + a) / 2;
			
			if (myContacts[probe].getEmail().compareTo(toFind) > 0) {
				b = probe;
			} else {
				a = probe;
			}
		}
		
		if ((a >= 0) && (myContacts[a].getEmail().compareTo(toFind) == 0)) {
			System.out.println("Find Email - " + toFind);
			System.out.println("Found: " + myContacts[a].toString() + "\n\n");
		
		} else {
			System.out.println("Find Email - " + toFind);
			System.out.println("Not Found. ");
			System.out.print("\n\n");
		}
	} //END findByEmail
	
	public static void sortContacts(Contact[] myContacts, String sortType) { //START sortContacts - Binary Sort for Binary Search
		
		int i;
		int k;
		int posmax;
		Contact temp;
		
		for (i = myContacts.length - 1; i >= 0; i--) {
			posmax = 0;
			
			for (k = 0; k <= i; k++) {
				
				if (sortType.equalsIgnoreCase("email"))	{
					
					if (myContacts[k].getEmail().compareTo(myContacts[posmax].getEmail()) > 0) {
						posmax = k;
					}
					
				} else if (sortType.equalsIgnoreCase("phone"))	{
					
					if (myContacts[k].getPhone().compareTo(myContacts[posmax].getPhone()) > 0) {
						posmax = k;
					}
					
				} else if (sortType.equalsIgnoreCase("birthday")) {
					
					if (myContacts[k].getBday().compareTo(myContacts[posmax].getBday()) > 0) {
						posmax = k;
					}
					
				} else if (sortType.equalsIgnoreCase("relation")) {
					
					if (myContacts[k].getRelation().compareTo(myContacts[posmax].getRelation()) > 0) {
						posmax = k;
					}
					
				} else	{
					
					if (myContacts[k].getName().compareTo(myContacts[posmax].getName()) > 0) {
						posmax = k;
					}
				}
			}
			temp = myContacts[i];
			myContacts[i] = myContacts[posmax];
			myContacts[posmax] = temp;
		}
	} //END sortContacts
	
	public static void main(String[] args) { //Start main - formatting print statements
		
		Contact[] myContacts = new Contact[6];
		
		myContacts[0] = new Contact("John Carter", "brother", "Mar 3", "(342) 555-7069", "jcarter@carter.com");
		myContacts[1] = new Contact("Elise Carter", "mom", "Apr 19", "(342) 555-7011", "carterMom@carter.com");
		myContacts[2] = new Contact("Ellie Carter", "me", "Jun 10", "(342) 555-8102", "ecarter@carter.com");
		myContacts[3] = new Contact("Sue Ellen", "friend", "Mar 9", "(341) 555-9182", "susieE@hotmail.com");
		myContacts[4] = new Contact("Frank Carter", "dad", "Dec 1", "(342) 555-7011", "carterDad@carter.com");
		myContacts[5] = new Contact("Johnnie", "friend", "Jan 21", "(341) 555-7789", "jDawg5555@yahoo.com");

		
		System.out.println("                            Contact List \n\n");
		
		printContacts(myContacts);
		
		findByName(myContacts, "Johnnie");
		findByName(myContacts, "Sam Parker");
		
		findByRelation(myContacts, "friend");
		findByRelation(myContacts, "aunt");
		
		findByPhone(myContacts, "(333) 555-8989");
		findByPhone(myContacts, "(342) 555-7011");
		
		findByBMonth(myContacts, "May");
		findByBMonth(myContacts, "Mar");
		
		findByEmail(myContacts, "rgoodman@hotmail.com");
		findByEmail(myContacts, "susieE@hotmail.com");
		
		System.out.println("Have a lovely day!");
	} //END main
}