package net.mv.service;

import java.util.List;

import net.mv.pojo.LibraryBook;
import net.mv.rest.client.RestClient;

public class LibraryService {

	public List<LibraryBook> getall(){
		
		RestClient rc = new RestClient();
		return rc.getall();
	}
	
	public List<LibraryBook> create(String title,String author, int year){
		
		LibraryBook book = new LibraryBook();
		book.setTitle(title);
		book.setAuthor(author);
		book.setYear(year);
		
		RestClient rc = new RestClient();
		return rc.create(book);
	}
	
public List<LibraryBook> edit(String title,String author, int year,int bid){
		
		LibraryBook book = new LibraryBook();
		book.setTitle(title);
		book.setAuthor(author);
		book.setYear(year);
		book.setId(bid);
		RestClient rc = new RestClient();
		return rc.edit(book);
	}
	
public List<LibraryBook> delete(String title,String author, int year,int bid){
	
	LibraryBook book = new LibraryBook();
	book.setTitle(title);
	book.setAuthor(author);
	book.setYear(year);
	book.setId(bid);
	
	RestClient rc = new RestClient();
	return rc.delete(book);
}


	
}
