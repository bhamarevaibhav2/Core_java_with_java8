package lambaExpression;

@FunctionalInterface
interface Calculation{
	
	public double calculate(double a,double b);
}

public class CalculationMain {
	
	public static void main(String[] args) {
		
		//Calculation additon = (a,b) -> a+b;
		
		print((a,b) -> a+b);
		print((a,b) -> a-b);
		print((a,b) -> a/b);
		print((a,b) -> a*b);
	}
	
	public static void print(Calculation cal){
		double op = cal.calculate(50,10);
		System.out.println(op);
	}
}
