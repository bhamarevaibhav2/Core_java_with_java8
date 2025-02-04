package core_java;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeMain {

	public static void main(String[] args) {

		List<Employee> empList = EmployeeDataBase.getAllEmployees();

		empList.stream().sorted(Comparator.comparing(Employee::getDept)).forEach(e -> System.out.println(
				"Department : " + e.getDept() + " , " + "ID : " + e.getId() + " , " + "Name : " + e.getName()));

		empList.stream().sorted(Comparator.comparingDouble(Employee::getSalary))
				.forEach(e -> System.out.println(e.getName() + " : " + e.getSalary()));

		empList.stream().filter(e -> e.getDept().equals("Development") && e.getSalary() > 85000)
				.forEach(e -> System.out.println(e.getDept() + " : " + e.getSalary()));

		Map<Integer, String> collect2 = empList.stream().filter(e -> e.getDept().equals("Sales"))
				.collect(Collectors.toMap(Employee::getId, Employee::getName));

		System.out.println(collect2);

		List<String> collect3 = empList.stream().map(e -> e.getDept()).distinct().collect(Collectors.toList());

		System.out.println(collect3);

	}

}
