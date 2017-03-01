package edu.txstate.library;

/** 
 * This class represents a loan.
 * @author Hannah Burzynski, Alexander Wagstaff
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public abstract class Loan {

	protected Account account;
	protected Document document;
	protected int duration;
	
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
	
	/**
	* This function returns the account of the loan. 
	* @return account of loan
	*/
	public Account getAccount() {
		// begin-user-code
		return account;
		// end-user-code
	}

	/**
	* This function sets the account of the loan. 
	* @param account of the loan
	*/
	public void setAccount(Account account) {
		// begin-user-code
		this.account = account;
		// end-user-code
	}
	
	/**
	* This function returns the document of the loan. 
	* @return document of loan
	*/
	public Document getDocument() {
		// begin-user-code
		return document;
		// end-user-code
	}

	/**
	* This function sets the document of the loan. 
	* @param document of the loan
	*/
	public void setDuration(Document document) {
		// begin-user-code
		this.document = document;
		// end-user-code
	}
	
}