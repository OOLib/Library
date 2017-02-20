/**
 * 
 */
package edu.txstate.library;

import java.util.Set;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author hannahburzynski
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class StaffAccount extends Account {
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private Set<Loan> loan;

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