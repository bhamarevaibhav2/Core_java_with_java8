package designPatterns.singleton;

public class SingletonwithInnerclass {
	
	private SingletonwithInnerclass() {
		
	}
	
	private static class innerclass{
		
			private static SingletonwithInnerclass single = new SingletonwithInnerclass();
	}
	
	
	public static SingletonwithInnerclass getInstance() {
		
		return innerclass.single;
		
		
	}
	
	
	public static void main(String[] args) {
		SingletonwithInnerclass s = SingletonwithInnerclass.getInstance();
		
		SingletonwithInnerclass s1 = SingletonwithInnerclass.getInstance();
		
		System.out.println(s);
		System.out.println(s1);
	}

}




