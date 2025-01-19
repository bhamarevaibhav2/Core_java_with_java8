package org.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streamapi_2 {
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3,2,4,1,5);
		
		List<Integer> collect = list.stream().map(a -> a*2).collect(Collectors.toList());
		System.out.println(collect);
	}

}
