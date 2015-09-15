package sudas.study.example.one;

public class Inheritance01 {
	public static void main(String[] args) {

		
	}
}

class Person {
	String name;
	String address;

	public void printinfo(String name, String address) {
		this.name = name;
		this.address = address;
		System.out.println("Name: " + name + '\n' + "Address: " + address);
	}
}

class Boy extends Person {
	public void info() {
		System.out.println("Subclass Name " + this.name);

		System.out.println(name);
	}

}

class Student extends Person {
	String StudentID;
	
	public void printinfo()
	{
		
	}

}

class Teacher extends Person {
String teachedID;
public void printinfo()
{
	
}
}

class Lecturer extends Teacher {

	String LecturerID;
	public void printinfo()
	{
		
	}
	
}