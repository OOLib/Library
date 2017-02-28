package edu.txstate.library;

import java.util.HashSet;
import java.util.Set;

/** 
 * This class represents a faculty account
 * @author Hannah Burzynski, Alexander Wagstaff
 */
public class FacultyAccount extends Account {

	private static final int MAX_BOOK_LOAN_DURATION = 12; // Duration in months
	private static final int MAX_BORROWED_AMOUNT = 12; // maximum number of items able to be borrowed at a time

	/** 
	* This is a constructor function.
	*/
	FacultyAccount(int id, String name, String type) {
		this.id = id;
		this.name = name;
		// TODO remove type from constructor, always FACULTY type
		this.type = type;
		this.loans = new HashSet<Loan>();
	}

	/** 
	* This is a constructor function.
	*/
	FacultyAccount() {
		this.id = 0;
		this.name = "";
		this.type = "FACULTY";
	}

	/** 
	* @return the loan
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Set<Loan> getLoan() {
		// begin-user-code
		return loans;
		// end-user-code
	}

	/** 
	* @param loan the loan to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setLoan(Set<Loan> loan) {
		// begin-user-code
		this.loans = loan;
		// end-user-code
	}
	
	public int getMaxBookLoanDuration() {
		return MAX_BOOK_LOAN_DURATION;
	}
}