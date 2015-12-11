package net.mv.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class LibraryBook {
	
	@XmlElement
	@Id
	@SequenceGenerator(name="person_seq",sequenceName="person_seq",allocationSize=1)
	@GeneratedValue(generator="person_seq",strategy=GenerationType.SEQUENCE)
	private int id;
	
	@Column
	private String title;
	
	@Column
	private String author;
	
	@Column
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
