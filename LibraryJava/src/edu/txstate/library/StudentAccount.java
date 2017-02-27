package edu.txstate.library;

import java.util.Set;

/** 
 * This class contains the student account
 * @author Hannah Burzynski, Alexander Wagstaff
 */
public class StudentAccount extends Account {
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private Set<Loan> loan;
	private static final int MAX_BOOK_LOAN_DURATION = 6; // Duration in months
	private static final int MAX_BORROWED_AMOUNT = 6; // maximum number of items able to be borrowed at a time

	StudentAccount(int id, String name, String type) {
		this.id = id;
		this.name = name;
		this.type = type;
	}

	StudentAccount() {
		this.id = 0;
		this.name = "";
		this.type = "STUDENT";
	}

	/** 
	* @return the loan
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Set<Loan> getLoan() {
		// begin-user-code
		return loan;
		// end-user-code
	}

	/** 
	* @param loan the loan to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setLoan(Set<Loan> loan) {
		// begin-user-code
		this.loan = loan;
		// end-user-code
	}
	
	public int getMaxLoanDuration() {
		return MAX_BOOK_LOAN_DURATION;
	}

}