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
	
	/**
	 * This function displays the object's values as one string
	 * @return string of all values
	 */
	@Override public String toString()
	{
		return name;
	}
	
	/**
	 * This function determines whether two objects are equal
	 * @param loan object that will be compared to the invoking object
	 * @return true if the object has the same values
	 */
	@Override public boolean equals(Object o)
	{
		if (o == null)
			return false;
		
		if(!(o instanceof Author))
			return false;
		
		Author oAuthor = (Author) o;
		String lowerName = name.toLowerCase();
		String oLowerName = oAuthor.name.toLowerCase();
		
		if(lowerName.contains(oLowerName))
			return true;
		else
			return false;
	}
	
	/**
	 * This function determines the unique hash code for the object
	 * @return hash
	 */
	@Override public int hashCode()
	{
		String lowerName = name.toLowerCase();
		return lowerName.hashCode();
	}
}