package jdk8newfeature;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
	
	public static void main(String[] args) {
		
		List<String> names = new ArrayList<String>();
		names.add("Lucky");
		names.add("Lakhi");
		names.add("chakki");
		names.add("fukki");
		names.add("thikkki");
		names.add("Laaakia");
		names.add("pakki");
		
//		List<String> filtersList = names.stream()
		names.stream()
		.filter(n -> n.startsWith("L"))
		.map(String::toUpperCase)
		.map(String::toLowerCase)
		.sorted()
		.collect(Collectors.toList())
		.forEach(System.out::println);
		
//		System.out.println(filtersList);
		
		
	}

}
