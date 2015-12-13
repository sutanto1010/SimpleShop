package com.sutanto.simpleshop.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cascade;

@Entity
public class Transaction {
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Id;
	private int UserId;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="TransactionId")
	private Set<TransactionDetail> Details;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getUserId() {
		return UserId;
	}
	public void setUserId(int userId) {
		UserId = userId;
	}
	public Date getDate() {
		return Date;
	}
	public void setDate(Date date) {
		Date = date;
	}
	public int getStatus() {
		return Status;
	}
	public void setStatus(int status) {
		Status = status;
	}
	private Date Date;
	private int Status;
}
