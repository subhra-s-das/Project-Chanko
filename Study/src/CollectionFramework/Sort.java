package CollectionFramework;

import java.util.ArrayList;

public class Sort {

	public static void main(String[] args) {
		// Comparable and Comparator interfaces
new Sort().comparable();
	}

	public void comparable() {

		Fruit fruit = new Fruit();
		fruit.setName("Apple");
		fruit.setColour("Red");
		fruit.setQuantity(10);

		fruit.setName("Banana");
		fruit.setColour("Green");
		fruit.setQuantity(15);

		fruit.setName("Orange");
		fruit.setColour("Yellow");
		fruit.setQuantity(20);

		ArrayList<Fruit> list = new ArrayList<Fruit>();
		list.add(fruit);
		System.out.println(list.get(0).getName());

	}

}
