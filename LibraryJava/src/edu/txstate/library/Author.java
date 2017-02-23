package edu.txstate.library;

/** 
 * This class represents an author.
 * @author Hannah Burzynski, Alexander Wagstaff
 */
public class Author {
	private String name;
	
	Author(String name) {
		this.name = "name";
	}
	Author() {
		this.name = "";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}