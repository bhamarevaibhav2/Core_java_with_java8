package org.streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class AllMethods {

	public static void main(String[] args) {

		// convert Array into list
		String[] stnums = { "Vaibhav", "Dilip", "Bhamare" };
		List<String> collect3 = Arrays.stream(stnums).collect(Collectors.toList());
		System.out.println(collect3);
		int[] nums = { 1, 2, 3 };
		List<Integer> listof = Arrays.stream(nums).boxed().collect(Collectors.toList());
		System.out.println(listof);

		// Lists
		List<Integer> listint = Arrays.asList(23, 26, 28, 78, 44, 36, 12, 23, 28);
		List<Double> listdob = Arrays.asList(23.3, 26.4, 28.12, 78.2);
		List<String> list = Arrays.asList("apple", "custard Apple", "mango", "watermelon", "musk melon");
		
		// filter that update the list as per predicate
		list.stream().filter(a -> a.startsWith("A")).forEach(System.out::println); // endsWith
		listint.stream().filter(i -> i % 2 == 0).collect(Collectors.toList()); // even
		Set<Integer> set = new HashSet<>();
		listint.stream().filter(s -> set.add(s)).forEach(System.out::println); // drop duplicate elements filter
		listint.stream().distinct().forEach(System.out::println);// drop duplicate elements filter
		listint.stream().filter(n -> !set.add(n)).forEach(System.out::println);// add duplicate elements in set

		// Sorting
		System.out.println("Ascending...");
		listint.stream().sorted().forEach(System.out::println);
		listint.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
		listint.stream().sorted((o1, o2) -> o1.compareTo(o2)).forEach(System.out::print);
		System.out.println("Descending...");
		listint.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		listint.stream().sorted((o1, o2) -> o2.compareTo(o1)).forEach(System.out::print);

		// map that transform the same stream into new as per operation
		// create a stream of each element length
		list.stream().map(String::length).forEach(System.out::println);
		// create a stream of string from integer
		listint.stream().map(s -> s + "").forEach(System.out::println);
		// create a stream of square of all element
		listint.stream().map(i -> i * i).forEach(System.out::println);
		list.stream().map(s -> s.toUpperCase()).forEach(System.out::println);

		// in list find all elements square and filter by above 100 and average using
		// mapToInt()
		OptionalDouble opt = listint.stream().mapToInt(n -> n * n).filter(n -> n > 100).average();
		int sum = listint.stream().mapToInt(Integer::intValue).sum();
		long count2 = listint.stream().mapToInt(Integer::intValue).count();
		// mapToDouble
		listdob.stream().mapToDouble(Double::doubleValue).average().getAsDouble();

		int i = listint.stream().max(Integer::compare).get(); // min
		i = listint.stream().max(Comparator.naturalOrder()).get();// min

		listint.stream().findFirst();
		listint.stream().findAny();

		// collectors.joining
		String collect6 = list.stream().collect(Collectors.joining(","));
		System.out.println(collect6);

		boolean allMatch = listint.stream().allMatch(s -> s % 2 == 0);
		System.out.println(allMatch);

		// flat map that flatten the stream
		List<List<String>> listoflist = Arrays.asList(Arrays.asList("Shirts", "Pants", "Jeans", "Tshirts"),
				Arrays.asList("Apple", "Mango", "Watermelon", "Muskmelon"),
				Arrays.asList("TV", "Fridge", "Coburd", "Stand"));

		List<String> collect7 = listoflist.stream().flatMap(List::stream).collect(Collectors.toList());
		System.out.println(collect7);

		List<Character> collect5 = list.stream().flatMap(s -> Stream.of(s.charAt(2))).collect(Collectors.toList());
		System.out.println(collect5);

		List<Integer> collect = list.stream().flatMapToInt(st -> IntStream.of(st.length())).boxed()
				.collect(Collectors.toList());
		System.out.println(collect);

		// operations on object
		List<Students> collect2 = getStudentList().stream().filter(a -> a.age > 30).collect(Collectors.toList());
		System.out.println(collect2);
		// ----------above 30 is pass other fail------------------------------
		Map<String, List<Students>> collect8 = getStudentList().stream()
				.collect(Collectors.groupingBy(s -> s.age >= 30 ? "Pass" : "Fail"));
		System.out.println(collect8);

		System.out.println("print all students having age less than 3rd highest age");
		List<Students> collect9 = getStudentList().stream()
				.sorted((Comparator.comparingInt(Students::getAge).reversed())).skip(3).collect(Collectors.toList());
		System.out.println(collect9);

		System.out.println("Name wise ascending...");
		getStudentList().stream().sorted((o1, o2) -> o1.getName().compareTo(o2.getName())).forEach(System.out::println);
		System.out.println("Age wise ascending...");
		getStudentList().stream().sorted((o1, o2) -> o1.getAge() - o2.getAge()) // Descending -: o2.age-o1.age
				.forEach(System.out::println);
		getStudentList().stream().sorted(Comparator.comparingInt(Students::getStid)).forEach(System.out::println);
		getStudentList().stream().sorted(Comparator.comparingInt(Students::getStid).reversed())
				.forEach(System.out::println);
	}

	public static List<Students> getStudentList() {

		List<Students> stlist = new ArrayList<>();
		stlist.add(new Students(101, "Vaibhav", 23));
		stlist.add(new Students(104, "Varun", 33));
		stlist.add(new Students(103, "Rakesh", 34));
		stlist.add(new Students(102, "Dinesh", 34));
		stlist.add(new Students(109, "VInayak", 26));

		return stlist;
	}

	// collection
	// stream
	// Encapsulation
	// prototype design pattern
	//
}
