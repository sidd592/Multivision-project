package net.mv.pojo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class LibraryBook {
	
	@XmlElement	
	private int id;
	
	
	private String title;
	
	
	private String author;
	
	
	private int year;

	
	
	
	public LibraryBook(){}
	
	public LibraryBook(int id, String title, String author, int year) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.year = year;
	}

	public int getId() {
		return id;
	}

	@XmlElement
	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	@XmlElement
	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	@XmlElement
	public void setAuthor(String author) {
		this.author = author;
	}

	public int getYear() {
		return year;
	}

	@XmlElement
	public void setYear(int year) {
		this.year = year;
	}
	
	

}
