package com.btm.methods;

public class MallRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mall mall=new Mall();
		mall.setNo(4);
		mall.setName("FORUM");
		mall.setLocation("BTM");
		mall.setPinCode(803213l);
		mall.setPvr(true);
		
		mall.hashCode();
		mall.toString();
		
		Mall mall1=new Mall();
		mall1.setNo(4);
		mall1.setName("FORUM");
		mall1.setLocation("BTM");
		mall1.setPinCode(803213l);
		mall1.setPvr(true);
		
		boolean abc=mall.equals(mall1);
		System.out.println(abc);

		
		

	}

	}


