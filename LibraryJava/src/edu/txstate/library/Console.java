package edu.txstate.library;

import java.util.Scanner;

/** 
 * This class is the user interface for the library system.
 * @author Hannah Burzynski, Alexander Wagstaff
 */
public class Console {
	
	private static Library library = null;

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void addNewUser() {
		// TODO Auto-generated method stub

	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void addNewDocument() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void searchDocuments() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void borrowDocument() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void returnDocument() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void displayLoans() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void saveAndExit() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}
	
	public static void main(String args[]) {
		Console console = new Console();
		Scanner in = new Scanner(System.in);
		// Initialize singleton library
		if (library == null) {
			library = new Library();
		}
		
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
				case 1: console.addNewUser(); System.out.println("1");
						break;
				case 2: console.addNewDocument();System.out.println("2");
						break;
				case 3: console.searchDocuments();System.out.println("3");
						break;
				case 4: console.borrowDocument();System.out.println("4");
						break;
				case 5: console.returnDocument();System.out.println("5");
						break;
				case 6: console.displayLoans();System.out.println("6");
						break;
				case 7: console.saveAndExit();System.out.println("7");
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