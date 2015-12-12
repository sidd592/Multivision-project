package net.mv.item;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class ItemList {

	List<Items> items;
	
	public ItemList(){}

	public ItemList(List<Items> items) {
		super();
		this.items = items;
	}

	public List<Items> getItems() {
		return items;
	}

	public void setItems(List<Items> items) {
		this.items = items;
	}
	
	
}
