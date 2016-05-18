package com.yc.cinema.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class FileBean implements Serializable {

	  private Integer filmid;

	   private String filmname;

	   private String typeid;

	   private String actor;

	   private String director;

	   private Double minPrice;
	
	   private Double maxPrice;
	   
	   private Double ticketprice;

	public Integer getFilmid() {
		return filmid;
	}

	public void setFilmid(Integer filmid) {
		this.filmid = filmid;
	}

	public String getFilmname() {
		return filmname;
	}

	public void setFilmname(String filmname) {
		this.filmname = filmname;
	}

	public String getTypeid() {
		return typeid;
	}

	public void setTypeid(String typeid) {
		this.typeid = typeid;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}


	public Double getMinPrice() {
		return minPrice;
	}

	public void setMinPrice(Double minPrice) {
		this.minPrice = minPrice;
	}

	public Double getMaxPrice() {
		return maxPrice;
	}

	public void setMaxPrice(Double maxPrice) {
		this.maxPrice = maxPrice;
	}



	@Override
	public String toString() {
		return "FileBean [filmid=" + filmid + ", filmname=" + filmname
				+ ", typeid=" + typeid + ", actor=" + actor + ", director="
				+ director + ", minPrice=" + minPrice + ", maxPrice="
				+ maxPrice + ", ticketprice=" + ticketprice + "]";
	}

	public Double getTicketprice() {
		return ticketprice;
	}

	public void setTicketprice(Double ticketprice) {
		this.ticketprice = ticketprice;
	}

	public FileBean(Integer filmid, String filmname, String typeid,
			String actor, String director, Double ticketprice) {
		super();
		this.filmid = filmid;
		this.filmname = filmname;
		this.typeid = typeid;
		this.actor = actor;
		this.director = director;
		this.ticketprice = ticketprice;
	}

	public FileBean() {
		super();
	}
	
	
	
	   
	   
}
