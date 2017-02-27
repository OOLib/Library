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
public abstract class Loan {
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private StaffAccount staffAccount;

	/** 
	* @return the staffAccount
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public StaffAccount getStaffAccount() {
		// begin-user-code
		return staffAccount;
		// end-user-code
	}

	/** 
	* @param staffAccount the staffAccount to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setStaffAccount(StaffAccount staffAccount) {
		// begin-user-code
		this.staffAccount = staffAccount;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private FacultyAccount facultyAccount;

	/** 
	* @return the facultyAccount
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public FacultyAccount getFacultyAccount() {
		// begin-user-code
		return facultyAccount;
		// end-user-code
	}

	/** 
	* @param facultyAccount the facultyAccount to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setFacultyAccount(FacultyAccount facultyAccount) {
		// begin-user-code
		this.facultyAccount = facultyAccount;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private StudentAccount studentAccount;

	/** 
	* @return the studentAccount
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public StudentAccount getStudentAccount() {
		// begin-user-code
		return studentAccount;
		// end-user-code
	}

	/** 
	* @param studentAccount the studentAccount to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setStudentAccount(StudentAccount studentAccount) {
		// begin-user-code
		this.studentAccount = studentAccount;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private int duration;

	/** 
	* @return the duration
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public int getDuration() {
		// begin-user-code
		return duration;
		// end-user-code
	}

	/** 
	* @param duration the duration to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setDuration(int duration) {
		// begin-user-code
		this.duration = duration;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private Document document;

	/** 
	* @return the document
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Document getDocument() {
		// begin-user-code
		return document;
		// end-user-code
	}

	/** 
	* @param document the document to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setDocument(Document document) {
		// begin-user-code
		this.document = document;
		// end-user-code
	}
}