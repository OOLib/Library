/**
 * 
 */
package edu.txstate.library;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author hannahburzynski
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class Book extends Document {
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private boolean isReserved;

	/** 
	* @return the isReserved
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public boolean isReserved() {
		// begin-user-code
		return isReserved;
		// end-user-code
	}

	/** 
	* @param isReserved the isReserved to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setReserved(boolean isReserved) {
		// begin-user-code
		this.isReserved = isReserved;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private int isbnNumber;

	/** 
	* @return the isbnNumber
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public int getIsbnNumber() {
		// begin-user-code
		return isbnNumber;
		// end-user-code
	}

	/** 
	* @param isbnNumber the isbnNumber to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setIsbnNumber(int isbnNumber) {
		// begin-user-code
		this.isbnNumber = isbnNumber;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private int numCopies;

	/** 
	* @return the numCopies
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public int getNumCopies() {
		// begin-user-code
		return numCopies;
		// end-user-code
	}

	/** 
	* @param numCopies the numCopies to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setNumCopies(int numCopies) {
		// begin-user-code
		this.numCopies = numCopies;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private BookLoan bookLoan;

	/** 
	* @return the bookLoan
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public BookLoan getBookLoan() {
		// begin-user-code
		return bookLoan;
		// end-user-code
	}

	/** 
	* @param bookLoan the bookLoan to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setBookLoan(BookLoan bookLoan) {
		// begin-user-code
		this.bookLoan = bookLoan;
		// end-user-code
	}
}