package edu.txstate.library;

import java.util.Set;

/** 
 * This class represents a conference proceeding document in the library.
 * @author Hannah Burzynski, Alexander Wagstaff
 */
public class ConferenceProceeding extends Document {
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
	private String conferenceLocation;

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
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private String conferenceDate;

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
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private Set<Article> article;

	/** 
	* @return the article
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Set<Article> getArticle() {
		// begin-user-code
		return article;
		// end-user-code
	}

	/** 
	* @param article the article to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setArticle(Set<Article> article) {
		// begin-user-code
		this.article = article;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private ConferenceProceedingLoan conferenceProceedingLoan;

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

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private Set<Article> articles;

	/** 
	* @return the articles
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Set<Article> getArticles() {
		// begin-user-code
		return articles;
		// end-user-code
	}

	/** 
	* @param articles the articles to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setArticles(Set<Article> articles) {
		// begin-user-code
		this.articles = articles;
		// end-user-code
	}
}