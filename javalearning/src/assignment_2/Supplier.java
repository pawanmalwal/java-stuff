package assignment_2;

import java.util.Comparator;

public class Supplier {

	int id;
	String name;
	int age;

	public Supplier(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public String toString() {
		return this.name + " " + this.id + " " + this.age;
	}
	
}

class Sortbysuppname implements Comparator<Supplier> {
	public int compare(Supplier a, Supplier b) {
		return a.name.compareTo(b.name);
	}
}
