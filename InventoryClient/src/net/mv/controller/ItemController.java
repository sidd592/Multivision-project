package net.mv.controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import net.mv.item.Items;
import net.mv.service.ItemService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ItemController {
	
	
	
	@RequestMapping(value="/additem")
	public String addItem(HttpServletRequest request){
	
		DateFormat formatter = new SimpleDateFormat("MM/dd/yy");
	String item = request.getParameter("item");
	String category = request.getParameter("category");
	String placeShiped = request.getParameter("placeShiped");
	
	boolean valid=true;
	Date dateRcvd=null;
	int number=0;
	
	try {
		dateRcvd = formatter.parse(request.getParameter("dateRcvd"));
	} catch (ParseException e1) {
		e1.printStackTrace();
		request.getSession().setAttribute("dateError", "date not in the right format");
	}
	try{
	   number = Integer.parseInt(request.getParameter("number"));
	}
	catch(NumberFormatException e){
		e.printStackTrace();
		request.getSession().setAttribute("numberError", "number must be an integer");
		valid=false;
	}
	if(item.isEmpty()){
		request.getSession().setAttribute("erroritem", "item is required");
		valid=false;
	}
	if(category.isEmpty()){
		request.getSession().setAttribute("errorcategory", "category is required");
		valid=false;
	}
	if(placeShiped.isEmpty()){
		request.getSession().setAttribute("errorplaceShiped", "placeShipped is required");
		valid=false;
	}
	
	if(valid==false)
		return "add";
	ItemService Is = new ItemService();
	List<Items> items=Is.add(item,category,number,dateRcvd,placeShiped);
		request.getSession().setAttribute("items", items);
		return "homepage";
	}
	
	@RequestMapping(value="/edititem")
	public String Edit(HttpServletRequest request){
		
		DateFormat formatter = new SimpleDateFormat("E MMM dd HH:mm:ss Z yyyy");
		
		int id=0;
		try {
			id = Integer.parseInt(request.getParameter("id"));
		} catch (NumberFormatException e2) {
			e2.printStackTrace();
		}
		String item = request.getParameter("item");
			String category = request.getParameter("category");
			String placeShiped = request.getParameter("placeShiped");
			
			boolean valid=true;
			Date dateRcvd=null;
			int number=0;
			
			try {
				dateRcvd = formatter.parse(request.getParameter("dateRcvd"));
			} catch (ParseException e1) {
				e1.printStackTrace();
				request.getSession().setAttribute("dateError", "date not in the right format");
			}
			try{
			   number = Integer.parseInt(request.getParameter("number"));
			}
			catch(NumberFormatException e){
				e.printStackTrace();
				request.getSession().setAttribute("numberError", "number must be an integer");
				valid=false;
			}
			if(item.isEmpty()){
				request.getSession().setAttribute("erroritem", "item is required");
				valid=false;
			}
			if(category.isEmpty()){
				request.getSession().setAttribute("errorcategory", "category is required");
				valid=false;
			}
			if(placeShiped.isEmpty()){
				request.getSession().setAttribute("errorplaceShiped", "placeShipped is required");
				valid=false;
			}
		
			if(valid==false)
				return "edit";
			ItemService Is = new ItemService();
			List<Items> items=Is.edit(id,item,category,number,dateRcvd,placeShiped);
				request.getSession().setAttribute("items", items);
				return "homepage";
			}
	
	
	@RequestMapping(value="/edit")
	public String Edititem(HttpServletRequest request) throws ParseException{
		
		DateFormat formatter = new SimpleDateFormat("E MMM dd HH:mm:ss Z yyyy");
		
		int id	= Integer.parseInt(request.getParameter("id"));
		String item = request.getParameter("item");
		String category = request.getParameter("category");
		String placeShiped = request.getParameter("placeShiped");
		Date dateRcvd = formatter.parse(request.getParameter("dateRcvd"));
		int number = Integer.parseInt(request.getParameter("number"));
		
		
		request.getSession().setAttribute("id", id);
		request.getSession().setAttribute("item", item);
		request.getSession().setAttribute("placeShiped", placeShiped);
		request.getSession().setAttribute("dateRcvd", dateRcvd);
		request.getSession().setAttribute("category", category);
		request.getSession().setAttribute("number", number);
		return "homepage";
	}
	
	
	@RequestMapping(value="/removeitem")
	public String Delete(HttpServletRequest request) throws ParseException{
		
		DateFormat formatter = new SimpleDateFormat("E MMM dd HH:mm:ss Z yyyy");
		
		ItemService Is = new ItemService();
	
		int id	= Integer.parseInt(request.getParameter("id"));
		String item = request.getParameter("item");
		String category = request.getParameter("category");
		String placeShiped = request.getParameter("placeShiped");
		Date dateRcvd = formatter.parse(request.getParameter("dateRcvd"));
		int number = Integer.parseInt(request.getParameter("number"));
		
		
		List<Items> items=Is.delete(id,item, category,number,dateRcvd,placeShiped);
		request.getSession().setAttribute("items", items);
		
		return "homepage";
	}
	
	@RequestMapping(value="/homepage")
	public String homep(HttpServletRequest request){
		
		ItemService Is = new ItemService();
		List<Items> items=Is.getallItems();
		request.getSession().setAttribute("items", items);
		return "homepage";
	}
	
	
	
	
	

}
