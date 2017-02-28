package edu.txstate.library;

import java.util.HashSet;
import java.util.Set;

/** 
 * This class represents a loan.
 * @author Hannah Burzynski, Alexander Wagstaff
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public abstract class Loan {

	private Set<Account> accounts;
	private Set<Document> documents;
	private int duration;
	
	/** 
	* This is a default constructor function.
	*/
	Loan() {
		this.accounts = new HashSet<Account>();
		this.documents = new HashSet<Document>();
		this.duration = 0;
	}
	
	/**
	* This function returns the duration of the loan. 
	* @return duration of loan
	*/
	public int getDuration() {
		// begin-user-code
		return duration;
		// end-user-code
	}

	/**
	* This function sets the duration of the loan. 
	* @param duration of the loan
	*/
	public void setDuration(int duration) {
		// begin-user-code
		this.duration = duration;
		// end-user-code
	}
}