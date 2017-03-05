package edu.txstate.library;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/** 
 * This class represents the library system which handles the storage and modification of data, including documents and accounts.
 * @author Hannah Burzynski, Alexander Wagstaff
 */
public class Library {

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
		loans = new HashSet<Loan>();
		
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
		inFile.close(); //Close file

		//-------------------------
		// Read from book file
		//-------------------------
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
		
		inFile.close();

		//-------------------------
		// Read from journal file
		//-------------------------
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
			documents.add(new Journal(words[0], words[1], Integer.parseInt(words[2]), Integer.parseInt(words[3]), words[4], words[5], Integer.parseInt(words[6])));
		}
		
		inFile.close();
		//-------------------------
		// Read from conferenceProceeding file
		//-------------------------
		try {
			// If the user has not used the system before, then initialize with some pre-defined data
			if (!(bookFile.hasNext())){
				inFile = new Scanner(new FileReader("res/conference-proceeding-initial.txt"));
			} else {
				inFile = new Scanner(new FileReader("res/conference-proceeding-data.txt"));
			}
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		//Read from files
		while (inFile.hasNext()) {
			String line = inFile.nextLine();
			String[] words = line.split("\t");
			
			// Add conference proceeding to set
			documents.add(new ConferenceProceeding(words[0], words[1], words[2], words[3], Integer.parseInt(words[4]), words[5], words[6], words[7]));
		}
		
		inFile.close();
		
		//-------------------------
		// Read from loan file
		//-------------------------
		try {
			inFile = new Scanner(new FileReader("res/loan-data.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		while (inFile.hasNext()) {
			Account account = new StudentAccount();
			Document document = new Book();
			// Divide line into parameters
			String line = inFile.nextLine();
			String[] words = line.split("\t");
			
			// Temporary objects for search
			String documentName;
			int accountId;
			StudentAccount tempAccount = new StudentAccount();
			Book tempDocument = new Book();

			accountId = Integer.parseInt(words[0]);
			tempAccount.setId(accountId);
			
			// Search for Account
			if(accounts.contains(tempAccount)) {
				for(Account a: accounts)
				{
					if(a.equals(tempAccount))
					{
						account = a;
					}
				}
			}

			documentName = words[1];
			tempDocument.setTitle(documentName);
			
			// Search for Document
			if(documents.contains(tempDocument)) {
				for(Document d : documents)
				{
					if(d.equals(tempDocument))
					{
						document = d;
					}
				}
			}

			int duration = Integer.parseInt(words[2]);

			// Add book loan
			if (document instanceof Book) {
				loans.add(new BookLoan((Book)document, account, duration));
			}
			// Add journal loan
			if (document instanceof Journal) {
				loans.add(new JournalLoan((Journal)document, account, duration));
			}
			// Add conference proceeding loan
			if (document instanceof ConferenceProceeding) {
				loans.add(new ConferenceProceedingLoan((ConferenceProceeding)document, account, duration));
			}
		}
		inFile.close(); //Close file
		
		//-------------------------------------------------------------------------
		// Data reading finished
		//-------------------------------------------------------------------------
		bookFile.close();
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
	* This function adds a new user to the library system.
	*/
	public void addNewUser(Scanner in) {

		System.out.println("Select the type of User to add");
		System.out.println("1. Add a student");
		System.out.println("2. Add a faculty");
		System.out.println("3. Add a librarian");
		
		int choice = 0;
		
		try{
			choice = Integer.parseInt(in.nextLine());
		}catch (NumberFormatException e) {
			e.printStackTrace();
		}
		
		switch(choice)
		{
		case 1:
			String[] userInfo = new String[3];
			System.out.println("Enter the user id: ");
			userInfo[0] = in.nextLine();
			System.out.println("Enter the student user name: ");
			userInfo[1] = in.nextLine();
			userInfo[2] = "Student";
			accounts.add(new StudentAccount(Integer.parseInt(userInfo[0]), userInfo[1], userInfo[2]));
			break;
			
		case 2:
			String[] staffInfo = new String[3];
			System.out.println("Enter the staff id: ");
			staffInfo[0] = in.nextLine();
			System.out.println("Enter the staff user name: ");
			staffInfo[1] = in.nextLine();
			staffInfo[2] = "Staff";
			accounts.add(new StaffAccount(Integer.parseInt(staffInfo[0]), staffInfo[1], staffInfo[2]));
			break;
			
		case 3:
			String[] librarianInfo = new String[3];
			System.out.println("Enter the Librarian id: ");
			librarianInfo[0] = in.nextLine();
			System.out.println("Enter the Librarian user name: ");
			librarianInfo[1] = in.nextLine();
			librarianInfo[2] = "Librarian";
			accounts.add(new LibrarianAccount(Integer.parseInt(librarianInfo[0]), librarianInfo[1], librarianInfo[2]));
			break;
		
		default:
			System.out.println("Not a valid account selection. Aborting entry.");
			break;
		}
		// TODO correct case switch depending on requirements

	}

	/** 
	* This function adds a new document to the library system.
	*/
	public void addNewDocument(Scanner in) {

		System.out.println("Select the Type of document to add");
		System.out.println("1. Add a book");
		System.out.println("2. Add a journal");
		System.out.println("3. Add a conference proceeding");
		
		int choice = 0;
		
		try{
			choice = Integer.parseInt(in.nextLine());
		}catch (NumberFormatException e) {
			System.out.println("Error: Entry must be an integer.");
			System.out.println(" ");
		}
		
		switch(choice)
		{
		case 1:
			String[] bWords = new String[6];
			System.out.println("Enter the book Title: ");
			bWords[0] = in.nextLine();
			
			System.out.println("Enter the publisher: ");
			bWords[1] = in.nextLine();
			
			System.out.println("Enter the date of publication: ");
			bWords[2] = in.nextLine();
			
			System.out.println("Enter the ISBN: ");
			bWords[3] = in.nextLine();
			
			System.out.println("Enter the number of copies: ");
			bWords[4] = in.nextLine();
			
			System.out.println("Enter the author. For a List of authors, seperate by a comma: ");
			bWords[5] = in.nextLine();
			
			try{
				documents.add(new Book(bWords[0], bWords[1], bWords[2], bWords[3], Integer.parseInt(bWords[4]), bWords[5], false));
			}catch(NumberFormatException e) {
				System.out.println("Error adding book. Number of copies must be an integer. Aborting insertion.");
				System.out.println(" "); // Print an empty line for formatting
			}
			break;
			
		case 2:
			String[] jWords = new String[6];
			System.out.println("Enter the journal title: ");
			jWords[0] = in.nextLine();
			
			System.out.println("Enter the date of publication: ");
			jWords[1] = in.nextLine();
			
			System.out.println("Enter the volume number: ");
			jWords[2] = in.nextLine();
			
			System.out.println("Enter the issue number: ");
			jWords[3] = in.nextLine();
			
			System.out.println("Enter the Publisher: ");
			jWords[4] = in.nextLine();
			
			System.out.println("Enter the article(s) in the format \"<title>.<firstPage>.<lastPage>\".Articles are seperated by a comma.");
			jWords[5] = in.nextLine();
			
			System.out.println("Enter the number of copies");
			jWords[6] = in.nextLine();
			
			try{
				documents.add(new Journal(jWords[0], jWords[1], Integer.parseInt(jWords[2]), Integer.parseInt(jWords[3]), jWords[4], jWords[5], Integer.parseInt(jWords[6])));
			}catch(NumberFormatException e) {
				System.out.println("Error adding journal. Volume and Issue numbers must be integers. aborting insertion ");
				System.out.println(" "); // Print an empty line for formatting
			}
			break;
			
		case 3:
			break;
			
		default: 
			System.out.println("Not a valid document type selection. Aborting Entry");
			break;
			
		}
	}

	/** 
	* This function allows the user to search for a document based on title.
	*/
	public Document searchDocuments(Scanner in) {
		
		System.out.println("Enter the title of a document to search for");
		String query = in.nextLine();
		Book search = new Book(); // can be any Document type. Book used for convenience
		search.setTitle(query);
		
		if(documents.contains(search))
		{
			for(Document doc : documents)
			{
				if(doc.equals(search))
					return doc;
			}
		}
		else
			System.out.println("Document was not found in the system.");
			Document dummy = new Book();
			return dummy;
	}

	/** 
	* This function searches the library for a document.
	*/
	public void searchLibrary(Scanner in) {
		System.out.println("Please enter the type of search you wish to conduct.");
		System.out.println("1. Search for a document by title");
		System.out.println("2. Search for document(s) by author");
		int choice = 0;
		
		try{
			choice = Integer.parseInt(in.nextLine());
		}catch(NumberFormatException e) {
			System.out.println("Error: not a valid selection. Aborting search.");
			System.out.println(" "); // Print a blank line for formatting
		}
		
		switch (choice) {
		
		case 1:
			Document doc = searchDocuments(in);
			if(doc.getNumberOfCopies() != 0) // if document was found
				doc.displayDocument();
			break;
		
		case 2:
			searchAuthor(in);
			break;
		
		default:
			System.out.println("Not a valid search type selection. Aborting search attempt");
			break;
		}
	}
	
	/** 
	* This function allows the user to search for a document based on author.
	*/
	public void searchAuthor(Scanner in)
	{
		System.out.println("Enter the name of an author to search for");
		String name = in.nextLine();
		Author authorQuery = new Author(name);
		for(Document doc : documents)
		{
			if(doc.authors.contains(authorQuery))
				System.out.println(doc);
		}
	}

	/** 
	* This function allows the user to borrow a document.
	*/
	public void borrowDocument(Scanner in) {
		// Parameters for loan
		Document document = null;
		Account account = null;
		int duration = 0;
		
		// Temporary objects for search
		String documentName;
		int accountId;
		StudentAccount tempAccount = new StudentAccount();
		Book tempDocument = new Book();
		
		try
		{
			System.out.println("Enter the ID of the user borrowing the document");
			accountId = Integer.parseInt(in.nextLine());
			tempAccount.setId(accountId);
			
			// Search for Account
			if(accounts.contains(tempAccount)) {
				for(Account a: accounts)
				{
					if(a.equals(tempAccount))
					{
						account = a;
					}
				}
			}
			else {
				System.out.println("User was not found. Aborting checkout.");
				return;
			}			
			
			System.out.println("Enter the title of the document");
			documentName = in.nextLine();
			tempDocument.setTitle(documentName);
			
			// Search for Document
			if(documents.contains(tempDocument)) {
				for(Document d : documents)
				{
					if(d.equals(tempDocument))
					{
						document = d;
					}
				}
			}
			else {
				System.out.println("Document was not found. Aborting checkout.");
				return;
			}
			
			System.out.println("Enter the duration of the loan (in months)");
			duration = Integer.parseInt(in.nextLine());
			
		}catch(NumberFormatException e)
		{
			System.out.println("Error: Must enter an integer for ID. aborting document return.");
		}
		
		// Check if any copies available for checkout
		if (document.getNumberOfCopies() == 0) {
			System.out.println("No copies available for borrowing. Aborting checkout.");
			return;
		}
		
		// Check max loan duration and max loan amount for faculty and student accounts
		if (account instanceof StudentAccount) {
			StudentAccount temp = (StudentAccount) account;
			if (duration > temp.getMaxLoanDuration()) {
				System.out.println("Duration cannot be greater than max duration allowed. Aborting checkout.");
				return;
			}
			if (numberOfLoansForUser(temp.getId()) > temp.getMaxBorrowedAmount()) {
				System.out.println("User has already borrowed the maximum number of documents. Aborting checkout.");
			}
		}
		
		if (account instanceof FacultyAccount) {
			FacultyAccount temp = (FacultyAccount) account;
			if (duration > temp.getMaxLoanDuration()) {
				System.out.println("Duration cannot be greater than max duration allowed. Aborting checkout.");
				return;
			}
			if (numberOfLoansForUser(temp.getId()) > temp.getMaxBorrowedAmount()) {
				System.out.println("User has already borrowed the maximum number of documents. Aborting checkout.");
			}
		}
		// Add new loan
		if (document instanceof Book) {
			loans.add(new BookLoan((Book)document, account, duration));
		} else if (document instanceof Journal) {
			loans.add(new JournalLoan((Journal)document, account, duration));
		} else if (document instanceof ConferenceProceeding) {
			loans.add(new ConferenceProceedingLoan((ConferenceProceeding)document, account, duration));
		}
		// Decrease number of copies for document
		document.setNumberOfCopies(document.getNumberOfCopies() - 1);
		
		// Display success message
		System.out.println("Document successfully checked out.");
	}
	
	/** 
	* This function allows the user to return a document.
	*/
	public void returnDocument(Scanner in) {
		
		String documentName;
		System.out.println("Enter the ID of the user used to take out the loan");
		try
		{
			// Book and Student account classes used for convenience in search. Any account/document type would work.
			int accountId = Integer.parseInt(in.nextLine());
			StudentAccount tempAccount = new StudentAccount();
			tempAccount.setId(accountId);
			
			System.out.println("Now enter the full title of the document");
			documentName = in.nextLine();
			
			// Declare temporary objects to conduct the search.
			Book tempDocument = new Book();
			tempDocument.setTitle(documentName);
			
			BookLoan tempLoan = new BookLoan();
			tempLoan.setAccount(tempAccount);
			tempLoan.setDocument(tempDocument);
			
			// conduct the search
			if(loans.contains(tempLoan))
			{
				for(Loan l : loans)
				{
					if(l.equals(tempLoan))
					{
						Document doc = l.getDocument();
						doc.setNumberOfCopies(doc.getNumberOfCopies() + 1);
						loans.remove(l);
						System.out.println("Document successfully returned.");
						return;
					}
				}
			}
			else
				System.out.println("Loan was not found. Document was not returned.");
			
			
		}catch(NumberFormatException e)
		{
			System.out.println("Error: Must enter an integer for ID. aborting document return.");
		}
		
	}

	/** 
	* This function displays all the loans.
	*/
	public void displayLoans() {
		// Check if any loans exist
		if(loans.isEmpty()) {
			System.out.println("There are no loans.");
		} else {
			for (Loan loan : loans) {
				System.out.println(loan.toString());
				System.out.print("\n\n");
			}
		}
	}
	

	/** 
	* This function saves the state of the library and exits the system.
	*/
	public void save() {
		
		PrintWriter outFile = null;
		//-------------------------
		// Write to book file
		//-------------------------		
		try {
			outFile = new PrintWriter("res/book-data.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (Document document : documents) {
			if (document instanceof Book) {
				Book book = (Book) document;
				outFile.print(book.getTitle() + "\t" + book.getPublisher() + "\t" + book.getPublicationDate() + "\t" + book.getIsbn() + "\t" + book.getNumberOfCopies() + "\t");
			
				String authorString = new String();
				for (Author author : book.authors) {
					authorString+=author.getName();
					authorString+=",";
				}
				// remove last comma
				authorString = authorString.substring(0, authorString.length()-1);
				outFile.print(authorString);
				// add new line
				outFile.print("\n");	
			}
		}
		outFile.close();
		
		//-------------------------
		// Write to journal file
		//-------------------------
		try {
			outFile = new PrintWriter("res/journal-data.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (Document document : documents) {
			if (document instanceof Journal) {
				Journal journal = (Journal) document;
				outFile.print(journal.getTitle() + "\t" + journal.getPublicationDate() + "\t" + journal.getVolume() + "\t" + journal.getIssueNumber() + "\t" + journal.getPublisher() + "\t");
				
				String articleString = new String();
				for (Article article : journal.getArticles()) {
					articleString+=article.getTitle();
					articleString+=".";
					articleString+=article.getFirstPage();
					articleString+=".";
					articleString+=article.getLastPage();
					articleString+=",";
				}
				// remove last comma
				articleString = articleString.substring(0, articleString.length()-1);
				outFile.print(articleString);
				outFile.print("\t" + journal.getNumberOfCopies());
				// add new line
				outFile.print("\n");	
			}
		}
		outFile.close();
		
		//-------------------------
		// Write to user file
		//-------------------------		
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
		
		//-------------------------
		// Write to loan file
		//-------------------------
		try {
			outFile = new PrintWriter("res/loan-data.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (Loan loan : loans) {
			String type = "";
			if (loan instanceof BookLoan) {
				type = "BOOK";
			} else if (loan instanceof JournalLoan) {
				type = "JOURNAL";
			} else if (loan instanceof ConferenceProceedingLoan) {
				type = "CONFERENCEPROCEEDING";
			} else {
				System.out.println("Invalid loan.");
			}
			
			outFile.print(Integer.toString(loan.getAccount().getId()) + "\t");
			outFile.print(loan.getDocument().getTitle()+ "\t");
			outFile.print(Integer.toString(loan.getDuration())+ "\t");
			outFile.print(type + "\n");
		}
		outFile.close();
		
		//-------------------------
		// Write to conference proceeding file
		//-------------------------		
		try {
			outFile = new PrintWriter("res/conference-proceeding-data.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (Document document : documents) {
			if (document instanceof ConferenceProceeding) {
				ConferenceProceeding conferenceProceeding = (ConferenceProceeding) document;
				outFile.print(conferenceProceeding.getTitle() + "\t");
				//Authors
				String authorString = new String();
				for (Author author : conferenceProceeding.authors) {
					authorString+=author.getName();
					authorString+=",";
				}
				// remove last comma
				authorString = authorString.substring(0, authorString.length()-1);
				outFile.print(authorString + "\t");
				outFile.print(conferenceProceeding.getPublisher() + "\t");
				outFile.print(conferenceProceeding.getPublicationDate() + "\t");
				outFile.print(conferenceProceeding.getNumberOfCopies() + "\t");
				
				String articleString = new String();
				for (Article article : conferenceProceeding.getArticles()) {
					articleString+=article.getTitle();
					articleString+=".";
					articleString+=article.getFirstPage();
					articleString+=".";
					articleString+=article.getLastPage();
					articleString+=",";
				}
				// remove last comma
				articleString = articleString.substring(0, articleString.length()-1);
				outFile.print(articleString + "\t");
				outFile.print(conferenceProceeding.getConferenceLocation() + "\t" + conferenceProceeding.getConferenceDate());
				// add new line
				outFile.print("\n");	
			}
		}
		outFile.close();
	}
	/**
	 * This function returns the number of loans for a specific user.
	 * @param id
	 * @return number of loans for a specific user
	 */
	public int numberOfLoansForUser(int id) {
		int numberOfLoans = 0;
		// Create temp account for search
		StudentAccount tempAccount = new StudentAccount();
		tempAccount.setId(id);
		
		// Total all loans associated with the user
		for(Loan loan: loans)
		{
			if(loan.getAccount().equals(tempAccount))
			{
				numberOfLoans++;
			}
		}
		return numberOfLoans;
	}
}