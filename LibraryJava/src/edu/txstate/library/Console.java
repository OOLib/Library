package edu.txstate.library;

import java.util.Scanner;

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
		try {
			// Get menu selection
			int selection = 0;
			do {
				// Menu display
				System.out.println("Welcome to the Library System. Select an option below:\n" + "1. Add a new user.\n"
						+ "2. Add a new document.\n" + "3. Search the library.\n" + "4. Borrow a document.\n"
						+ "5. Return a document.\n" + "6. Display all loans.\n" + "7. Save and exit.\n");
				try{
				selection = Integer.parseInt(in.nextLine());
				}catch(NumberFormatException e)
				{
				System.out.println("Not a number, please enter a number");	
				}
				// Execute menu selection
				switch (selection) {
				case 1:
					library.addNewUser(in);
					break;
				case 2:
					library.addNewDocument(in);
					break;
				case 3:
					library.searchLibrary(in);
					break;
				case 4:
					library.borrowDocument();
					break;
				case 5:
					library.returnDocument();
					break;
				case 6:
					library.displayLoans();
					break;
				case 7:
					library.save();
					break;
				default:
					System.out.println("Invalid selection. Enter the number of the option.");
				}
			} while (selection != 7);
		} catch (Exception e) { // TODO: Figure out why No Such Element Exception is being thrown
			System.out.println("Error: " + e);
		}
		// Close scanner input stream
		in.close();
		System.out.println("Thanks for using the Library system.");
	}
}