package edu.txstate.library;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/** 
 * This class represents the library system's data, including documents and accounts.
 * @author Hannah Burzynski, Alexander Wagstaff
 */
public class Library {

	private int numDocsBorrowed;
	private Set<Document> document;
	private Set<Document> docsBorrowed;
	private Set<Document> documents;
	private Set<Account> accounts;
	
	Library() {
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

		// Read from files
		// id, name, type
		Set<Account> accounts = new HashSet<Account>();
		while (inFile.hasNext()) {
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
		inFile = null;

		try {
			inFile = new Scanner(new FileReader("res/books.txt"));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		//Read from files
		// title, publisher, date, isbn, copies, author
		Set<Book> books = new HashSet<Book>();
		while (inFile.hasNext()) {
			String line = inFile.nextLine();
			String[] words = line.split("\t");
			
			// Add book to set
			books.add(new Book(words[0], words[1], words[2], words[3], Integer.parseInt(words[4]), words[5], false));
		}
		// TEST - display the set
		for (Book book : books) {
			System.out.println(book.getTitle() + "\t" + book.getPublisher() + "\t" + book.getPublicationDate());
		}
		inFile.close();
		
		Set<Document> documents = new HashSet<Document>();

		// Initialize Journals
		// title, date, volume, issue, publisher, articles

		//-------------------------------------------------------------------------
		// Initialization finished
		//-------------------------------------------------------------------------
		
	}

	/** 
	* @return the accounts
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Set<Account> getAccounts() {
		// begin-user-code
		return accounts;
		// end-user-code
	}

	private Console console;

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
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private Set<Account> account;

	/**
	* This function returns the set of documents borrowed.
	* @return the docsBorrowed
	*/
	public Set<Document> getDocsBorrowed() {
		return docsBorrowed;
	}

	/**
	* This function sets the documents borrowed. 
	* @param docsBorrowed the docsBorrowed to set
	*/
	public void setDocsBorrowed(Set<Document> docsBorrowed) {
		this.docsBorrowed = docsBorrowed;
	}

	/**
	* This function returns the set of documents. 
	* @return the documents
	*/
	public Set<Document> getDocuments() {
		return documents;
	}

	/** 
	* This function sets the documents.
	* @param documents the documents to set
	*/
	public void setDocuments(Set<Document> documents) {
		this.documents = documents;
	}

	/** 
	* This function sets the accounts.
	* @param accounts the accounts to set
	*/
	public void setAccounts(Set<Account> accounts) {
		this.accounts = accounts;
	}

	/**
	* This function returns the console. 
	* @return the console
	*/
	public Console getConsole() {
		return console;
	}

	/**
	* This function sets the console. 
	* @param console the console to set
	*/
	public void setConsole(Console console) {
		this.console = console;
	}

	/** 
	* <!-- begin-UML-doc -->
	* This&nbsp;function&nbsp;sends&nbsp;an&nbsp;overdueBookReminder&nbsp;message&nbsp;to&nbsp;the&nbsp;user&nbsp;if&nbsp;they&nbsp;have&nbsp;not&nbsp;returned&nbsp;the&nbsp;document&nbsp;by&nbsp;the&nbsp;time&nbsp;the&nbsp;loan&nbsp;has&nbsp;ended.<br>@param&nbsp;account<br>@return
	* <!-- end-UML-doc -->
	* @param account
	* @param Accountaccount
	* @return
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Object overdueBookReminder(Object account, Object Accountaccount) {
		// begin-user-code
		// TODO Auto-generated method stub
		return null;
		// end-user-code
	}

	/**
	* This function returns the set of accounts. 
	* @return the account
	*/
	public Set<Account> getAccount() {
		return accounts;
	}

	/** 
	* @param account the account to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setAccount(Set<Account> account) {
		// begin-user-code
		this.account = account;
		// end-user-code
	}

	/**
	* This function returns the documents. 
	* @return the document
	*/
	public Set<Document> getDocument() {
		return document;
	}

	/**
	* This function sets the value of the document. 
	* @param document the document to set
	*/
	public void setDocument(Set<Document> document) {
		this.document = document;
	}

	/** 
	* This function sends an overdueBookReminder message to the user if they have not returned the document by the time the loan has ended.
	* @param account
	* @return
	*/
	public Object overdueBookReminder(Object account) {
		// TODO Auto-generated method stub
		return null;
	}

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
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void checkoutDocument() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
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
		// TODO Auto-generated method stub

	}
}