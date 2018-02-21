package work.experience;

public class Rory {

	public static void main(String[] args) {
		System.out.println("My name is Rory");
		rorysLoop(4);
	}

	public static void rorysLoop(int number) {

		while (number < 10) {
			System.out.println(number);
			number++;
		}
	}
}
