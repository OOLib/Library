package edu.txstate.library;

/** 
 * This class represents an author.
 * @author Hannah Burzynski, Alexander Wagstaff
 */
public class Author {

	private String name;
	
	/** 
	* This is a constructor function.
	*/
	Author(String name) {
		this.name = name;
	}
	
	/** 
	* This is a default constructor function.
	*/
	Author() {
		this.name = "";
	}
	
	/** 
	* This function returns the name of the Author.
	* @return name
	*/
	public String getName() {
		return name;
	}
	
	/** 
	* This function sets the name of the author.
	*/
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString()
	{
		return name;
	}
}