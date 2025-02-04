package core_java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream_api {

	public static void main(String[] args) {

		String str = "i am vaibhav am dilip bhamare";
		String string = Arrays.stream(str.split(" ")).max(Comparator.comparing(String::length)).get();
		System.out.println(string);

		String st = "sshdiiidkkdettl";
		String collect4 = Arrays.stream(st.split("")).distinct().collect(Collectors.joining());
		System.out.println(collect4);

		String string2 = Arrays.stream(str.split(" ")).sorted(Comparator.comparing(String::length).reversed()).skip(2)
				.findFirst().get();
		int length = Arrays.stream(str.split(" ")).sorted(Comparator.comparing(String::length).reversed()).skip(2)
				.findFirst().get().length();
		System.out.println(string2 + " " + length);

		Arrays.stream(str.split(" ")).map(s -> s + ":" + s.length()).forEach(System.out::println);

		Map<String, Long> collect5 = Arrays.stream(str.split(" "))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(collect5);

		Map<String, Long> collect6 = Arrays.stream(st.split(""))
				.collect(Collectors.groupingBy(x -> x, Collectors.counting()));

		System.out.println(collect6);

		int[] arr = { 1, 2, 8, 2, 8, 4, 5 };

		Arrays.stream(arr).boxed().sorted().forEach(System.out::print);
		System.out.println();
		System.out.println("---------------");
		int sum = Arrays.stream(arr).reduce(Integer::sum).getAsInt();
		System.out.println(sum);

		int integer = Arrays.stream(arr).boxed().distinct().reduce(Integer::sum).get();
		System.out.println(integer);

		String string3 = Arrays.stream(str.split("")).filter(c -> str.indexOf(c) == str.lastIndexOf(c)).findFirst()
				.get();
		System.out.println(string3);

		Map<String, Long> collect7 = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting()));
		System.out.println(collect7);

		String string4 = collect7.entrySet().stream().filter(s -> s.getValue() > 1).map(s -> s.getKey()).findFirst()
				.get();
		System.out.println(string4);

		List<String> names = Arrays.asList("Alice", "Bob", "Amanda", "Charlie", "Annie");

		names.stream().filter(e -> !e.startsWith("A")).forEach(System.out::println);
		
		//

		List<String> strings = Arrays.asList("Java", "Microservices", "Springboot");

		List<String> strings1 = Arrays.asList("Java", "Springboot", "API");

		List<String> collect = strings.stream().filter(strings1::contains).collect(Collectors.toList());
		System.out.println(collect);

		Map<Character, Long> characterCount = strings.stream().flatMapToInt(String::chars) // Convert each string to an
																							// IntStream of characters
				.mapToObj(c -> (char) c) // Convert int to Character
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(characterCount);
		System.out.println("-------------------");

		Stream<String> stream = strings.stream(); // string stream- JavaMicroservicesSpringboot

		stream.forEach(System.out::print);
		System.out.println();

		IntStream flatMapToInt = strings.stream().flatMapToInt(String::chars); // ascii int stream - 7497118977710599

		flatMapToInt.forEach(System.out::println);

		Stream<Character> mapToObj = strings.stream()
				.flatMapToInt(String::chars).mapToObj(c -> (char) c);// character stream - JavaMicroservicesSpringboot
		
		mapToObj.forEach(System.out::print);

		String example = "1";
		IntStream charCodes = example.chars();
		System.out.println();
		charCodes.forEach(System.out::print);
		
		//Flat map

		List<List<String>> listOfLists = Arrays.asList(Arrays.asList("apple", "banana"),
				Arrays.asList("orange", "grape"), Arrays.asList("kiwi"));

		listOfLists.stream().flatMap(List::stream).sorted().forEach(s -> System.out.println(s));
		
		//Array convert into list

		int[] arr1 = { 2, 33, 22, 12, 2 };

		String[] array = { "Apple", "Banana", "Cherry" };

		List<Integer> intlist = Arrays.stream(arr1).boxed().collect(Collectors.toList());
		System.out.println(intlist);

		List<String> stlist = Arrays.stream(array).collect(Collectors.toList());
		System.out.println(stlist);
		
		// using Flat map convert multi Dimensional array into list

		int[][] multiArray = { { 1, 2 }, { 3, 4 }, { 5, 6 } };

		List<List<Integer>> multiarrlist = new ArrayList<>();

		for (int[] inarray : multiArray) {
			multiarrlist.add(Arrays.stream(inarray).boxed().collect(Collectors.toList()));
		}

		System.out.println(multiarrlist);

		List<Integer> collect2 = multiarrlist.stream().flatMap(List::stream).collect(Collectors.toList());
		System.out.println(collect2);

	}

}
