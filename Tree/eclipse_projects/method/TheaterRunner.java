package com.methods;

public class TheaterRunner {

	public static void main(String[] args) {
		
		Theater theater=new Theater();
		theater.setName("INOX");
		theater.setMovieName("KGF");
		theater.setLocation("BTM");
		theater.setTicketPrice(250);
		
		theater.hashCode();
		theater.toString();
		
		Theater theater1=new Theater();
		theater1.setName("ionex");
		theater1.setMovieName("KGF");
		theater1.setLocation("BTM");
		theater1.setTicketPrice(250);
		
		boolean sony=theater.equals(theater1);
		System.out.println(sony);

	}

}
