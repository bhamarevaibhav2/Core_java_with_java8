package collections;

import java.util.Comparator;

public class Byidemp implements Comparator<Employees>{

	@Override
	public int compare(Employees o1, Employees o2) {
		
		return o1.getId() - o2.getId();
	}
	
	

}
