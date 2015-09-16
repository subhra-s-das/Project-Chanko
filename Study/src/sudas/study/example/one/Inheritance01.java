package sudas.study.example.one;

public class Inheritance01 {
	public static void main(String[] args) {

		// creating an object of subclass Dog
		Dog d = new Dog(); // -> The default constructor of Dog is called //
							// here.
		Boy b = new Boy();
	}

}

// Constructors are not inherited like instance variable and methods
// in inheritance, rather they need to be called
// In the below class person I have three constructors
// The default constructor is Person(),

class Person {
	String name;
	int age;

	// Default constructor
	Person() {

	}

	// Argument constructor parameterized constructor
	Person(String name) {

	}

	Person(String name, int age) {

	}

}

class Boy extends Person {

}

/*
 * Here I have a class animal. The DOg class inherits the animal class Both
 * class has default constructors. When I create an object of inherited class
 * and call the inherited method class both super class and subclass
 * constructors are called. Because the dog constructor knows how to initialize
 * the the default constructor of Dog class where as the Animal class
 * constructor knows how to initialize Animal default constructor. As the dog
 * class extends Animal class the animal class default constructor is called.
 * Remember Constructors are not Inherited
 */
class Animal {
	public Animal() {
		System.out.println("Animal : Super constructor");
	}
}

class Dog extends Animal {
	public Dog() {
		System.out.println("Dog : Sub constructor");
	}
}