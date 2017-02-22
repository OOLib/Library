package edu.txstate.library;

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
	public void setAccount(Set<Account> accounts) {
		this.accounts = accounts;
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
	public void save() {
		// TODO Auto-generated method stub

	}
}