package net.mv.item;

import java.util.Date;

public class ShippedItems {

	private int id;
	private String item;
	private String category;
	private int number;
	private Date dateShipped;
	private String place;
	
	public ShippedItems(){}

	public ShippedItems(int id, String item, String category, int number,
			Date dateShipped, String place) {
		super();
		this.id = id;
		this.item = item;
		this.category = category;
		this.number = number;
		this.dateShipped = dateShipped;
		this.place = place;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Date getDateShipped() {
		return dateShipped;
	}

	public void setDateShipped(Date dateShipped) {
		this.dateShipped = dateShipped;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	@Override
	public String toString() {
		return "ShippedItems [id=" + id + ", item=" + item + ", category="
				+ category + ", number=" + number + ", dateShipped="
				+ dateShipped + ", place=" + place + "]";
	}
	
	
	
}
