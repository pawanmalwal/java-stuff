package assignment_1;

public class Supplier {

	Supplier() {
		System.out.println("Supplier Class");
	}

	public String printName(String name) {
		String msg = "Welcome Supplier :" + name;
		return msg;
	}
}
