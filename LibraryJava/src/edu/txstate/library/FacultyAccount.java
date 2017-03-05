package edu.txstate.library;

/** 
 * This class represents a faculty account
 * @author Hannah Burzynski, Alexander Wagstaff
 */
public class FacultyAccount extends Account {

	private static final int MAX_BOOK_LOAN_DURATION = 12; // Duration in months
	private static final int MAX_BORROWED_AMOUNT = 12; // maximum number of items able to be borrowed at a time

	/** 
	* This is a constructor function.
	*/
	FacultyAccount(int id, String name, String type) {
		this.id = id;
		this.name = name;
		// TODO remove type from constructor, always FACULTY type
		this.type = type;
	}

	/** 
	* This is a constructor function.
	*/
	FacultyAccount() {
		this.id = 0;
		this.name = "";
		this.type = "FACULTY";
	}

	/** 
	* This function returns the maximum loan duration.
	* @return maximum loan duration
	*/
	public int getMaxLoanDuration() {
		return MAX_BOOK_LOAN_DURATION;
	}
	
	/** 
	* This function returns the maximum borrowed amount.
	* @return maximum borrowed amount
	*/
	public int getMaxBorrowedAmount() {
		return MAX_BORROWED_AMOUNT;
	}
}