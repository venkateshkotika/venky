package com.example.slokam;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class book {
	
	@Id
	@GeneratedValue
	
	private int bid;
	private String bname;
	private int bcost;
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public int getBcost() {
		return bcost;
	}
	public void setBcost(int bcost) {
		this.bcost = bcost;
	}
	@Override
	public String toString() {
		return "bid=" + bid + ", bname=" + bname + ", bcost=" + bcost ;
	}
	
	
	

}
