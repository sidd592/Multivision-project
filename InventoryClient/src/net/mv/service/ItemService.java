package net.mv.service;

import java.util.Date;
import java.util.List;

import net.mv.client.ItemClient;
import net.mv.item.Items;


public class ItemService {

public List<Items> getallItems(){
		
		ItemClient ic = new ItemClient();
		return ic.getallItems();
	}
	
	public List<Items> add(String item,String category,int number,Date dateRcvd,String placeShiped){
		
		Items Item = new Items();
		Item.setItem(item);
		Item.setCategory(category);
		Item.setNumber(number);
		Item.setDateRcvd(dateRcvd);
		Item.setPlaceShiped(placeShiped);
	
		
		ItemClient ic = new ItemClient();
		return ic.add(Item);
	}
	
public List<Items> edit(int id,String item,String category,int number,Date dateRcvd,String placeShiped){
		
	Items Item = new Items();
	Item.setId(id);
	Item.setItem(item);
	Item.setCategory(category);
	Item.setNumber(number);
	Item.setDateRcvd(dateRcvd);
	Item.setPlaceShiped(placeShiped);
	
	ItemClient ic = new ItemClient();
		return ic.edit(Item);
	}
	
public List<Items> delete(int id,String item,String category,int number,Date dateRcvd,String placeShiped){
	
	Items Item = new Items();
	Item.setId(id);
	Item.setItem(item);
	Item.setCategory(category);
	Item.setNumber(number);
	Item.setDateRcvd(dateRcvd);
	Item.setPlaceShiped(placeShiped);
	
	ItemClient ic = new ItemClient();
	return ic.delete(Item);
}


}
