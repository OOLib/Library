package edu.txstate.library;

import java.util.HashSet;
import java.util.Set;

/** 
 * This class represents a document in the library.
 * @author Hannah Burzynski, Alexander Wagstaff
 */
public abstract class Document {
	
	protected String title;
	protected Set<Author> authors;
	protected String publisher;
	protected String publicationDate;

	/** 
	* This is a constructor function.
	*/
	Document(String title, Set<Author> authors, String publisher, String publicationDate) {
		this.title = title;
		this.authors = authors;
		this.publisher = publisher;
		this.publicationDate = publicationDate;
	}
	/** 
	* This is a default constructor function.
	*/
	Document() {
		this.title = "";
		this.authors = new HashSet<Author>();
		this.publisher = "";
		this.publicationDate = "";
	}
	
	/** 
	* @return the title
	*/
	public String getTitle() {
		// begin-user-code
		return title;
		// end-user-code
	}

	/** 
	* @param title the title to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setTitle(String title) {
		// begin-user-code
		this.title = title;
		// end-user-code
	}	

	/** 
	* @return the publicationDate
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public String getPublicationDate() {
		// begin-user-code
		return publicationDate;
		// end-user-code
	}

	/** 
	* @param publicationDate the publicationDate to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setPublicationDate(String publicationDate) {
		// begin-user-code
		this.publicationDate = publicationDate;
		// end-user-code
	}

	/** 
	* @return the publisher
	*/
	public String getPublisher() {
		// begin-user-code
		return publisher;
		// end-user-code
	}

	/** 
	* @param publisher the publisher to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setPublisher(String publisher) {
		// begin-user-code
		this.publisher = publisher;
		// end-user-code
	}
}