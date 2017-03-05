package edu.txstate.library;

/** 
 * This class represents a staff account.
 * @author Hannah Burzynski, Alexander Wagstaff
 */
public class StaffAccount extends Account {


	/** 
	* This is a constructor function.
	*/
	StaffAccount(int id, String name, String type) {
		this.id = id;
		this.name = name;
		this.type = type;
	}

	/** 
	* This is a default constructor function.
	*/
	StaffAccount() {
		this.id = 0;
		this.name = "";
		this.type = "STAFF";
	}
}