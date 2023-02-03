package com.xworkz.springfw.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.springfw.annotation.beans.CandyBean;
import com.xworkz.springfw.annotation.beans.HeadSetBean;
import com.xworkz.springfw.annotation.beans.IronBoxBean;
import com.xworkz.springfw.annotation.beans.MotorBean;
import com.xworkz.springfw.annotation.beans.MovieBean;
import com.xworkz.springfw.annotation.beans.SongBean;
import com.xworkz.springfw.annotation.beans.WaterBottleBean;

public class AnnotationBoot {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("resources\\spring.xml");
		HeadSetBean bean = context.getBean(HeadSetBean.class);
		System.out.println(bean);

		System.out.println("==============================================");
		MovieBean bean1 = context.getBean(MovieBean.class);
		System.out.println(bean1);

		System.out.println("==============================================");
		WaterBottleBean bean11 = context.getBean(WaterBottleBean.class);
		System.out.println(bean11);

		System.out.println("==============================================");
		IronBoxBean bean111 = context.getBean(IronBoxBean.class);
		System.out.println(bean111);

		System.out.println("==============================================");
		CandyBean bean1111 = context.getBean(CandyBean.class);
		System.out.println(bean1111);

		System.out.println("==============================================");
		MotorBean bean11111 = context.getBean(MotorBean.class);
		System.out.println(bean11111);

		System.out.println("==============================================");
		SongBean bean111111 = context.getBean(SongBean.class);
		System.out.println(bean111111);

	}

}
