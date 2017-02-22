package edu.txstate.library;

/** 
 * This class represents the articles that can be found in conference proceedings and journals.
 * @author Hannah Burzynski, Alexander Wagstaff
 */
public class Article {
	
	private int firstPage;
	private int lastPage;
	private Journal journal;
	
	/** 
	* This function returns the first page number of the article.
	* @return the firstPage
	*/
	public int getFirstPage() {
		return firstPage;
	}

	/**
	* This function sets the value of the first page number of the article.
	* @param firstPage the firstPage to set
	*/
	public void setFirstPage(int firstPage) {
		this.firstPage = firstPage;
	}

	/**
	* This function returns the last page number of the article. 
	* @return the lastPage
	*/
	public int getLastPage() {
		return lastPage;
	}

	/** 
	* This function sets the value of the last page number of the article.
	* @param lastPage the lastPage to set
	*/
	public void setLastPage(int lastPage) {
		this.lastPage = lastPage;
	}

	/** 
	* @return the journal
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Journal getJournal() {
		return journal;
	}

	/** 
	* @param journal the journal to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setJournal(Journal journal) {
		this.journal = journal;
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private ConferenceProceeding conferenceProceeding;

	/** 
	* @return the conferenceProceeding
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public ConferenceProceeding getConferenceProceeding() {
		// begin-user-code
		return conferenceProceeding;
		// end-user-code
	}

	/** 
	* @param conferenceProceeding the conferenceProceeding to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setConferenceProceeding(ConferenceProceeding conferenceProceeding) {
		// begin-user-code
		this.conferenceProceeding = conferenceProceeding;
		// end-user-code
	}
}