package com.xworkz.stringmethods;

public class Bike {

	public static void main(String[] args) {
	  //1 intern()
		
		String bike="ROYAL ENFIELD";
		String intern=bike.intern();
		System.out.println(intern);
		
		//2 isEmpty()
		boolean empty=bike.isEmpty();
		System.out.println(empty);
		
		//3 lastIndexOf(int ch)
		int last=bike.lastIndexOf('Y');
		System.out.println(last);
		
		//4 lastIndexOf(int ch, int fromIndex)
		int ref=bike.lastIndexOf('Y',1);
		System.out.println(ref);
		
		//5 lastIndexOf(String str)
		int ref1=bike.lastIndexOf("O");
		System.out.println(ref1);
		
		//6 lastIndexOf(String str, int fromIndex)
		int ref2=bike.lastIndexOf("A",3);
		System.out.println(ref2);
		
		//7 length()
		int ref3=bike.length();
		System.out.println(ref3);
		
		//8 matches(String regex)
		boolean ref4=bike.matches("PULSER");
		System.out.println(ref4);
		
		//9 toLowerCase()
		String ref5=bike.toLowerCase();
		System.out.println(ref5);
		
	
		
		
		
		

	}

}
