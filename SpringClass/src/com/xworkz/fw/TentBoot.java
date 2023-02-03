package com.xworkz.fw;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.fw.beans.TentBean;

public class TentBoot {

	public static void main(String[] args) {
		String xmlMetaInfoPath = "Resources/Spring.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(xmlMetaInfoPath);

		TentBean tent = context.getBean("tentBean", TentBean.class);
		tent.tentDetails();

		TentBean tent1 = context.getBean("tentBean1", TentBean.class);
		System.out.println(
				"Brand: " + tent1.getBrand() + "  Color: " + tent1.getColor() + "  Price: " + tent1.getPrice());

		TentBean tent2 = context.getBean("tentBean2", TentBean.class);
		System.out.println(
				"Brand: " + tent2.getBrand() + "   Color: " + tent2.getColor() + "  Price: " + tent2.getPrice());

		TentBean tent3 = context.getBean("tentBean3", TentBean.class);
		System.out.println(
				"Brand: " + tent3.getBrand() + "  Color: " + tent3.getColor() + "  Price: " + tent3.getPrice());

		TentBean tent4 = context.getBean("tentBean4", TentBean.class);
		System.out.println(
				"Brand: " + tent4.getBrand() + "   Color: " + tent4.getColor() + " Price: " + tent4.getPrice());

		TentBean tent5 = context.getBean("tentBean5", TentBean.class);
		System.out.println(
				"Brand: " + tent5.getBrand() + "   Color: " + tent5.getColor() + " Price: " + tent5.getPrice());

		TentBean tent6 = context.getBean("tentBean6", TentBean.class);
		System.out.println(
				"Brand: " + tent6.getBrand() + "   Color: " + tent6.getColor() + "  Price: " + tent6.getPrice());

		TentBean tent7 = context.getBean("tentBean7", TentBean.class);
		System.out.println(
				"Brand: " + tent7.getBrand() + "      Color: " + tent7.getColor() + "  Price: " + tent7.getPrice());

		TentBean tent8 = context.getBean("tentBean8", TentBean.class);
		System.out.println(
				"Brand: " + tent8.getBrand() + "    Color: " + tent8.getColor() + " Price: " + tent8.getPrice());

		System.out.println("----------------------------------------------------------------------");

		tent.tentDetails();
		tent1.tentDetails();
		tent2.tentDetails();
		tent3.tentDetails();
		tent4.tentDetails();
		tent5.tentDetails();
		tent6.tentDetails();
		tent7.tentDetails();
		tent8.tentDetails();

		
	}

}
