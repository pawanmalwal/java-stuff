package retailstore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {

	public static void main(String[] args) {

		List<Supplier> suppList = new ArrayList<>();

		suppList.add(new Supplier(1001, "Vihaan", 7, 5000));
		suppList.add(new Supplier(1005, "Gaurav", 35, 8000));
		suppList.add(new Supplier(1003, "Pawan", 38, 7000));

		Collections.sort(suppList, new Sortbysuppname());

		System.out.println("\nSorted Consumer by name");
		for (int i = 0; i < suppList.size(); i++)
			System.out.println(suppList.get(i));

		List<Consumer> consList = new ArrayList<>();

		consList.add(new Consumer(2006, "Sid", 27, 9000));
		consList.add(new Consumer(2001, "John", 65,3000));
		consList.add(new Consumer(2004, "Ravi", 19, 2000));

		Collections.sort(consList, new Sortbyconname());

		System.out.println("\nSorted Supplier by name");
		for (int i = 0; i < consList.size(); i++)
			System.out.println(consList.get(i));
	}

}
