package edu.txstate.library;

import java.util.Scanner;

/** 
 * This class is the user interface for the library system.
 * @author Hannah Burzynski, Alexander Wagstaff
 */
public class Console {
	
	private static Library library = null;

	/** 
	* This function adds a new user to the library system.
	*/
	public void addNewUser() {
		// TODO Auto-generated method stub

	}

	/** 
	* This function adds a new document to the library system.
	*/
	public void addNewDocument() {
		// TODO Auto-generated method stub
		
	}

	/** 
	* This function allows the user to search for a document based on title or author.
	*/
	public void searchDocuments() {
		// TODO Auto-generated method stub

	}

	/** 
	* This function allows the user to borrow a document.
	*/
	public void borrowDocument() {
		// TODO Auto-generated method stub

	}

	/** 
	* This function allows the user to return a document.
	*/
	public void returnDocument() {
		// TODO Auto-generated method stub

	}

	/** 
	* This function displays all the loans.
	*/
	public void displayLoans() {
		// TODO Auto-generated method stub

	}

	/** 
	* This function saves the state of the library and exits the system.
	*/
	public void saveAndExit() {
		// TODO Auto-generated method stub

	}
	
	public static void main(String args[]) {
		Console console = new Console();
		Scanner in = new Scanner(System.in);
		// Ensure singleton library is created
		if (library == null) {
			library = new Library();
		}
		
		// TODO Initialize library system from files
		
		// Menu display
		System.out.println("Welcome to the Library System. Select an option below:\n"
				+ "1. Add a new user.\n"
				+ "2. Add a new document.\n"
				+ "3. Search for a document.\n"
				+ "4. Borrow a document.\n"
				+ "5. Return a document.\n"
				+ "6. Display all loans.\n"
				+ "7. Save and exit.\n");
		try {
			// Get menu selection
			int selection;
			do {
				selection = in.nextInt();
				// Execute menu selection
				switch(selection){
				case 1: console.addNewUser();
						break;
				case 2: console.addNewDocument();
						break;
				case 3: console.searchDocuments();
						break;
				case 4: console.borrowDocument();
						break;
				case 5: console.returnDocument();
						break;
				case 6: console.displayLoans();
						break;
				case 7: console.saveAndExit();
						break;
				default: System.out.println("Invalid selection. Enter the number of the option.");
				}
			} while (selection != 7);
		} catch (Exception e) {
				System.out.println("Error" + e);
		}
		// Close scanner input stream
		in.close();
	}
}