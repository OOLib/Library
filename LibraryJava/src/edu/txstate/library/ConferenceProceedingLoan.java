package edu.txstate.library;

/** 
 * This class represents a conference proceeding loan.
 * @author Hannah Burzynski, Alexander Wagstaff
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class ConferenceProceedingLoan extends Loan {

	private ConferenceProceeding conferenceProceeding;
	
	/** 
	* This is a constructor function.
	*/
	ConferenceProceedingLoan(ConferenceProceeding conferenceProceeding, Account account, int duration) {
		this.document = conferenceProceeding;
		this.account = account;
		this.duration = duration;
		
	}
	
	/** 
	* This is a default constructor function.
	*/
	ConferenceProceedingLoan() {
		this.document = null;
		this.account = null;
		this.duration = 0;
	}
	

	/**
	* This function returns a conference proceeding.
	* @return the conferenceProceeding
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public ConferenceProceeding getConferenceProceeding() {
		// begin-user-code
		return conferenceProceeding;
		// end-user-code
	}

	/**
	* This function sets a conference proceeding. 
	* @param conferenceProceeding the conferenceProceeding to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setConferenceProceeding(ConferenceProceeding conferenceProceeding) {
		// begin-user-code
		this.conferenceProceeding = conferenceProceeding;
		// end-user-code
	}
}