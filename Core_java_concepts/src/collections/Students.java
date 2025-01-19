package collections;

public class Students implements Comparable<Students>{
	
	public int age;
	public String name;
	
	
	
	public Students(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	@Override
	public int compareTo(Students o) {
		
//		if(age == o.age){
//			
//			return 0;
//		}
//		else if(age > o.age)
//		{
//			return 1;
//		}
//		else
//		return -1;
		
		return this.age - o.age;
	}
	
	

}

