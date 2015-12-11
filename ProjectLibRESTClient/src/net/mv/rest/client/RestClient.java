package net.mv.rest.client;

import java.util.List;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

import net.mv.pojo.Books;
import net.mv.pojo.LibraryBook;

public class RestClient {

	public List<LibraryBook> getall(){
		
		String url = "http://localhost:7001/ProjectLibRESTServer/rest/lib/getallbooks";
		
		//jersey client object
		Client client = Client.create();
		
		//jersey webresource object our connectio to RestFul web service
		WebResource resource = client.resource(url);

		Books books=resource.get(Books.class);
		
		return books.getBooks();
		
	}
	
	
	public List<LibraryBook> create(LibraryBook book){
		
		String url = "http://localhost:7001/ProjectLibRESTServer/rest/lib/createbook";
		
		//jersey client object
		Client client = Client.create();
		
		//jersey webresource object our connectio to RestFul web service
		WebResource resource = client.resource(url);

		resource.post(book);
		
		url = "http://localhost:7001/ProjectLibRESTServer/rest/lib/getallbooks";
		
		//jersey client object
		client = Client.create();
		
		//jersey webresource object our connectio to RestFul web service
		resource = client.resource(url);

		Books books=resource.get(Books.class);
		
		return books.getBooks();

		
	}
	
public List<LibraryBook> edit(LibraryBook book){
		
		String url = "http://localhost:7001/ProjectLibRESTServer/rest/lib/editbook";
		
		//jersey client object
		Client client = Client.create();
		
		//jersey webresource object our connectio to RestFul web service
		WebResource resource = client.resource(url);

		resource.post(book);
		
		url = "http://localhost:7001/ProjectLibRESTServer/rest/lib/getallbooks";
		
		//jersey client object
		client = Client.create();
		
		//jersey webresource object our connectio to RestFul web service
		resource = client.resource(url);

		Books books=resource.get(Books.class);
		
		return books.getBooks();

		
	}
	
public List<LibraryBook> delete(LibraryBook book){
	
	String url = "http://localhost:7001/ProjectLibRESTServer/rest/lib/deletebook";
	
	//jersey client object
	Client client = Client.create();
	
	//jersey webresource object our connectio to RestFul web service
	WebResource resource = client.resource(url);

	resource.post(book);
	
	url = "http://localhost:7001/ProjectLibRESTServer/rest/lib/getallbooks";
	
	//jersey client object
	client = Client.create();
	
	//jersey webresource object our connectio to RestFul web service
	resource = client.resource(url);

	Books books=resource.get(Books.class);
	
	return books.getBooks();

	
}

	
}
