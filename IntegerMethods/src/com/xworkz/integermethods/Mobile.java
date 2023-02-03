package com.xworkz.integermethods;

public class Mobile {

	public static void main(String[] args) {

		int model=2022;

		// bitCount(int i)
		int model1=Integer.bitCount(model);
		System.out.println(model1);
		
		//compare(int x,int y)
		int mobileModel=2021;
		int model2=Integer.compare(model, mobileModel);
		System.out.println(model2);
		
		//byteValue()
		Integer mobileNo=34;
		byte model3=mobileNo.byteValue();
		System.out.println(model3);
		
		//compareTo(Integer anotherInteger)
		Integer rate=20000;
		int model4=rate.compareTo(mobileNo);
		System.out.println(model4);
		
		//compareUnsigned(int x,int y)
		int model5=rate.compareUnsigned(model,mobileModel);
		System.out.println(model5);
		
		// decode(String nm)
		String rate1="15000";
		Integer model6=Integer.decode(rate1);
		System.out.println(model6);
		
		//doubleValue()
		Integer rate2=12000;
		double model7=rate2.doubleValue();
		System.out.println(model7);
		
		//equals(Object obj)
		Integer rate3=12000;
		boolean model8=rate3.equals(rate2);
		System.out.println(model8);
		
		//floatValue()
		Integer rate4=10000;
		float model9=rate4.floatValue();
		System.out.println(model9);
		
		//getInteger(String nm)
		Integer model10=Integer.getInteger(rate1);
		System.out.println(model10);


	}
	

}
