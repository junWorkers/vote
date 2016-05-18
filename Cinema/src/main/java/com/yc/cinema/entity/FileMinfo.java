package com.yc.cinema.entity;

import java.math.BigDecimal;

public class FileMinfo {
    private Integer filmid;

    private String filmname;

    private FileMtype type;

    private String actor;

    private String director;

    private BigDecimal ticketprice;

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
        this.filmname = filmname == null ? null : filmname.trim();
    }

 

    public FileMtype getType() {
		return type;
	}

	public void setType(FileMtype type) {
		this.type = type;
	}

	public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor == null ? null : actor.trim();
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director == null ? null : director.trim();
    }

    public BigDecimal getTicketprice() {
        return ticketprice;
    }

    public void setTicketprice(BigDecimal ticketprice) {
        this.ticketprice = ticketprice;
    }

	@Override
	public String toString() {
		return "FileMinfo [filmid=" + filmid + ", filmname=" + filmname
				+ ", type=" + type + ", actor=" + actor + ", director="
				+ director + ", ticketprice=" + ticketprice + "]";
	}
    
}