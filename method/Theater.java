package com.methods;

public class Theater {
	private String name;
	private String movieName;
	private String location;
	private int ticketPrice;
	
	public String toString() {
		System.out.println("running  tostring");
		return "MONA THEATER";
	}
	public int hashCode() {
		System.out.println("running hashcode");
		return super.hashCode();
}
	public boolean equals(Object obj) {
	if(obj !=null) {
		System.out.println("it is not null we can proceed");
	if(obj instanceof Theater)	{
		System.out.println("object is an instance of theater ");
		Theater satya=(Theater)obj;
	if(this.name.equals(satya.name) && this.location.equals(satya.location)) {
		System.out.println("Theater is open");
		return true;

	}

	}
	}
	else
	{
		System.out.println("theater is close");
    }
	return false;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(int ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	
	
	
	
	
	
}

	