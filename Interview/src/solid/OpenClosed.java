package solid;


//Software entities (classes, modules, functions, etc.) should be open for extension but closed for modification. 
//This means you should be able to add new functionality without changing existing code. 
//This can be achieved through interfaces and abstract classes.
public class OpenClosed {

	abstract class Shape {
		abstract void area();
	}

	class circle extends Shape {

		@Override
		void area() {
			System.out.println("Circle area...");
		}
	}
	
	class Rectangle extends Shape {

		@Override
		void area() {
			System.out.println("Rectangle area...");
		}
	}
	
	//here you can add next shape without modifying existing code

}
