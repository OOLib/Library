package edu.txstate.library;

/** 
 * This class represents a journal loan.
 * @author Hannah Burzynski, Alexander Wagstaff
 */
public class JournalLoan extends Loan {

	private Journal journal;
	
	/** 
	* This is a constructor function.
	*/
	JournalLoan(Journal journal) {
		this.journal = journal;
	}
	
	/** 
	* This is a default constructor function.
	*/
	JournalLoan() {
		this.journal = null;
	}

	/**
	* This function returns the journal associated with the loan. 
	* @return journal
	*/
	public Journal getJournal() {
		// begin-user-code
		return journal;
		// end-user-code
	}

	/**
	* This function sets the journal associated with the loan.  
	* @param journal
	*/
	public void setJournal(Journal journal) {
		// begin-user-code
		this.journal = journal;
		// end-user-code
	}
}