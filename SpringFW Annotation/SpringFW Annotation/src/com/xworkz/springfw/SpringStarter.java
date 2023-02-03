package com.xworkz.springfw;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.springfw.beans.CityBean;
import com.xworkz.springfw.beans.CompanyDetailsBean;
import com.xworkz.springfw.beans.EmployeeBean;
import com.xworkz.springfw.beans.HeadsetBean;
import com.xworkz.springfw.beans.MobileBean;
import com.xworkz.springfw.beans.NationalParkBean;
import com.xworkz.springfw.beans.StateBean;
import com.xworkz.springfw.beans.StudentBean;

public class SpringStarter {

	public static void main(String[] args) {

		ApplicationContext container = new ClassPathXmlApplicationContext("resources/spring.xml");

		HeadsetBean bean = container.getBean(HeadsetBean.class);

		System.out.println(bean);

		System.out.println("");

		StudentBean bean1 = container.getBean(StudentBean.class);

		System.out.println(bean1);

		System.out.println("");

		EmployeeBean bean2 = container.getBean(EmployeeBean.class);

		System.out.println(bean2);

		System.out.println("");

		StateBean bean3 = container.getBean(StateBean.class);

		System.out.println(bean3);

		System.out.println("");

		MobileBean bean4 = container.getBean(MobileBean.class);

		System.out.println(bean4);

		System.out.println("");

		CityBean bean5 = container.getBean(CityBean.class);

		System.out.println(bean5);

		System.out.println("");

		CompanyDetailsBean bean6 = container.getBean(CompanyDetailsBean.class);

		System.out.println(bean6);

		System.out.println("");

		NationalParkBean bean7 = container.getBean(NationalParkBean.class);

		System.out.println(bean7);

	}

}
