package com.xworkz.stringmethods;

public class FishMarket {

	
	
	public static void main(String[] args) {
		//1 	copyValueOf(char[] data, int offset, int count)
		String name="ramesh fish market";
		
		char[] fish= {'G','O','L','D','F','I','S','H'};
		String value=name.copyValueOf(fish,0,6);
		System.out.println(value);
		
		//2 endsWith(String suffix)
		boolean end=name.endsWith("market");
		System.out.println(end);
		
		//3 equals(Object anObject)
		boolean equal=name.equals("ramesh fish market");
		System.out.println(equal);
		
		//4 equalsIgnoreCase(String anotherString)
		boolean ignore=name.equalsIgnoreCase("prashant fish market");
		System.out.println(ignore);
		
		//5 getBytes()
		byte[] get=name.getBytes();
		for(int index=0;index<get.length;index++)
		{
		System.out.println(get[index]);
		}
		
		//6 hashCode()
		int hash=name.hashCode();
		System.out.println(hash);
		
		//7 indexOf(int ch)
		int ref2=name.indexOf('m');
		System.out.println(ref2);
		
		//8 indexOf(int ch, int fromIndex)
		int ref3=name.indexOf('m',3);
		System.out.println(ref3);
		
		//9 indexOf(String str)
		int ref4=name.indexOf("m");
		System.out.println(ref4);
		
		//10 indexOf(String str, int fromIndex)
		int ref5=name.indexOf("a",4);
		System.out.println(ref5);
		
		

	

	}
}
