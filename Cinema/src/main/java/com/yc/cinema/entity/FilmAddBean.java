package com.yc.cinema.entity;

import java.math.BigDecimal;

public class FilmAddBean {
	 private Integer filmid;

	 private String filmname;

	private String typeid;

	private String actor;

	 private String director;
	 
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

	public Double getTicketprice() {
		return ticketprice;
	}

	public void setTicketprice(Double ticketprice) {
		this.ticketprice = ticketprice;
	}

	@Override
	public String toString() {
		return "FilmAddBean [filmid=" + filmid + ", filmname=" + filmname
				+ ", typeid=" + typeid + ", actor=" + actor + ", director="
				+ director + ", ticketprice=" + ticketprice + "]";
	}
	 
	 
	 

}
