package sudas.study.example.one;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class UniqueRandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// new Random1().random();
		// new Random2().random();
		new Random3().random();
	}

}

// this will create numbers not random from 1 to 10 but not unique
class Random1 {
	public void random() {
		// with arraylist
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		for (int i = 1; i <= 10; i++) {
			arraylist.add(i);
		}
		for (int i = 1; i <= 10; i++) {
			Integer randomNumbers = arraylist.get(i);
			System.out.println("From ArrayList :" + randomNumbers.intValue());
		}

	}
}

// Random numbers are getting generated but numbers are not unique
class Random2 {
	public void random() {
		for (int i = 1; i <= 10; i++) {
			Random random = new Random();
			Object nextNo = random.nextInt(i);
			System.out.println(nextNo);
		}

	}
}

// This is unique random number generator
class Random3 {
	public void random() {
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		for (int i = 0; i <= 10; i++) {
			arraylist.add(i);
		}
		Collections.shuffle(arraylist);
		for (int i = 0; i < 10; i++) {
			Integer randomNumbers = arraylist.get(i);
			System.out.println("Unique Random Numbers :" + randomNumbers.intValue());

		}
	}
}
