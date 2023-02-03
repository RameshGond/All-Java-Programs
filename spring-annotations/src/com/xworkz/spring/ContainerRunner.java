package com.xworkz.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.spring.beans.BusStopBean;
import com.xworkz.spring.beans.HeadsetBean;
import com.xworkz.spring.beans.LaptopBean;
import com.xworkz.spring.beans.MobileBean;
import com.xworkz.spring.beans.ParkBean;
import com.xworkz.spring.beans.StateBean;
import com.xworkz.spring.beans.TownBean;
import com.xworkz.spring.beans.WaterBottleBean;

public class ContainerRunner {

	public static void main(String[] args) {
		
		//String xmlMetaInfoPath = "resources/spring-resource.xml";

		ApplicationContext context = new ClassPathXmlApplicationContext("resources/spring-resource.xml");
		
		HeadsetBean headset = context.getBean(HeadsetBean.class);
		System.out.println(headset);
		
		LaptopBean laptop = context.getBean(LaptopBean.class);
		System.out.println(laptop);
		
		MobileBean mobile = context.getBean(MobileBean.class);
		System.out.println(mobile);
		
		WaterBottleBean bottle = context.getBean(WaterBottleBean.class);
		System.out.println(bottle);
		
		TownBean town = context.getBean(TownBean.class);
		System.out.println(town);
		
		ParkBean park = context.getBean(ParkBean.class);
		System.out.println(park);
		
		BusStopBean bus = context.getBean(BusStopBean.class);
		System.out.println(bus);
		
		StateBean state = context.getBean(StateBean.class);
		System.out.println(state);

		



	}

}
