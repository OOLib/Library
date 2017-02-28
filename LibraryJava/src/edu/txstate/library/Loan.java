package edu.txstate.library;

import java.util.Set;

/** 
 * This class represents a loan.
 * @author Hannah Burzynski, Alexander Wagstaff
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public abstract class Loan {

	private Set<Account> accounts;
	private Set<Document> documents;
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
}