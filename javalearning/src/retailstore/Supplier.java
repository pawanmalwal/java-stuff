package retailstore;

import java.util.Comparator;

public class Supplier {

	int id;
	String name;
	int age;
	double amount;

	public Supplier(int id, String name, int age, double amount) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.amount = amount;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getAmount() {
		return amount;
	}

	public String toString() {
		return getName() + " " + getId() + " " + getAge() + " " + getAmount();
	}

}

class Sortbysuppname implements Comparator<Supplier> {
	public int compare(Supplier a, Supplier b) {
		return a.name.compareTo(b.name);
	}
}
