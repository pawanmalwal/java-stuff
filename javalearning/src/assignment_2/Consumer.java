package assignment_2;

import java.util.Comparator;

public class Consumer {

	int id;
	String name;
	int age;

	public Consumer(int id, String name, int age) {
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

class Sortbyconname implements Comparator<Consumer> {
	public int compare(Consumer a, Consumer b) {
		return a.name.compareTo(b.name);
	}
}