package designPatterns.singleton;

public final class SingletoncClass {
	
	//1. private static instance member
	//private static final SingletoncClass class1 = new SingletoncClass();
	private static SingletoncClass class1 = null;
	
   //2. private constructor
	private SingletoncClass(){
		
	}

	public static SingletoncClass getSingletoncClass() {
		
		if(class1 == null) {
			
			synchronized (SingletoncClass.class) {
				
					class1 = new SingletoncClass();
			}
			
		}
		return class1;
	}
}
