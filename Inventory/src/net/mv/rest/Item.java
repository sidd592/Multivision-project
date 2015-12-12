package net.mv.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import net.mv.dao.ItemDao;
import net.mv.item.ItemList;
import net.mv.item.Items;

@Path("/item")
public class Item {

	
		@GET
		@Produces(MediaType.APPLICATION_XML)
		@Path("/getallitems")
		public ItemList getAllItems(){
			
			ItemDao dao =new ItemDao();
			
			List<Items> ilist=dao.getallItems();
			
			ItemList itemList= new ItemList();
			
			itemList.setItems(ilist);
			return itemList;
			
		}
		@POST
		@Path("/getitem")
		public Items findItem(String item){
			
			ItemDao dao =new ItemDao();
			
			Items item1=dao.getItemByName(item);
			return item1;
		}
		
		@POST
		@Consumes(MediaType.APPLICATION_XML)
		@Path("/additem")
		public void addItem(Items item){
			ItemDao dao =new ItemDao();
			dao.addNewItem(item);
		}
		
		@POST
		@Consumes(MediaType.APPLICATION_XML)
		@Path("/edititem")
		public void EditItem(Items item){
			ItemDao dao =new ItemDao();
			dao.editItem(item);
		}
		
		@POST
		@Path("/removeitem")
		public void removeItem(Items item){
			
			ItemDao dao =new ItemDao();
			dao.removeItemCompletely(item);
		}
		
		
	
}
