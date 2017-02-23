package edu.txstate.library;

public class LibrarianAccount extends Account{
	/** 
	* This is a constructor function.
	*/
	LibrarianAccount(int id, String name, String type) {
		this.id = id;
		this.name = name;
		this.type = type;
	}
	/** 
	* This is a constructor function.
	*/	
	LibrarianAccount() {
		this.id = 0;
		this.name = "";
		this.type = "LIBRARIAN";
	}
}
