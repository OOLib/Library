package edu.txstate.library;

import java.util.HashSet;
import java.util.Set;

/** 
 * This abstract class represents an account in the library system.
 * @author Hannah Burzynski, Alexander Wagstaff
 */
public abstract class Account {

	protected int id;
	protected String name;
	protected String type;

	/** 
	* This is a default constructor function.
	*/
	Account() {
		this.id = 0;
		this.name = "";
		this.type = "";
	}

	/** 
	* This function returns the user's ID.
	* @return the id
	*/
	public int getId() {
		return id;
	}
	
	/**
	 * This function sets the user's account ID
	 */
	public void setId(int id)
	{
		this.id = id;
	}

	/** 
	* This function returns the user's ID.
	* @return the name
	*/
	public String getName() {
		return name;
	}

	/** 
	* This function returns the user's ID.
	* @return the type
	*/
	public String getType() {
		return type;
	}
	/**
	 * This function determines whether two objects are equal
	 * @param loan object that will be compared to the invoking object
	 * @return true if the object has the same values
	 */
	@Override public boolean equals(Object o)
	{
		if(o == null)
			return false;
		
		if(!(o instanceof Account))
			return false;
		
		Account oAccount = (Account) o;
		
		if(this.id == oAccount.id)
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
		return id;
	}
	/**
	 * This function displays the object's values as one string
	 * @return string of all values
	 */
	@Override public String toString()
	{
		return "ID: " + id + "\nName: " + name + "\nType: " + type;
	}
}