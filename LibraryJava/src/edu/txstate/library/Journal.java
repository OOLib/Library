package edu.txstate.library;

import java.util.HashSet;
import java.util.Set;

/** 
 * This class represents a journal in the library.
 * @author Hannah Burzynski, Alexander Wagstaff
 */
public class Journal extends Document {

	private int volume;
	private int number;
	private int numCopies;
	private Set<Article> articles;
	
	// title, date, volume, issue, publisher, articles
	
	Journal(String title, String publicationDate, int volume, int number, String publisher, String articleString )
	{
		this.title = title;
		this.publicationDate = publicationDate;
		this.volume = volume;
		this.number = number;
		this.publisher = publisher;
		this.articles = new HashSet<Article>();

		// If there are multiple articles
		if (articleString.contains(",")){
			String[] words = articleString.split(",");
			for (int i = 0; i < words.length; i++) {
				// split each article into individual attributes: title, firstpage, lastpage
				String[] articleAttributes = words[i].split("[.]");
				this.articles.add(new Article(articleAttributes[0],Integer.parseInt(articleAttributes[1]),Integer.parseInt(articleAttributes[2])));
			}
		} else {
			// If only a single article
			String[] articleAttributes = articleString.split("[.]");
			// title, firstpage, lastpage
			this.articles.add(new Article(articleAttributes[0],Integer.parseInt(articleAttributes[1]),Integer.parseInt(articleAttributes[2])));
		}
		
	}

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