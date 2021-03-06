package edu.txstate.library;

/** 
 * This class represents a loan.
 * @author Hannah Burzynski, Alexander Wagstaff
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
	public void setDocument(Document document) {
		// begin-user-code
		this.document = document;
		// end-user-code
	}
	
	/**
	 * This function determines whether two objects are equal
	 * @param loan object that will be compared to the invoking object
	 * @return true if the object has the same values
	 */
	@Override public boolean equals(Object o)
	{
		if (o == null)
			return false;
		
		if(!(o instanceof Loan))
			return false;
		
		Loan oLoan = (Loan) o;
		
		if(this.account.equals(oLoan.account) && this.document.equals(oLoan.document))
			return true;
		else
			return false;
	}
	/**
	 * This function determines the unique hash code for the object
	 * @return hash
	 */
	@Override public int hashCode()
	{
		return account.hashCode() + document.hashCode();
	}
	/**
	 * This function displays the object's values as one string
	 * @return string of all values
	 */
	@Override public String toString()
	{
		return "Account: " + account.toString() + "\nDocument: " + document.toString() + "\nDuration: " + duration;
	}
}