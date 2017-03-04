package edu.txstate.library;

/** 
 * This class represents the articles that can be found in conference proceedings and journals.
 * @author Hannah Burzynski, Alexander Wagstaff
 */
public class Article {

	private String title;
	private int firstPage;
	private int lastPage;
	
	/** 
	* This is a constructor function.
	*/
	Article(String title, int firstPage, int lastPage) {
		this.title = title;
		this.firstPage = firstPage;
		this.lastPage = lastPage;
	}
	/** 
	* This is a default constructor function.
	*/
	Article() {
		this.title = "";
		this.firstPage = 0;
		this.lastPage = 0;
	}
	
	public String getTitle(){
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

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
	
	public String toString()
	{
		return "Title: " + title + "\nFirst Page: " + firstPage + "\nLast Page: " + lastPage;
	}
	
	public boolean equals(Object o)
	{
		if(o == null)
			return false;
		
		if(!(o instanceof Article))
			return false;
		
		Article oArticle = (Article) o;
		String lowerTitle = title.toLowerCase();
		String oLowerTitle = oArticle.title.toLowerCase();
		
		if(lowerTitle.equals(oLowerTitle))
			return true;
		else
			return false;
	}
	
	public int hashCode()
	{
		String lowerTitle = title.toLowerCase();
		return lowerTitle.hashCode();
	}
}