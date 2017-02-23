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
		// Initialize User Accounts
        Scanner inFile = null;
        
		try {
			inFile = new Scanner(new FileReader("res/users.txt"));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
        //Read from files
		StudentAccount account = null;
		Set<Account> accounts = null;
		while(inFile.hasNext()){
	        String line = inFile.nextLine();
	        System.out.println(line);
	        String[] words = line.split("\t");
	        
	        int id = Integer.parseInt(words[0]);
	        String name = words[1];
	        String type = words[2];
	        
	        // Add Student Accounts
	        if (type.equals("Student")) {
	        	account = new StudentAccount(id, name, type);
	        }
	        accounts = new HashSet<Account>();
	        accounts.add(account);
	        
	        // TEST
	        // Add Faculty Accounts
	        // Add Staff Accounts
	        
		}
		// TEST - display the set
		System.out.println(accounts);
        inFile.close(); //Close file
		
		// Initialize Books
		
		// Initialize Journals
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