package com.xworkz.sports;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class SportsRunner {

	public static void main(String[] args) {
		List<String> sports = new LinkedList<String>();
		sports.add("Cricket");
		sports.add("Vollyball");
		sports.add("TT");
		sports.add("Football");
		sports.add("Tenis");
		sports.add("Kabbadi");
		sports.add("Kho Kho");
		sports.add("Basketball");
		sports.add("Handball");
		sports.add("Badminton");
		sports.add("Hockey");

		/*sports.stream().sorted().forEach(r -> System.out.println(r));
		System.out.println("*****************decending order******************");
		Comparator<String> desc = (x1, x2) -> x2.compareTo(x1);
		sports.stream().sorted(desc).forEach(y -> System.out.println(y));*/
		
		System.out.println(sports.size());
		sports.stream().sorted().forEach(s->System.out.println(s));
		
		System.out.println("**********start with b *****************");
		sports.stream().filter(s->s.startsWith("B")).forEach(System.out::println);
		
		System.out.println("************toUpperCase*******************");
		sports.stream().filter(s->s.startsWith("B")).map(String::toUpperCase).forEach(System.out::println);

	}

}
