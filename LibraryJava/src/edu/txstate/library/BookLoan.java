package edu.txstate.library;

/** 
 * This class represents a book loan.
 * @author Hannah Burzynski, Alexander Wagstaff
 */
public class BookLoan extends Loan {

	private Book book;
	
	/** 
	* This is a constructor function.
	*/
	BookLoan(Book book) {
		this.book = book;
	}
	
	/** 
	* This is a default constructor function.
	*/
	BookLoan() {
		this.book = null;
	}

	/** 
	* @return the book
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Book getBook() {
		// begin-user-code
		return book;
		// end-user-code
	}

	/** 
	* @param book the book to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setBook(Book book) {
		// begin-user-code
		this.book = book;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void extendDuration() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}
}