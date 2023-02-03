package com.xworkz.fw;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.fw.BloodBean.BodyBean;
import com.xworkz.fw.CPUBean.CPUBean;
import com.xworkz.fw.CarbonBean.DiamondBean;
import com.xworkz.fw.ComponentBean.PCBBean;
import com.xworkz.fw.EngineBean.TrainBean;
import com.xworkz.fw.FrameBean.FrameBean;
import com.xworkz.fw.PackageBean.PackageBean;
import com.xworkz.fw.ShirtBean.ShirtBean;
import com.xworkz.fw.SlipperBean.ManBean;
import com.xworkz.fw.SolarSystemBean.SolarSystemBean;
import com.xworkz.fw.SystemBean.SystemBean;
import com.xworkz.fw.TailBean.FishesBean;
import com.xworkz.fw.bottlebean.BottleBean;
import com.xworkz.fw.browserbean.BrowserBean;
import com.xworkz.fw.fishBean.RiverBean;

public class BeanBoot {

	public static void main(String[] args) {

		// String xmlMetaInfopath = "resources/Spring-Resource.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext("resources/Spring-Resource.xml");

	
		
		System.out.println("===================1] Train has-a Engine==================");
		TrainBean train = context.getBean(TrainBean.class);
		System.out.println(train);
		train.ticketIssue();
		
		System.out.println("===================2] Bottle has-a Cap==================");
		BottleBean bottle = context.getBean(BottleBean.class);
		System.out.println(bottle);

		System.out.println("===================3] System has-a Power==================");
		SystemBean system = context.getBean(SystemBean.class);
		System.out.println(system);

		System.out.println("===================4] TV has-a Stand==================");
		//System.out.println(context.getBean(TvBean.class));

		System.out.println("===================5] Apartment has-a Lift==================");
		//System.out.println(context.getBean(ApartmentBean.class));

		System.out.println("===================6] Shirt has-a Button==================");
		System.out.println(context.getBean(ShirtBean.class));

		System.out.println("===================7] Browser has-a Parser==================");
		System.out.println(context.getBean(BrowserBean.class));

		System.out.println("===================8] River has-a Fish==================");
		System.out.println(context.getBean(RiverBean.class));

		System.out.println("===================9] Body has-a Blood using setter==================");
		System.out.println(context.getBean(BodyBean.class));

		System.out.println("===================10] Frame has-a Photo using setter==================");
		System.out.println(context.getBean(FrameBean.class));

		System.out.println("===================11] Man has-a Slipper using setter==================");
		System.out.println(context.getBean(ManBean.class));

		System.out.println("===================12] SolarSystemBean has-a PlanetsBean using setter==================");
		System.out.println(context.getBean(SolarSystemBean.class));

		System.out.println("===================13] Diamond has-a Carbon using setter==================");
		System.out.println(context.getBean(DiamondBean.class));

		System.out.println("===================14] Fish has-a Tail using setter==================");
		System.out.println(context.getBean(FishesBean.class));

		System.out.println("===================15] PCB has-a Component using setter==================");
		System.out.println(context.getBean(PCBBean.class));

		System.out.println("===================16] CPU has-a MotherBoard using setter==================");
		System.out.println(context.getBean(CPUBean.class));

		System.out.println("===================17] Package has-a Class using setter==================");
		System.out.println(context.getBean(PackageBean.class));
	}
}


