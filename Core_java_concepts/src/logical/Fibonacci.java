package logical;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

//nth no. fibonacci number
public class Fibonacci {

	public static int positionswisefibonacci(int n) {

		if (n == 1) {
			return 0;
		} else if (n == 2) {
			return 1;
		} else {
			return positionswisefibonacci(n - 1) + positionswisefibonacci(n - 2);
		}
	}

	public static long factorialnum(int n) {
			
		long result =1;
		for(int i=1;i<=n;i++){
			result *= i;
		}
		return result;
		
	}

	public static void main(String[] args) {

		int n = 6; // 0,1,1,2,3,5,8,13,21
		System.out.println("The " + n + "th position fibonacci number is " + positionswisefibonacci(n));
		
		System.out.println("Factorials of "+n+" is "+factorialnum(n));
		
		LocalDate currentDate = LocalDate.now();
        System.out.println("Current Date: " + currentDate);
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current Time: " + currentTime);
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current Date and Time: " + currentDateTime);
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = currentDate.format(dateFormatter);
        System.out.println("Formatted Date: " + formattedDate);
        LocalDate futureDate = currentDate.plusDays(10);
        System.out.println("Date after 10 days: " + futureDate);


	}
}
