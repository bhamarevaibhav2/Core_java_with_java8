package dsa;

import java.util.ArrayList;
import java.util.List;

public class Logicals {

	public static void fibonacci(int count) {
		// 0,1,1,2,3,5,8,13,21,34
		int n1 = 0;
		int n2 = 1;
		int n3;

		System.out.print(n1 + " " + n2);

		for (int i = 2; i < count; i++) {
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}

	}

	public static boolean findprime(int count) {

		for (int i = 2; i <= Math.sqrt(count); i++) {

			if (count % i == 0) {
				return false;
			}
		}
		return true;

	}

	public static void reverseString(String str) {

		String rev = "";
		char ch;

		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			rev = ch + rev;
		}

		System.out.println(rev);

	}

	public static void oddEven(int num) {

		if (num % 2 == 0) {
			System.out.println("Number is even");
		} else {
			System.out.println("Number is Odd");
		}
	}

	public static void findduplicate(int[] arr) {
		List<Integer> dup = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {
					dup.add(arr[i]);
				}
			}
		}
		for (int integer : dup) {
			System.out.println(integer);
		}
	}
	
	public static void armStrong(int num) {
		
		int sum = 0,rev=0;
		int originalnum = num;
		int length = String.valueOf(num).length();
		
		for(int i =0;i<length;i++) {
			
			int digit = num % 10;
			//sum += Math.pow(digit, length);
			rev = rev*10 +digit;
			num /= 10;
		}
		
		System.out.println(rev);
		
		if(sum == originalnum) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("Not armstrong");
		}
		
	}
	
	public static void palindrome(String str) {
		
		String rev="";
		char ch;
		
		for(int i=0;i< str.length();i++) {
			
			ch = str.charAt(i);
			rev = ch+rev;
		}
		
		if(rev.equals(str)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
	}
	
	public static void perfectNum(int num) {
		
		int sum=0;
		
		for(int i=1;i<=Math.sqrt(num);i++){
			if(num % i == 0) {
				sum += i;
			}
		}
		
		if(sum == num) {
			System.out.println("Perfect number");
		}
		else {
			System.out.println("Not perfect");
		}
	}

	public static void main(String[] args) {

		int num = 11;
		String str = "Springboot";

		fibonacci(num);
		System.out.println();

		for (int i = 2; i < num; i++) {
			if (findprime(i)) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		reverseString(str);

		oddEven(num);

		int[] arr = { 1, 2, 3, 4, 2, 7, 8, 8, 3 };
		findduplicate(arr);
		
		armStrong(153);
		
		palindrome("levels");
		
		perfectNum(6);

	}

}
