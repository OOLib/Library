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

	StudentAccount(int id, String name, String type) {
		this.id = id;
		this.name = name;
		this.type = type;
	}
	
	StudentAccount() {
		this.id = 0;
		this.name = "";
		this.type = "student";
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
}