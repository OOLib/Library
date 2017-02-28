package edu.txstate.library;

import java.util.HashSet;
import java.util.Set;

/** 
 * This class represents a journal in the library.
 * @author Hannah Burzynski, Alexander Wagstaff
 */
public class Journal extends Document {

	private int volume;
	// issue number
	private int issueNumber;
	private int numCopies;
	private Set<Article> articles;
	private JournalLoan journalLoans;
	private Set<Author> authors;
	
	// title, date, volume, issue, publisher, articles
	/** 
	* This is a constructor function.
	*/
	Journal(String title, String publicationDate, int volume, int number, String publisher, String articleString )
	{
		this.title = title;
		this.publicationDate = publicationDate;
		this.volume = volume;
		this.issueNumber = number;
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
	* This function returns the volume of the journal.  
	* @return the volume
	*/
	public int getVolume() {
		// begin-user-code
		return volume;
		// end-user-code
	}

	/**
	* This function sets the volume. 
	* @param volume the volume to set
	*/
	public void setVolume(int volume) {
		// begin-user-code
		this.volume = volume;
		// end-user-code
	}

	/**
	* This function returns the issue number for the journal. 
	* @return issue number
	*/
	public int getIssueNumber() {
		// begin-user-code
		return issueNumber;
		// end-user-code
	}

	/**
	* This function sets the issue number for the journal. 
	* @param number the number to set
	*/
	public void setIssueNumber(int number) {
		// begin-user-code
		this.issueNumber = number;
		// end-user-code
	}

	/**
	* This function returns the number of copies of the journal. 
	* @return number of copies
	*/
	public int getNumCopies() {
		// begin-user-code
		return numCopies;
		// end-user-code
	}

	/**
	* This function sets the number of copies of the journal.
	* @param number of copies
	*/
	public void setNumCopies(int numCopies) {
		// begin-user-code
		this.numCopies = numCopies;
		// end-user-code
	}
}