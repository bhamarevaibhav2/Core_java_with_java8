package core_java;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class java11 {

	public static void main(String[] args) {

		// java 11 features

		String str = " ";
		String str1 = " \t \n";
		String str2 = "Hello";
		String str4 = "   Hello";
		String str5 = "Hello   ";

		boolean blank = str.isEmpty();
		boolean blank1 = str1.isEmpty();
		boolean blank2 = str2.isEmpty();

		System.out.println(blank);// false
		System.out.println(blank1);// false
		System.out.println(blank2);// false

		String str3 = "Vaibhav Bhamare\nUtkarsha Bhamare";
		Stream<String> lines = str3.lines();
		lines.forEach(System.out::println);

		String repeat = str2.repeat(2);
		System.out.println(repeat);
		System.out.println(str4.stripLeading());// remove white spaces
		System.out.println(str5.stripTrailing());// remove white spaces
		
		List<String> strings = Arrays.asList("Java", "Microservices", "\n", "Springboot");

		String[] array = strings.toArray(String[]::new);// toArray list to array
		System.out.println(array.length);

		// introduced not method of predicate
		List<String> collect2 = strings.stream().filter(Predicate.not(String::isBlank)).collect(Collectors.toList());

		System.out.println(collect2);

		System.out.println(Optional.ofNullable(str2).isEmpty());// we can use isEmpty alternate of isPresent method

		String st = "VaIbHaV12";

		char[] ch = st.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			if (Character.isLowerCase(ch[i])) {
				ch[i] = Character.toUpperCase(ch[i]);
			} else if (Character.isUpperCase(ch[i])) {
				ch[i] = Character.toLowerCase(ch[i]);
			} else {
				ch[i] = ch[i];
			}
		}

		String change = String.valueOf(ch);

		System.out.println(change);

		String spacecheck = "Hello  world";
		String[] split = spacecheck.split(" ");
		String[] split1 = spacecheck.split("\\s");
		String[] split2 = spacecheck.split("\\s+");

		System.out.println(Arrays.toString(split));
		System.out.println(Arrays.toString(split1));
		System.out.println(Arrays.toString(split2));
	}
}
