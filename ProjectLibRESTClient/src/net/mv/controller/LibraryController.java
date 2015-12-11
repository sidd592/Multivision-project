package net.mv.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import net.mv.pojo.LibraryBook;
import net.mv.service.LibraryService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LibraryController {

	@RequestMapping(value="/create")
	public String Create(HttpServletRequest request){
		
	String title = request.getParameter("title");
	String author = request.getParameter("author");
	boolean valid=true;
	int year=0;
	try{
	year = Integer.parseInt(request.getParameter("year"));
	}
	catch(NumberFormatException e){
		e.printStackTrace();
		request.getSession().setAttribute("erroryear", "year must be number");
		valid=false;
	}
	if(title.isEmpty()){
		request.getSession().setAttribute("errortitle", "Title is required");
		valid=false;
	}
	if(author.isEmpty()){
		request.getSession().setAttribute("errorauthor", "Author is required");
		valid=false;
	}
	
	if(valid==false)
		return "create";
	LibraryService ls = new LibraryService();
	List<LibraryBook> books=ls.create(title, author, year);
		request.getSession().setAttribute("books", books);
		return "homepage";
	}
	
	@RequestMapping(value="/edit")
	public String Edit(HttpServletRequest request){
		
		String title = request.getParameter("title");
		String author = request.getParameter("author");
		
		int bid = Integer.parseInt(request.getParameter("bid"));
		
		boolean valid=true;
		int year=0;
		try{
		year = Integer.parseInt(request.getParameter("year"));
		}
		catch(NumberFormatException e){
			e.printStackTrace();
			request.getSession().setAttribute("erroryear", "year must be number");
			valid=false;
		}
		if(title.isEmpty()){
			request.getSession().setAttribute("errortitle", "Title is required");
			valid=false;
		}
		if(author.isEmpty()){
			request.getSession().setAttribute("errorauthor", "Author is required");
			valid=false;
		}
		
		if(valid==false)
			return "edit";
		
		LibraryService ls = new LibraryService();
		List<LibraryBook> books=ls.edit(title, author, year,bid);
		request.getSession().setAttribute("books", books);
		return "homepage";
	}
	
	@RequestMapping(value="/editme")
	public String Editme(HttpServletRequest request){
		
		String title = request.getParameter("title");
		String author = request.getParameter("author");
		int year = Integer.parseInt(request.getParameter("year"));
		int bid = Integer.parseInt(request.getParameter("bid"));
		
		request.getSession().setAttribute("title", title);
		request.getSession().setAttribute("author", author);
		request.getSession().setAttribute("year", year);
		request.getSession().setAttribute("bid", bid);
		return "edit";
	}
	
	
	@RequestMapping(value="/delete")
	public String Delete(HttpServletRequest request){
		
		LibraryService ls = new LibraryService();
		String title = request.getParameter("title");
		String author = request.getParameter("author");
		int year = Integer.parseInt(request.getParameter("year"));
		int bid = Integer.parseInt(request.getParameter("bid"));
		List<LibraryBook> books=ls.delete(title, author, year,bid);
		request.getSession().setAttribute("books", books);
		
		return "homepage";
	}
	
	@RequestMapping(value="/homepage")
	public String homep(HttpServletRequest request){
		
		
		LibraryService ls = new LibraryService();
		List<LibraryBook> books=ls.getall();
		request.getSession().setAttribute("books", books);
		
		
		return "homepage";
	}
	
	
	
	
	
}
