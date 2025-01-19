package org.streamApi;

import java.util.*;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.*;

public class SomeExamples{
	
	public static void main(String[] args){
		
		StringBuffer sb = new StringBuffer();
		String str ="Java articles Java are Awesome";
		Arrays.stream(str.split("\\s+"))
			  .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
			  .forEach((key, value) -> {
					sb.append(key+"=");
					sb.append(value+"\n");
				});
		System.out.println(sb);
		//-------------------------------------------
		StringBuffer sb1 = new StringBuffer();
		String str1 = "ABBCCCDDDDEEEEE";
		str1.chars().mapToObj(c -> (char) c) // string into char of stream
			.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())) // stream into map key-value
			.forEach((Key, Value) -> {
					sb1.append(Key+"=");
					sb1.append(Value+"\n");
				});
		System.out.println(sb1);
		//--------------------------------------
		List<String> stlist = Arrays.asList("Apple", "Mango", "Watermelon", "Muskmelon");
		Map<Object, Long> collect1 = stlist.stream().collect(Collectors.groupingBy(s -> s.concat(""),Collectors.counting()));
		System.out.println(collect1);
		//--------------integer starts with-----------------
		List<Integer> listint = Arrays.asList(23, 26, 28, 23, 78, 44, 78, 36, 23, 12);
		List<String> collect2 = listint.stream().map(s -> s+"").filter(i -> i.startsWith("2")).collect(Collectors.toList());
		List<Integer> collect3 = listint.stream().filter(s -> String.valueOf(s).startsWith("2")).collect(Collectors.toList());
		System.out.println(collect2);
		//---------------duplicate elements---------
		int[] arr = {12,21,12,34,12,24,12,34,36};
		int[] nums = { 1, 2, 3 };
		Set<Integer> set = new HashSet<>();
		Set<Integer> collect4 = Arrays.stream(arr).boxed().filter(s -> !set.add(s)).collect(Collectors.toSet());
		System.out.println(collect4);
		//or
		Arrays.stream(arr).boxed().collect(Collectors.groupingBy(e -> e,Collectors.counting()))
		.entrySet().stream().
		filter(v -> v.getValue() > 1)
		.map(s -> s.getKey()).forEach(System.out::println);;
		System.out.println("...remove duplicate elemnts.....");
		Arrays.stream(arr).boxed().distinct().forEach(System.out::println);
		int[] array = Arrays.stream(arr).distinct().toArray();//or
		
		//find palindromes words from list
		List<String> pal = Arrays.asList("deed","main","vaibhav","radar","level");
		pal.stream().filter(st -> st.equals(new StringBuffer(st).reverse().toString())).forEach(System.out::println);
		
		//merge two arrays
		int[] mergearr = IntStream.concat(Arrays.stream(arr), Arrays.stream(nums)).distinct().toArray();
		System.out.println(Arrays.toString(mergearr));
		
		//sort string list by their length
		stlist.stream().sorted(Comparator.comparingInt(s -> s.length())).forEach(System.out::println);
		
		String input1 = "Java articles Java are Awesome";
		// find the first non-repeated character
		List<Entry<Character, Long>> collect6 = input1.chars().mapToObj(s -> (char) s)
				.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream()
				.filter(entry -> entry.getValue() == 1L)
				.collect(Collectors.toList());
		System.out.println(collect6);
		
		//second highest number
		Optional<Integer> findFirst = listint.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
		System.out.println(findFirst);
		
		
		String[] arrayl = { "G", "E", "E", "k" };

        // Iterating over the indices of an array
        IntStream
                // Generate indices from 0 to array length
                .range(0, arrayl.length)
                // Map each index to its corresponding string representation
                .mapToObj(index -> String.format("%d -> %s", index, arrayl[index]))
                // print each and every element of the stream
                .forEach(System.out::println);
        
        Map<Character, List<String>> collect = Arrays.stream(arrayl).collect(Collectors.groupingBy(s -> s.charAt(0)));
        
        IntStream range = IntStream.range(0, arrayl.length);
        //-----------------------------------
         
//      listint.stream().collect(
//    		  Collectors.collectingAndThen(Collectors.toList(), list -> { Collections.reverse(list); return list.stream();}
//                        ));
      
      List<String> collect5 = pal.stream().collect(Collectors.collectingAndThen(Collectors.toList(),
    		  lists -> { Collections.reverse(lists); return lists;}));
        
      System.out.println(collect5);
        
	}
}
