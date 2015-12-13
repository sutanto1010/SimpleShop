package com.sutanto.simpleshop.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class TransactionDetail {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Id;
	
	@OneToOne
	private Item Item;
	private Date Date;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public Item getItem() {
		return Item;
	}
	public void setItem(Item item) {
		Item = item;
	}
	public Date getDate() {
		return Date;
	}
	public void setDate(Date date) {
		Date = date;
	}
}
