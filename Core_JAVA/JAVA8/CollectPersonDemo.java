package com.practice.core.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectPersonDemo {

	public static void main(String[] args) {
		List<Person> persons = populateWithData();
		System.out.println("-------obtain US and no US based persons using partitioningBy & groupingBy----------");
System.out.println(persons.stream().collect(Collectors.partitioningBy((Person p)->p.getCountry().equals("US"))));
System.out.println(persons.stream().collect(Collectors.groupingBy((Person p)->p.getCountry().equals("US"))));	
		System.out.println("-------count US and no US based persons using partitioningBy & groupingBy----------");
System.out.println(persons.stream().collect(Collectors.groupingBy((Person p)->p.getCountry().equals("US"),Collectors.counting())));
System.out.println(persons.stream().collect(Collectors.partitioningBy((Person p)->p.getCountry().equals("US"),Collectors.counting()))); 
		System.out.println("-------obtain the persons in each country and count them using groupingBy----------");
System.out.println(persons.stream().collect(Collectors.groupingBy((Person p)->p.getCountry())));	
System.out.println(persons.stream().collect(Collectors.groupingBy((Person p)->p.getCountry(),Collectors.counting())));
		System.out.println("--obtain US and no US based persons using partitioningBy & map names to uppercase using mapping--");
System.out.println(persons.stream().collect(Collectors.partitioningBy((Person p)->p.getCountry().equals("US"),Collectors.mapping(p->p.getName().toUpperCase(), Collectors.toList()))));	
		System.out.println("--obtain the persons in each country using groupingBy and map names to upppercase using mapping--");
		System.out.println(persons.stream().collect(Collectors.groupingBy((Person p)->p.getCountry(),Collectors.mapping(p->p.getName().toUpperCase(), Collectors.toList()))));			
	}
	static List<Person> populateWithData(){
		List<Person> personList = new ArrayList<Person>();
		personList.add(new Person("person01", "US"));
		personList.add(new Person("person02", "US"));
		personList.add(new Person("person03", "Brazil"));
		personList.add(new Person("person04", "US"));
		personList.add(new Person("person05", "Brazil"));
		personList.add(new Person("person06", "US"));
		personList.add(new Person("person07", "Germany"));
		personList.add(new Person("person08", "US"));
		return personList;
	}
}
