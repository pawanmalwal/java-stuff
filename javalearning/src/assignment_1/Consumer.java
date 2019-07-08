package assignment_1;

public class Consumer {

	Consumer() {
		System.out.println("Consumer Class");
	}

	public String printName(String name) {
		String msg = "Welcome Consumer: " + name;
		return msg;
	}

}
