package collections;

import java.util.Comparator;

public class Employees{
	
	public String name;
	public int id;
	public String pos;
	
	
	public Employees(String name, int id, String pos) {
		super();
		this.name = name;
		this.id = id;
		this.pos = pos;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPos() {
		return pos;
	}

	public void setPos(String pos) {
		this.pos = pos;
	}
	
}
