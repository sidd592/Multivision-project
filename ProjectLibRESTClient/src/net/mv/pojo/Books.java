package net.mv.pojo;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Books {
	
	List<LibraryBook> books;

	public Books(){}
	
	public Books(List<LibraryBook> books) {
		super();
		this.books = books;
	}




	public List<LibraryBook> getBooks() {
		return books;
	}

	
	public void setBooks(List<LibraryBook> books) {
		this.books = books;
	}

	
	
}
