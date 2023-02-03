package com.xworkz.springframework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springframework.bean.ActorBean;
import com.xworkz.springframework.bean.ApartmentBean;
import com.xworkz.springframework.bean.AppuMoviesBean;
import com.xworkz.springframework.bean.BottleBean;
import com.xworkz.springframework.bean.CandyBean;
import com.xworkz.springframework.bean.CapacitorBean;
import com.xworkz.springframework.bean.CityBean;
import com.xworkz.springframework.bean.CollegeBean;
import com.xworkz.springframework.bean.CompanyBean;
import com.xworkz.springframework.bean.CountryBean;
import com.xworkz.springframework.bean.CustomerBean;
import com.xworkz.springframework.bean.DarshanMoviesBean;
import com.xworkz.springframework.bean.EarPhoneBean;
import com.xworkz.springframework.bean.HeadphoneBean;
import com.xworkz.springframework.bean.HospitalBean;
import com.xworkz.springframework.bean.InductorBean;
import com.xworkz.springframework.bean.KannadaActorsBean;
import com.xworkz.springframework.bean.LaptopBean;
import com.xworkz.springframework.bean.MobileBean;
import com.xworkz.springframework.bean.MotorBean;
import com.xworkz.springframework.bean.MovieBean;
import com.xworkz.springframework.bean.SongBean;
import com.xworkz.springframework.bean.StateDetailsBean;
import com.xworkz.springframework.bean.StudentBean;
import com.xworkz.springframework.bean.WaterBottleBean;
import com.xworkz.springframework.configure.SpringConfigure;

public class StudentRunner {

	public static void main(String[] val) {

		System.out.println("=========================15 class using Component annotation=============");
		ApplicationContext container = new AnnotationConfigApplicationContext(SpringConfigure.class);
		ActorBean bean = container.getBean(ActorBean.class);
		System.out.println(bean);

		System.out.println(container.getBean(AppuMoviesBean.class));

		System.out.println(container.getBean(CandyBean.class));

		System.out.println(container.getBean(MotorBean.class));

		System.out.println(container.getBean(MovieBean.class));

		System.out.println(container.getBean(ApartmentBean.class));

		System.out.println(container.getBean(CountryBean.class));

		System.out.println(container.getBean(CustomerBean.class));

		System.out.println(container.getBean(HeadphoneBean.class));

		System.out.println(container.getBean(MobileBean.class));

		System.out.println(container.getBean(StateDetailsBean.class));

		System.out.println(container.getBean(StudentBean.class));

		System.out.println(container.getBean(CapacitorBean.class));

		System.out.println(container.getBean(HospitalBean.class));

		System.out.println(container.getBean(WaterBottleBean.class));

		System.out.println("===================10 class using configuration bean annotation==========");

		SongBean song = container.getBean(SongBean.class);
		System.out.println(song);

		CompanyBean company = container.getBean(CompanyBean.class);
		System.out.println(company);

		DarshanMoviesBean movies = container.getBean(DarshanMoviesBean.class);
		System.out.println(movies);

		KannadaActorsBean actor = container.getBean(KannadaActorsBean.class);
		System.out.println(actor);

		EarPhoneBean phone = container.getBean(EarPhoneBean.class);
		System.out.println(phone);

		BottleBean bottle = container.getBean(BottleBean.class);
		System.out.println(bottle);

		CityBean city = container.getBean(CityBean.class);
		System.out.println(city);

		InductorBean inductor = container.getBean(InductorBean.class);
		System.out.println(inductor);

		LaptopBean laptop = container.getBean(LaptopBean.class);
		System.out.println(laptop);

		CollegeBean college = container.getBean(CollegeBean.class);
		System.out.println(college);

		System.out.println("==========================Non premitive data type using bean configuration===============");
		String string = container.getBean(String.class);
		System.out.println("the value of string is:- " + string);

		ArrayList<String> array = container.getBean(ArrayList.class);
		System.out.println("the value of ArrayList is:- " + array);

		Integer integer = container.getBean(Integer.class);
		System.out.println("the value of Integer is:- " + integer);

		Double double1 = container.getBean(Double.class);
		System.out.println("the value of Double is:- " + double1);

		HashMap<String, String> hash = container.getBean(HashMap.class);
		System.out.println("the value of HashMap is:- " + hash);

		HashSet<String> set = container.getBean(HashSet.class);
		System.out.println("the value of HashSet is:- " + set);

		LinkedList<String> linked = container.getBean(LinkedList.class);
		System.out.println("the value of LinkedList is:- " + linked);

		Character cha = container.getBean(Character.class);
		System.out.println("the value of Character is:- " + cha);

		Boolean bool = container.getBean(Boolean.class);
		System.out.println("the value of Boolean is:- " + bool);

		Long lon = container.getBean(Long.class);
		System.out.println("the value of Long is:- " + lon);

		Float flo = container.getBean(Float.class);
		System.out.println("the value of Float is:- " + flo);

		Short sho = container.getBean(Short.class);
		System.out.println("the value of Short is:- " + sho);

	}
}