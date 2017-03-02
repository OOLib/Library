package edu.txstate.library;

/** 
 * This class represents a book loan.
 * @author Hannah Burzynski, Alexander Wagstaff
 */
public class BookLoan extends Loan {
	
	/** 
	* This is a constructor function.
	*/
	BookLoan(Book book, Account account, int duration) {
		this.document = book;
		this.account = account;
		this.duration = duration;
	}
	
	/** 
	* This is a default constructor function.
	*/
	BookLoan() {
		this.document = null;
		this.account = null;
		this.duration = 0;
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void extendDuration(int duration) {
		this.duration = duration;
	}
}