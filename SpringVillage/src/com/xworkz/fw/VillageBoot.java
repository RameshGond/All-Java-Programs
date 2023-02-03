package com.xworkz.fw;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.fw.beans.VillageBean;

public class VillageBoot {

	public static void main(String[] args) {
		String xmlMetaInfoPath = "resources/Spring.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(xmlMetaInfoPath);
		
		VillageBean village = context.getBean("villageBean", VillageBean.class);

		VillageBean village1 = context.getBean("villageBean1", VillageBean.class);

		VillageBean village2 = context.getBean("villageBean2", VillageBean.class);

		VillageBean village3 = context.getBean("villageBean3", VillageBean.class);

		VillageBean village4 = context.getBean("villageBean4", VillageBean.class);

		VillageBean village5 = context.getBean("villageBean5", VillageBean.class);

		village.villagedetails();
		System.out.println("*********");
		village1.villagedetails();
		System.out.println("*********");
		village2.villagedetails();
		System.out.println("*********");
		village3.villagedetails();
		System.out.println("*********");
		village4.villagedetails();
		System.out.println("*********");
		village5.villagedetails();
		System.out.println("*********");
		System.out.println(village1.getname());
		System.out.println(village1.getnoOfHouse());
		System.out.println(village1.gethospital());
		System.out.println(village1.getpopulation());
		System.out.println(village1.getTaluk());
		System.out.println("*********");
		System.out.println(village2.getname());
		System.out.println(village2.getTaluk());
		System.out.println(village2.gethospital());
		System.out.println(village2.getnoOfHouse());
		System.out.println(village2.getpopulation());
		System.out.println("*********");
		System.out.println(village3.getname());
		System.out.println(village3.getTaluk());
		System.out.println(village3.gethospital());
		System.out.println(village3.getnoOfHouse());
		System.out.println(village3.getpopulation());
		System.out.println("*********");
		System.out.println(village4.getname());
		System.out.println(village4.getnoOfHouse());
		System.out.println(village4.getpopulation());
		System.out.println(village4.gethospital());
		System.out.println(village4.getTaluk());
		System.out.println("*********");
		System.out.println(village5.getname());
		System.out.println(village5.getTaluk());
		System.out.println(village5.gethospital());
		System.out.println(village5.getnoOfHouse());
		System.out.println(village5.getpopulation());
		System.out.println("*********");

	}

}
