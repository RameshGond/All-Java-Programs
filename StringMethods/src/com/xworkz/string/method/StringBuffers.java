package com.xworkz.string.method;

public class StringBuffers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				// String name = "satya";
				// Integer age=24;
				StringBuffer str = new StringBuffer("satya");

				str.append("patel");
				System.out.println("appending=" + str);

				str.append('R');
				System.out.println("append character=" + str);

				str.append(str, 3, 6);
				System.out.println("append charsequence=" + str);

				str.append(false);
				System.out.println("append boolean=" + str);

				str.append(1d);
				System.out.println("append double=" + str);

				str.append(3);
				System.out.println("append int=" + str);

				str.append(7l);
				System.out.println("append long=" + str);

				str.append(9f);
				System.out.println("append float=" + str);

				str.appendCodePoint(2);
				System.out.println("append code point=" + str);

				StringBuffer str1 = new StringBuffer("oppoA74");

				int code = str1.capacity();
				System.out.println("capacity of string=" + code);

				StringBuffer del = str1.delete(2, 5);
				System.out.println("delition of  string=" + del);

				StringBuffer del1 = str1.deleteCharAt(2);
				System.out.println("delition of character string=" + del1);

				StringBuffer str2 = new StringBuffer("DellLaptop");

				StringBuffer rep = str2.replace(0, 4, "Lenova");
				System.out.println("replace of the string=" + rep);

				StringBuffer rev = str2.reverse();
				System.out.println("reverse of the string=" + rev);

				StringBuffer str3 = new StringBuffer("DellLap");

				char ch = str3.charAt(4);
				System.out.println("char of the string=" + ch);

				int cp = str3.codePointAt(2);
				System.out.println("code of the string=" + cp);

				int cp1 = str3.codePointBefore(2);
				System.out.println("code of the string=" + cp1);

				int cp2 = str3.codePointCount(2, 5);
				System.out.println("code of the string=" + cp2);

				int ind = str3.indexOf("Lap");
				System.out.println("index of string=" + ind);

				StringBuffer ins = str3.insert(4, 's');
				System.out.println("insert the value=" + ins);

			
		
	}

}
