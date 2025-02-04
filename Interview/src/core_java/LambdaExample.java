package core_java;

@FunctionalInterface
interface Greeting{
	
	public void sayHello();
	
}

public class LambdaExample {
	
	public static void main(String[] args) {
		
		Greeting g = () -> {System.out.println("Hello..");};
		
		g.sayHello();
		
	}

}
