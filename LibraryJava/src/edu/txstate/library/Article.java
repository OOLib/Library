package edu.txstate.library;

/** 
 * This class represents the articles that can be found in conference proceedings and journals.
 * @author Hannah Burzynski, Alexander Wagstaff
 */
public class Article {

	private int firstPage;
	private int lastPage;
	private Journal journal;
	private ConferenceProceeding conferenceProceeding;

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
	* This function returns the journal. 
	* @return the journal
	*/
	public Journal getJournal() {
		return journal;
	}

	/** 
	* This function sets the journal
	* @param journal the journal to set
	*/
	public void setJournal(Journal journal) {
		this.journal = journal;
	}

	/**
	* This function returns the conference proceeding object. 
	* @return the conferenceProceeding
	*/
	public ConferenceProceeding getConferenceProceeding() {
		return conferenceProceeding;
	}

	/**
	* This function sets the conferenceproceeding set.  
	* @param conferenceProceeding the conferenceProceeding to set
	*/
	public void setConferenceProceeding(ConferenceProceeding conferenceProceeding) {
		this.conferenceProceeding = conferenceProceeding;
	}
}