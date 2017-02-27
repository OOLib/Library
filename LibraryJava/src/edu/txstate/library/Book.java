package edu.txstate.library;

/** 
 * This class represents a book in the library.
 * @author Hannah Burzynski, Alexander Wagstaff
 */
public class Book extends Document {

	private boolean isReserved;
	private String isbn;
	private int numCopies;
	
	Book(String title, String publisher, String publicationDate, String isbn, int numCopies, String authorString, boolean isReserved){
		this.title = title;
		this.publisher = publisher;
		this.publicationDate = publicationDate;
		this.isbn = isbn;
		this.numCopies = numCopies;
		this.isReserved = isReserved;
		
		// If there are multiple authors
		if (authorString.contains(",")){
			String[] words = authorString.split(",");
			for (int i = 0; i < words.length; i++) {
				this.authors.add(new Author(words[i]));
			}
		} else {
			// If only a single author
			this.authors.add(new Author(authorString));
		}
	}
	
	Book(){
		this.isReserved = false;
		this.isbn = "";
		this.numCopies = 0;
		
	}

	/** 
	* @return the isReserved
	*/
	public boolean isReserved() {
		// begin-user-code
		return isReserved;
		// end-user-code
	}

	/** 
	* @param isReserved the isReserved to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setReserved(boolean isReserved) {
		// begin-user-code
		this.isReserved = isReserved;
		// end-user-code
	}

	/** 
	* @return the isbnNumber
	*/
	public String getIsbn() {
		// begin-user-code
		return isbn;
		// end-user-code
	}

	/** 
	* @param isbn the isbnNumber to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setIsbn(String isbn) {
		// begin-user-code
		this.isbn = isbn;
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
}