package edu.txstate.library;

import java.util.Set;

/** 
 * This abstract class represents an account in the library system.
 * @author Hannah Burzynski, Alexander Wagstaff
 */
public abstract class Account {
	
	private int userId;
	private int numDocsBorrowed;
	private Set<Loan> loans;
	
	/** 
	* This function returns the user's ID.
	* @return the userId
	*/
	public int getUserId() {
		return userId;
	}

	/** 
	* This function set's the user's ID.
	* @param userId the userId to set
	*/
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	/**
	* This function returns the number of documents borrowed.
	* @return the numDocsBorrowed
	*/
	public int getNumDocsBorrowed() {
		return numDocsBorrowed;
	}

	/**
	* This function sets the number of documents borrowed. 
	* @param numDocsBorrowed the numDocsBorrowed to set
	*/
	public void setNumDocsBorrowed(int numDocsBorrowed) {
		this.numDocsBorrowed = numDocsBorrowed;
	}

	/**
	* This function returns all loans for the account.  
	* @return the loans
	*/
	public Set<Loan> getLoans() {
		return loans;
	}

	/** 
	* This function sets the loans.
	* @param loans the loans to set
	*/
	public void setLoans(Set<Loan> loans) {
		this.loans = loans;
	}

	/** 
	* This function adds a loan to the library.
	*/
	public void addLoan() {
		// TODO Auto-generated method stub

	}

	/** 
	* This function removes a loan from the account.
	*/
	public void removeLoan() {
		// TODO Auto-generated method stub

	}
}