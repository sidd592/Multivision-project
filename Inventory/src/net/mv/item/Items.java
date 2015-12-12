package net.mv.item;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;



@Entity
@Table(name = "ITEM")
@XmlRootElement
public class Items implements Serializable {

	
	@Id
	@SequenceGenerator(name="item_seq",sequenceName="item_seq",allocationSize=1)
	@GeneratedValue(generator="item_seq",strategy=GenerationType.SEQUENCE)
	@Column(name = "ItemId")
	private int id;
	
	@Column(name = "item")
	private String item;     
	
	@Column(name = "category")
	private String category;
	
	@Column(name = "quantity")
	private int number;
	
	@Column(name = "date_rcvd")
	private Date dateRcvd;
	
	@Column(name = "place_shipped")
	private String placeShiped;
	
	public Items(){}

	public Items(int id, String item, String category, int number,
			Date dateRcvd, String placeShiped) {
		super();
		this.id = id;
		this.item = item;
		this.category = category;
		this.number = number;
		this.dateRcvd = dateRcvd;
		this.placeShiped = placeShiped;
	}

	public int getId() {
		return id;
	}
	@XmlElement
	public void setId(int id) {
		this.id = id;
	}

	public String getItem() {
		return item;
	}
	@XmlElement
	public void setItem(String item) {
		this.item = item;
	}

	public String getCategory() {
		return category;
	}
	@XmlElement
	public void setCategory(String category) {
		this.category = category;
	}

	public int getNumber() {
		return number;
	}
	@XmlElement
	public void setNumber(int number) {
		this.number = number;
	}

	public Date getDateRcvd() {
		return dateRcvd;
	}
	@XmlElement
	public void setDateRcvd(Date dateRcvd) {
		this.dateRcvd = dateRcvd;
	}

	public String getPlaceShiped() {
		return placeShiped;
	}
	@XmlElement
	public void setPlaceShiped(String placeShiped) {
		this.placeShiped = placeShiped;
	}

	@Override
	public String toString() {
		return "Items [id=" + id + ", item=" + item + ", category=" + category
				+ ", number=" + number + ", dateRcvd=" + dateRcvd
				+ ", placeShiped=" + placeShiped + "]";
	}
	
	
}
