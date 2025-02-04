package solid;

//Objects of a superclass should be replaceable with objects of a subclass without affecting the correctness of the program. 
//This principle ensures that a subclass can stand in for its superclass. 
//Violating this principle can lead to unexpected behavior.
interface Flyable {
	void fly();
}

abstract class Birds {
	abstract void color();
}

class Sparrow extends Birds implements Flyable {
	@Override
	public void fly() {
		System.out.println("Sparrow flying");
	}

	@Override
	void color() {
		System.out.println("Sparrow color");
	}
}

class Penguin extends Birds {

	@Override
	void color() {
		System.out.println("penguin color");

	}
	// Penguins do not implement Flyable
}

public class LiskovSubstitution {
	public static void main(String[] args) {
		Flyable myBird = new Sparrow();
		myBird.fly(); // Output: Sparrow flying

		Birds birds = new Penguin();
		birds.color();

	}
}
