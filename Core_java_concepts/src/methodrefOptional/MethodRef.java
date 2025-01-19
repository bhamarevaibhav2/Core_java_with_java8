package methodrefOptional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@FunctionalInterface
interface method{
	public void print();
}
public class MethodRef{
	
	public static void display() {
		
		System.out.println("display");
	}
	
	public static void main(String[] args) {
		
		ArrayList<Customer> list = new ArrayList<>();
		list.add(new Customer(12, "vaibhav"));
		list.add(new Customer(13, "Vishal"));
		list.add(new Customer(22, "Rakesh"));
		list.add(new Customer(33, "Sarvesh"));
		
		method m = MethodRef::display;
		
		m.print();
		
		method m1 = Account :: Balance;
		m1.print();
		
		List<Customer> collect = list.stream().filter(s -> s.age < 15).collect(Collectors.toList());
		
		for(Customer cust: collect ) {
			System.out.println(cust.age+" "+cust.name);
		}
	}
	
}
