package org.streamApi;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Students {

	int stid;
	String name;
	int age;

	public Students(int stid, String name,int age) {
		super();
		this.stid = stid;
		this.name = name;
		this.age = age;
	}

	public int getStid() {
		return stid;
	}

	public void setStid(int stid) {
		this.stid = stid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	

	@Override
	public String toString() {
		return "Students [stid=" + stid + ", name=" + name +" age "+ age+" ]";
	}
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(23,33,44,23,13,34,33);
		Set<Integer> set = new HashSet<>();
		List<Integer> collect = list.stream().filter(s -> !set.add(s)).collect(Collectors.toList());
		
		System.out.println(collect);
		
		
	}

}
