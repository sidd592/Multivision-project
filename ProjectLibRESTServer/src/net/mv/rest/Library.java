package net.mv.rest;


import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import net.mv.dao.LibraryDao;
import net.mv.pojo.Books;
import net.mv.pojo.LibraryBook;

@Path("/lib")
public class Library {

	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("/getallbooks")
	public Books getallbooks(){
		
		LibraryDao dao =new LibraryDao();
		
		List<LibraryBook> blist=dao.getallbooks();
		
		Books books= new Books();
		
		books.setBooks(blist);
		return books;
		
	}
	@POST
	@Path("/getbookbyid")
	public LibraryBook getbookbyid(int id){
		
		LibraryDao dao =new LibraryDao();
		
		LibraryBook book=dao.getbookbyid(id);
		return book;
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_XML)
	@Path("/createbook")
	public void CreateBook(LibraryBook book){
		LibraryDao dao =new LibraryDao();
		dao.Create(book);
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_XML)
	@Path("/editbook")
	public void EditBook(LibraryBook book){
		LibraryDao dao =new LibraryDao();
		dao.update(book);
	}
	
	@POST
	@Path("/deletebook")
	public void deletebook(LibraryBook book){
		
		LibraryDao dao =new LibraryDao();
		dao.deletebook(book);
	}
	
	
	
}
