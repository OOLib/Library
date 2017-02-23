package edu.txstate.library;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/** 
 * This class is the user interface for the library system.
 * @author Hannah Burzynski, Alexander Wagstaff
 */
public class Console {
	
	private static Library library = null;

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		// Ensure singleton library is created
		if (library == null) {
			library = new Library();
		}
		//-------------------------------------------------------------------------
		// TODO Initialize library system from files
		//-------------------------------------------------------------------------
		
		// Initialize User Accounts
        Scanner inFile = null;
        
		try {
			inFile = new Scanner(new FileReader("res/users.txt"));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
        //Read from files
		Set<Account> accounts = new HashSet<Account>();
		while(inFile.hasNext()){
	        String line = inFile.nextLine();
	        //TEST
	        System.out.println(line);
	        String[] words = line.split("\t");
	        
	        // Add Student Accounts
	        if (words[2].toUpperCase().equals("STUDENT")) {
	        	accounts.add(new StudentAccount(Integer.parseInt(words[0]), words[1], words[2]));
	        }
	        // Add Faculty Accounts
	        if (words[2].toUpperCase().equals("FACULTY")) {
	        	accounts.add(new FacultyAccount(Integer.parseInt(words[0]), words[1], words[2]));
	        }
	        // Add Staff Accounts
	        if (words[2].toUpperCase().equals("STAFF")) {
	        	accounts.add(new StaffAccount(Integer.parseInt(words[0]), words[1], words[2]));
	        }
	        // Add Librarian Accounts
	        if (words[2].toUpperCase().equals("LIBRARIAN")) {
	        	accounts.add(new LibrarianAccount(Integer.parseInt(words[0]), words[1], words[2]));
	        }
		}
		// TEST - display the set
		for (Account account : accounts) {
			System.out.println(account.getId() + "\t" + account.getName() + "\t" + account.getType());
		}
        inFile.close(); //Close file
		
		// Initialize Books
        
		// Initialize Journals
        
        //-------------------------------------------------------------------------
        // Initialization finished
        //-------------------------------------------------------------------------
		
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
				case 1: library.addNewUser();
						break;
				case 2: library.addNewDocument();
						break;
				case 3: library.searchDocuments();
						break;
				case 4: library.borrowDocument();
						break;
				case 5: library.returnDocument();
						break;
				case 6: library.displayLoans();
						break;
				case 7: library.save();
						break;
				default: System.out.println("Invalid selection. Enter the number of the option.");
				}
			} while (selection != 7);
		} catch (Exception e) {
				System.out.println("Error: " + e);
		}
		// Close scanner input stream
		in.close();
		System.out.println("Program Terminated");
	}
}