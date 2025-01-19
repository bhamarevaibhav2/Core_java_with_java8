

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class First {

	public static int largestNumber(int[] largestarray) {
		
			int largestno = largestarray[0];
		
			for(int i=1;i<largestarray.length;i++) {
			
			if(largestno < largestarray[i]) {
				largestno = largestarray[i];
			}
		}
			return largestno;
	}
	
	public static int[] reversearray(int[] revarray) {
		
		int size = revarray.length;
		int[] revarr = new int[size];
		
//		for(int i= 0; i<size/2;i++) {
//			int temp = revarray[i];
//			revarray[i] = revarray[size-i-1];
//			revarray[size-i-1] = temp;
//		}
//		revarr = revarray;
		
		for(int i=size-1;i>=0;i--) { //5
			revarr[size-i-1] = revarray[i];
		}
		
		return revarr;
	}
	
	public static long sumofelelement(int[] arr) {
		
		long sum =0;
		
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		
		return sum;
	}
	
	public static int occuCheck(int[] check,int c) {
		
		int count=0;
		for(int i=0;i<check.length;i++) {
			if( check[i] == c)
			{
				count++;
			}
		}
		return count;
	}
	
	public static int secondLargestnum(int[] arr) {//12,23,15,14,15,32,24,15
		
		int largest=arr[0];//12
		int secondlarg=arr[1];//23
		
		for(int i=1;i<arr.length;i++) { 
			if(largest < arr[i]) { 
				secondlarg = largest;
				largest = arr[i]; 
			}
			else if(secondlarg < arr[i] && largest != arr[i]) { 
				secondlarg = arr[i];
			}
		}
		return secondlarg;
	}
	
	public static boolean checkSorted(int[] arr) {
		
		boolean check=true;
		
		for(int i=0;i < arr.length-1 ;i++) {
			if(arr[i] < arr[i+1])
			{
				check = false;
			}
		}
		return check;
	}
	
	public static int[] zeromovearr(int[] arr) {
		
		//int[] rr = new int[arr.length];
		int size = arr.length;
		
		int index =0;
		
		for(int i=0;i < size; i++) {
			if(arr[i] != 0)
			{
				arr[index] = arr[i];
				index++;
			}
		}
		while(index < size) {
			arr[index] = 0;
			index++;
		}
		
		return arr;
	}
	
	public static void main(String[] args){

		List<Integer> list = Arrays.asList(2, 3, 4, 6, 1);

		List<Integer> list1 = Arrays.asList(1, 5, 3, 4, 6);

		List<Integer> collect = list.stream().filter(list1::contains).collect(Collectors.toList());
		System.out.println(collect);

//		List<Employee> listemp = Arrays.asList(new Employee("Vaibhav", 12, 20000.23, "Mumbai"),
//				new Employee("Vishal", 11, 12000.23, "Mumbai"), new Employee("Dipak", 10, 23000.44, "Pune"),
//				new Employee("Sanket", 22, 30000.55, "Kolhapur"));
//
//		listemp.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).forEach(System.out::println);

		Optional<Integer> sum = list.stream().reduce(Integer::sum);
		Optional<Integer> max = list.stream().reduce(Integer::max);
		List<String> lists = Arrays.asList("Vaibhav", "Bhamare");
		Optional<String> reduce = lists.stream().reduce(String::concat);

		System.out.println("Sum: " + sum.get() + ", Max: " + max.get() + ", Concated String: " + reduce.get());

		//Employee[] emparray = listemp.stream().toArray(Employee[]::new); // convert list of object to array of object
//		System.out.println(emparray[0]);

//		List<Employee> collect2 = listemp.stream().sorted().collect(Collectors.toList());
//		System.out.println(collect2);

		
		int[] largestarray = { 12, 23,15, 14, 15, 32, 24,15 };

		int largestno = largestNumber(largestarray);
		System.out.println(largestno);
		//----------------------------------------
		
		int[] revarray = reversearray(largestarray);
		for(int i:revarray) {
			System.out.print(i+" ");
		}
		System.out.println();
		//-----------------------------------
		long sumofelement = sumofelelement(largestarray);
		System.out.println("Sum of element: "+sumofelement);
		
		int count = occuCheck(largestarray,15);
		System.out.println(count);
		
		int secondlarg = secondLargestnum(largestarray);
		System.out.println(secondlarg);
		
		boolean checkSorted = checkSorted(largestarray);
		System.out.println(checkSorted);
		
		int[] arr = {0,2,9,0,1,0,6};
		
		int[] zeroarr = zeromovearr(arr);
		for (int i : zeroarr) {
			System.out.print(i+"\t");
		}
	}
}
