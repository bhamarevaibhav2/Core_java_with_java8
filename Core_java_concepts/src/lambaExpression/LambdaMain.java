package lambaExpression;

//functional interface
@FunctionalInterface
interface shape{
		public void draw();
		
		
	}
	
public class LambdaMain {
	
	public static void main(String[] args) {
		
//		shape rectangle = () -> {
//			System.out.println("Rectangle by lambda..");
//		};
//		
//		shape circle = () -> {
//			System.out.println("circle by lambda..");
//		};
//		
//		shape square = () -> {
//			System.out.println("square by lambda..");
//		};
	
//		rectangle.draw();
//		circle.draw();
//		square.draw();
		
		//pass lambda expression by method
//		print(rectangle);
//		print(circle);
//		print(square);
		
		//pass lambda expression by method
		print(() -> System.out.println("Rectangle by lambda.."));
		print(() -> System.out.println("circle by lambda.."));
		print(() -> System.out.println("square by lambda.."));
	}
	
public static void print(shape sh) {
		
		sh.draw();
	}
}
