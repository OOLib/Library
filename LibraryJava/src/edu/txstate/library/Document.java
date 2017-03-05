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
	protected int numberOfCopies;

	
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
	* This function returns the title 
	* @return the title
	*/
	public String getTitle() {
		// begin-user-code
		return title;
		// end-user-code
	}

	/**
	* This function sets the title 
	* @param title the title to set
	*/
	public void setTitle(String title) {
		// begin-user-code
		this.title = title;
		// end-user-code
	}	

	/**
	* This function returns the publication date  
	* @return the publication date
	*/
	public String getPublicationDate() {
		// begin-user-code
		return publicationDate;
		// end-user-code
	}

	/**
	* This function sets the publication date 
	* @param publication date
	*/
	public void setPublicationDate(String publicationDate) {
		// begin-user-code
		this.publicationDate = publicationDate;
		// end-user-code
	}

	/**
	* This function returns the publisher 
	* @return the publisher
	*/
	public String getPublisher() {
		// begin-user-code
		return publisher;
		// end-user-code
	}

	/**
	* This function sets the publisher 
	* @param publisher the publisher to set
	*/
	public void setPublisher(String publisher) {
		// begin-user-code
		this.publisher = publisher;
		// end-user-code
	}
	/**
	 * This function returns the number of copies
	 * @return number of copies
	 */
	public int getNumberOfCopies() {
		return numberOfCopies;
	}
	/**
	 * This function sets the number of copies
	 * @param numberOfCopies
	 */
	public void setNumberOfCopies(int numberOfCopies) {
		this.numberOfCopies = numberOfCopies;
	}
	/**
	 * This function displays the document
	 */
	public void displayDocument()
	{
		System.out.println(this);
	}
	/**
	 * This function determines whether two objects are equal
	 * @param loan object that will be compared to the invoking object
	 * @return true if the object has the same values
	 */
	@Override public boolean equals(Object o)
	{
		if (o == null)
			return false;
		
		if (!(o instanceof Document))
			return false;
		
		Document oDocument = (Document) o;
		String lowerTitle = title.toLowerCase();
		String oLowerTitle = oDocument.title.toLowerCase();
		
		if(lowerTitle.equals(oLowerTitle))
			return true;
		else
			return false;
	}
	/**
	 * This function determines the unique hash code for the object
	 * @return hash
	 */
	@Override public int hashCode()
	{
		String lowerTitle = title.toLowerCase();
		return lowerTitle.hashCode();
	}
	/**
	 * This function displays the object's values as one string
	 * @return string of all values
	 */
	@Override public String toString()
	{
		return "Title: " + title + "\nPublisher: " + publisher + "\nPublication Date: " + publicationDate;
	}
}