package edu.txstate.library;

import java.util.HashSet;
import java.util.Set;

/** 
 * This class represents a conference proceeding document in the library.
 * @author Hannah Burzynski, Alexander Wagstaff
 */
public class ConferenceProceeding extends Document {

	private int numberOfCopies;
	private Set<Article> articles;
	private String conferenceLocation;
	private String conferenceDate;

	/** 
	* This is a constructor function.
	*/
	ConferenceProceeding(String title, String authors, String publisher, String publicationDate, int numberOfCopies, String articleString, String conferenceLocation, String conferenceDate) {
		
		this.title = title;
		this.publisher = publisher;
		this.publicationDate = publicationDate;
		// Add authors
		//this.authors.add(e)
		
		this.numberOfCopies = numberOfCopies;
		this.articles = new HashSet<Article>();
		this.conferenceLocation = conferenceLocation;
		this.conferenceDate = conferenceDate;
		
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
	* This is a default constructor function.
	*/	
	ConferenceProceeding() {
		this.numberOfCopies = 0;
		this.articles = null;
		this.conferenceLocation = "";
		this.conferenceDate = "";
	}
	/** 
	* @return the numCopies
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public int getNumCopies() {
		// begin-user-code
		return numberOfCopies;
		// end-user-code
	}

	/** 
	* @param numCopies the numCopies to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setNumCopies(int numCopies) {
		// begin-user-code
		this.numberOfCopies = numCopies;
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
	* This function returns the set of articles. 
	* @return articles
	*/
	public Set<Article> getArticles() {
		// begin-user-code
		return articles;
		// end-user-code
	}
}