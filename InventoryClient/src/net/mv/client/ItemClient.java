package net.mv.client;

import java.util.List;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

import net.mv.item.ItemList;
import net.mv.item.Items;



public class ItemClient {
	
public List<Items> getallItems(){
		
		String url = "http://localhost:7001/Inventory/rest/item/getallitems";
		Client client = Client.create();
		WebResource resource = client.resource(url);
        ItemList itemlist=resource.get(ItemList.class);
		return itemlist.getItems();	
	}
	
public Items getItem(Items item){
	  
	String url = "http://localhost:7001/Inventory/rest/item/getitem";
	Client client = Client.create();
	WebResource resource = client.resource(url);
    Items it=resource.get(Items.class);
	return it;	
	
}
	
	public List<Items> add(Items item){
		
		String url = "http://localhost:7001/Inventory/rest/item/additem";
		Client client = Client.create();
		WebResource resource = client.resource(url);
        resource.post(item);
		
		url = "http://localhost:7001/Inventory/rest/item/getallitems";
		
		client = Client.create();
		resource = client.resource(url);
		ItemList itemlist=resource.get(ItemList.class);
		return itemlist.getItems();	
		
	}
	
public List<Items> edit(Items item){
		
	String url = "http://localhost:7001/Inventory/rest/item/edititem";
	Client client = Client.create();
	WebResource resource = client.resource(url);
    resource.post(item);
	
	url = "http://localhost:7001/Inventory/rest/item/getallitems";
	
	client = Client.create();
	resource = client.resource(url);
	ItemList itemlist=resource.get(ItemList.class);
	return itemlist.getItems();	
		
	}
	
public List<Items> delete(Items item){
	
	
	String url = "http://localhost:7001/Inventory/rest/item/removeitem";
	Client client = Client.create();
	WebResource resource = client.resource(url);
    resource.post(item);
	
	url = "http://localhost:7001/Inventory/rest/item/getallitems";
	
	client = Client.create();
	resource = client.resource(url);
	ItemList itemlist=resource.get(ItemList.class);
	return itemlist.getItems();	
	
}

}
