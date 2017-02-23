package edu.txstate.library;

import java.util.Set;

/** 
 * This class represents a journal in the library.
 * @author Hannah Burzynski, Alexander Wagstaff
 */
public class Journal extends Document {
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private int volume;
	// title, date, volume, issue, publisher, articles

	/** 
	* @return the volume
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public int getVolume() {
		// begin-user-code
		return volume;
		// end-user-code
	}

	/** 
	* @param volume the volume to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setVolume(int volume) {
		// begin-user-code
		this.volume = volume;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private int number;

	/** 
	* @return the number
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public int getNumber() {
		// begin-user-code
		return number;
		// end-user-code
	}

	/** 
	* @param number the number to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setNumber(int number) {
		// begin-user-code
		this.number = number;
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
	private JournalLoan journalLoan;

	/** 
	* @return the journalLoan
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public JournalLoan getJournalLoan() {
		// begin-user-code
		return journalLoan;
		// end-user-code
	}

	/** 
	* @param journalLoan the journalLoan to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setJournalLoan(JournalLoan journalLoan) {
		// begin-user-code
		this.journalLoan = journalLoan;
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

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private Set<Author> author;

	/** 
	* @return the author
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Set<Author> getAuthor() {
		// begin-user-code
		return author;
		// end-user-code
	}

	/** 
	* @param author the author to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setAuthor(Set<Author> author) {
		// begin-user-code
		this.author = author;
		// end-user-code
	}
}