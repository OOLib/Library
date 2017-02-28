package edu.txstate.library;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/** 
 * This class represents the library system's data, including documents and accounts.
 * @author Hannah Burzynski, Alexander Wagstaff
 */
public class Library {

	private int numDocsBorrowed;
	private Set<Loan> loans;
	private Set<Document> documents;
	private Set<Account> accounts;
	
	Library() {
		//-------------------------------------------------------------------------
		// Read library data from files
		//-------------------------------------------------------------------------
		
		//Initialize directories
		accounts = new HashSet<Account>();
		documents = new HashSet<Document>();
		
		// I/O
		Scanner inFile = null;
		Scanner bookFile = null;
		
		// Set file readers for output/saved data documents
		// to see if they are empty
		// if the data file is empty the library needs to be initialized with pre-defined data
		try {
			bookFile = new Scanner(new FileReader("res/book-data.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//-------------------------
		// Read from user file
		//-------------------------
		// int id, String name, String type
		try {
			// If the user has not used the system before, then initialize with some pre-defined data
			if (!(bookFile.hasNext())){
				inFile = new Scanner(new FileReader("res/user-initial.txt"));
			} else {
				inFile = new Scanner(new FileReader("res/user-data.txt"));
			}
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		while (inFile.hasNext()) {
			String line = inFile.nextLine();
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
		/*
		for (Account account : accounts) {
			System.out.println(account.getId() + "\t" + account.getName() + "\t" + account.getType());
		}*/
		inFile.close(); //Close file

		//-------------------------
		// Read from book file
		//-------------------------
		// String title, String publisher, String date, String isbn, int copies, String(comma delimited)author
		
		try {
			// If the user has not used the system before, then initialize with some pre-defined data
			if (!(bookFile.hasNext())){
				inFile = new Scanner(new FileReader("res/book-initial.txt"));
			} else {
				inFile = new Scanner(new FileReader("res/book-data.txt"));
			}
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		//Read from files
		while (inFile.hasNext()) {
			String line = inFile.nextLine();
			String[] words = line.split("\t");
			
			// Add book to set
			documents.add(new Book(words[0], words[1], words[2], words[3], Integer.parseInt(words[4]), words[5], false));
		}
		// TEST - display the set
		/*
		for (Document document : documents) {
			if (document instanceof Book) {
				Book book = (Book) document;
				System.out.println(book.getTitle() + "\t" + book.getIsbn());
			}
		}*/
		inFile.close();

		//-------------------------
		// Read from journal file
		//-------------------------
		// String title, date, volume, issue, publisher, articles, (for each article, in order) (article)firstpage, (article)lastpage
		try {
			// If the user has not used the system before, then initialize with some pre-defined data
			if (!(bookFile.hasNext())){
				inFile = new Scanner(new FileReader("res/journal-initial.txt"));
			} else {
				inFile = new Scanner(new FileReader("res/journal-data.txt"));
			}
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		//Read from files
		while (inFile.hasNext()) {
			String line = inFile.nextLine();
			String[] words = line.split("\t");
			
			// Add journal to set
			documents.add(new Journal(words[0], words[1], Integer.parseInt(words[2]), Integer.parseInt(words[3]), words[4], words[5]));
		}
		// TEST - display the set
		/*
		for (Document document : documents) {
			if (document instanceof Journal) {
				Journal journal = (Journal) document;
				System.out.println(journal.getTitle() + "\t" + journal.getVolume());
			}
		}*/
		
		inFile.close();
		bookFile.close();

		//-------------------------------------------------------------------------
		// Data reading finished
		//-------------------------------------------------------------------------
		
	}

	

	/**
	* This function returns the total number of documents borrowed in the library. 
	* @return the numDocsBorrowed
	*/
	public int getNumDocsBorrowed() {
		return numDocsBorrowed;
	}

	/**
	* This function sets the value of the total number of documents borrowed in the library. 
	* @param numDocsBorrowed the numDocsBorrowed to set
	*/
	public void setNumDocsBorrowed(int numDocsBorrowed) {
		this.numDocsBorrowed = numDocsBorrowed;
	}

	/** 
	* This function notifies a user that they have an overdue book.
	* @param account
	* @return
	*/
	public void overdueBookReminder(Account account) {
		// begin-user-code
		// TODO Auto-generated method stub
		// end-user-code
	}

	/** 
	* This function sends an overdueBookReminder message to the user if they have not returned the document by the time the loan has ended.
	* @param account
	*/
	public void overdueBookReminder(Object account) {
		// TODO Auto-generated method stub
	}

	/** 
	* This function adds a new user to the library system.
	*/
	public void addNewUser() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Select the type of User to add");
		System.out.println("1. Add a new User Account");
		System.out.println("2. Add a new faculty Account");
		System.out.println("3. Add a new Librarian Account");
		
		int choice = 0;
		
		try{
			choice = Integer.parseInt(scan.nextLine());
		}catch (NumberFormatException e) {
			e.printStackTrace();
		}
		
		switch(choice)
		{
		case 1:
			String[] userInfo = new String[3];
			System.out.println("Enter the user id: ");
			userInfo[0] = scan.nextLine();
			System.out.println("Enter the student user name: ");
			userInfo[1] = scan.nextLine();
			userInfo[3] = "Student";
			accounts.add(new StudentAccount(Integer.parseInt(userInfo[0]), userInfo[1], userInfo[2]));
			break;
			
		case 2:
			String[] staffInfo = new String[3];
			System.out.println("Enter the staff id: ");
			staffInfo[0] = scan.nextLine();
			System.out.println("Enter the staff user name: ");
			staffInfo[1] = scan.nextLine();
			staffInfo[3] = "Staff";
			accounts.add(new StaffAccount(Integer.parseInt(staffInfo[0]), staffInfo[1], staffInfo[2]));
			break;
			
		case 3:
			String[] librarianInfo = new String[3];
			System.out.println("Enter the Librarian id: ");
			librarianInfo[0] = scan.nextLine();
			System.out.println("Enter the Librarian user name: ");
			librarianInfo[1] = scan.nextLine();
			librarianInfo[3] = "Librarian";
			accounts.add(new LibrarianAccount(Integer.parseInt(librarianInfo[0]), librarianInfo[1], librarianInfo[2]));
			break;
		
		default:
			System.out.println("Not a valid account selection. Aborting entry.");
			break;
		}
		scan.close();
		// TODO correct case switch depending on requirements

	}

	/** 
	* This function adds a new document to the library system.
	*/
	public void addNewDocument() {
		// TODO Figure out Null Pointer Exception
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Select the Type of document to add");
		System.out.println("1. Add a book");
		System.out.println("2. Add an article");
		System.out.println("3. Add a journal");
		System.out.println("4. Add a conference proceeding");
		
		int choice = 0;
		
		try{
			choice = Integer.parseInt(scan.nextLine());
		}catch (NumberFormatException e) {
			e.printStackTrace();
		}
		
		switch(choice)
		{
		case 1:
			String[] bWords = new String[6];
			System.out.println("Enter the book Title: ");
			bWords[0] = scan.nextLine();
			
			System.out.println("Enter the publisher: ");
			bWords[1] = scan.nextLine();
			
			System.out.println("Enter the date of publication: ");
			bWords[2] = scan.nextLine();
			
			System.out.println("Enter the ISBN: ");
			bWords[3] = scan.nextLine();
			
			System.out.println("Enter the number of copies: ");
			bWords[4] = scan.nextLine();
			
			System.out.println("Enter the author. For a List of authors, seperate by a comma: ");
			bWords[5] = scan.nextLine();
						
			documents.add(new Book(bWords[0], bWords[1], bWords[2], bWords[3], Integer.parseInt(bWords[4]), bWords[5], false));
			break;
			
		case 2:
			break;
			
		case 3:
			String[] jWords = new String[6];
			System.out.println("Enter the journal title: ");
			jWords[0] = scan.nextLine();
			
			System.out.println("Enter the date of publication: ");
			jWords[1] = scan.nextLine();
			
			System.out.println("Enter the volume number: ");
			jWords[2] = scan.nextLine();
			
			System.out.println("Enter the issue number: ");
			jWords[3] = scan.nextLine();
			
			System.out.println("Enter the Publisher: ");
			jWords[4] = scan.nextLine();
			
			System.out.println("Enter the articles, seperated by a comma: ");
			jWords[5] = scan.nextLine();
			
			documents.add(new Journal(jWords[0], jWords[1], Integer.parseInt(jWords[2]), Integer.parseInt(jWords[3]), jWords[4], jWords[5]));
			break;
			
		case 4:
			break;
			
		default: 
			System.out.println("Not a valid document type selection. Aborting Entry");
			break;
			
		}
		scan.close();
		
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
	* This function allows a user to checkout a document.
	*/
	public void checkoutDocument() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/** 
	* This function searches the library for a document.
	*/
	public void searchLibrary() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
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
	public void save() {
		
		/*

		// TODO Auto-generated method stub
		
		PrintWriter outFile = null;
		
		//-------------------------
		// Write to book file
		//-------------------------
		// String title, String publisher, String date, String isbn, int copies, String(comma delimited)author
		
		try {
			outFile = new PrintWriter("res/book-data.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (Document document : documents) {
			if (document instanceof Book) {
				Book book = (Book) document;
				outFile.print(book.getTitle() + "\t" + book.getPublisher() + "\t" + book.getIsbn() + "\t" + book.getNumCopies());
			
				String authorString = "";
				for (Author author : book.authors) {
					authorString.concat(author.getName());
					authorString.concat(",");
				}
				//remove last comma
				System.out.print(authorString);
				//System.out.println(authorString.length());
				//authorString = authorString.substring(0, authorString.length()-1);
				//add newline
				//authorString.concat("\n");
				
			}
		}
		outFile.close();
		
		//-------------------------
		// Write to journal file
		//-------------------------
		// String title, date, volume, issue, publisher, articles(template: title.firstPage.LastPage, articles comma-delimited, attributes period-delimited)
		
		try {
			outFile = new PrintWriter("res/journal-data.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (Document document : documents) {
			if (document instanceof Journal) {
				Journal journal = (Journal) document;
				outFile.println(journal.getTitle() + "\t" + journal.getVolume());
			}
		}
		outFile.close();
		
		//-------------------------
		// Write to user file
		//-------------------------
		// int id, String name, String type
		
		try {
			outFile = new PrintWriter("res/user-data.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (Account account : accounts) {
			outFile.println(account.getId() + "\t" + account.getName() + "\t" + account.getType());
		}
		outFile.close();
		
		
		*/
	}
}