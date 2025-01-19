package designPatterns.singleton;

//final class can not inherit
public final class Immutable{
	
	
	//all members are private
	private String name;
	
	public Immutable(String name) {
		
		this.name = name;
	}
	
	//only getter methods not setter
	public String getName() {
		return name;
	}
	
	
	public static void main(String[] args) {
		
		Immutable im = new Immutable("Vaibhav");// at the this time only assign value
		
		im.getName();
		
	}

}
