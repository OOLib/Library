package edu.txstate.library;

import java.util.Set;

/** 
 * This class represents a conference proceeding document in the library.
 * @author Hannah Burzynski, Alexander Wagstaff
 */
public class ConferenceProceeding extends Document {

	private int numCopies;
	private Set<Article> articles;
	private ConferenceProceedingLoan conferenceProceedingLoan;
	private String conferenceLocation;
	private String conferenceDate;

	/** 
	* This is a constructor function.
	*/
	ConferenceProceeding(int numCopies, Set<Article> articles, ConferenceProceedingLoan conferenceProceedingLoan, String conferenceLocation, String conferenceDate) {
		this.numCopies = numCopies;
		this.articles = articles;
		this.conferenceProceedingLoan = conferenceProceedingLoan;
		this.conferenceLocation = conferenceLocation;
		this.conferenceDate = conferenceDate;
	}
	/**
	* This is a default constructor function.
	*/	
	ConferenceProceeding() {
		this.numCopies = 0;
		this.articles = null;
		this.conferenceProceedingLoan = null;
		this.conferenceLocation = "";
		this.conferenceDate = "";
	}
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
	* @return the conferenceLocation
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public String getConferenceLocation() {
		// begin-user-code
		return conferenceLocation;
		// end-user-code
	}

	/** 
	* @param conferenceLocation the conferenceLocation to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setConferenceLocation(String conferenceLocation) {
		// begin-user-code
		this.conferenceLocation = conferenceLocation;
		// end-user-code
	}
	
	/** 
	* @return the conferenceDate
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public String getConferenceDate() {
		// begin-user-code
		return conferenceDate;
		// end-user-code
	}

	/** 
	* @param conferenceDate the conferenceDate to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setConferenceDate(String conferenceDate) {
		// begin-user-code
		this.conferenceDate = conferenceDate;
		// end-user-code
	}

	/** 
	* @return the conferenceProceedingLoan
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public ConferenceProceedingLoan getConferenceProceedingLoan() {
		// begin-user-code
		return conferenceProceedingLoan;
		// end-user-code
	}

	/** 
	* @param conferenceProceedingLoan the conferenceProceedingLoan to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setConferenceProceedingLoan(ConferenceProceedingLoan conferenceProceedingLoan) {
		// begin-user-code
		this.conferenceProceedingLoan = conferenceProceedingLoan;
		// end-user-code
	}
}