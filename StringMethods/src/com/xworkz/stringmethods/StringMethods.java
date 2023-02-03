package com.xworkz.stringmethods;

public class StringMethods {


	public static void main(String[] args) 
	   //1 charAt()
	{
		String state="BIHAR";
		char ref=state.charAt(2);
		System.out.println(ref);
		
		//2 codePointAt(int index)
		int code=state.codePointAt(1);
		System.out.println(code);
		
		//3 codePointCount(int beginIndex, int endIndex)
		int code1=state.codePointCount(2,4);
		System.out.println(code1);
		
		//4 compareTo(String anotherString)
		String state1="KARNATAKA";
		int compare=state.compareTo(state1);
		System.out.println(compare);
		
		//5 compareToIgnoreCase(String str)
		String state2="GOA";
		int ref1=state.compareToIgnoreCase(state2);
		System.out.println(ref1);
		
		//6 concat(String str)
		String state3=" IS A STATE";
		String concat=state.concat(state3);
		System.out.println(concat);
		
		//7 contains(CharSequence s)
		boolean contain=state.contains("a");
		System.out.println(contain);
		
		//8 contentEquals(CharSequence cs)
		boolean content=state.contentEquals("BIHAR");
		System.out.println(content);
		
		//9 contentEquals(StringBuffer sb)
		 boolean content1=state2.contentEquals("GOA");
		 System.out.println(content1);
		 
		 //10 copyValueOf(char[] data)
		 char[] state4={'P','U','N','J','A','B'};
		 String copy=state.copyValueOf(state4);
		 System.out.println(copy);
		
		
		
		

	}

}
