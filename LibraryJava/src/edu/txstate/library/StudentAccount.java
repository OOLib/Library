package edu.txstate.library;

/** 
 * This class represents a student account.
 * @author Hannah Burzynski, Alexander Wagstaff
 */
public class StudentAccount extends Account {

	private static final int MAX_BOOK_LOAN_DURATION = 6; // Duration in months
	private static final int MAX_BORROWED_AMOUNT = 6; // maximum number of items able to be borrowed at a time

	/** 
	* This is a constructor function.
	*/
	StudentAccount(int id, String name, String type) {
		this.id = id;
		this.name = name;
		this.type = type;
	}
	
	/** 
	* This is a default constructor function.
	*/
	StudentAccount() {
		this.id = 0;
		this.name = "";
		this.type = "STUDENT";
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