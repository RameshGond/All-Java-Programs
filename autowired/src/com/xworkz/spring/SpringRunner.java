package com.xworkz.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.configuaration.SpringConfiguaration;
import com.xworkz.spring.hospital.beans.Hospital;
import com.xworkz.spring.vehicle.beans.Vehicle;

public class SpringRunner {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguaration.class);
		Vehicle bean = context.getBean(Vehicle.class);
		bean.travelling();
		System.out.println(bean);
		
		Hospital bean1 = context.getBean(Hospital.class);
		System.out.println(bean1);
		
	}

}
