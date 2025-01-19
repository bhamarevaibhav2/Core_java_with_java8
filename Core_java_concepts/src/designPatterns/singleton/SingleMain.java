package designPatterns.singleton;

public class SingleMain {
	
	public static void main(String[] args) {
		
		SingletoncClass obj =SingletoncClass.getSingletoncClass();
		
		SingletoncClass obj1 = SingletoncClass.getSingletoncClass();
		
		System.out.println(obj);
		System.out.println(obj1);
		
	}

}
