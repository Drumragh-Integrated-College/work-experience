package work.experience;

public class Rebecca {

	public static void main(String[] args) {
		System.out.println("My name is Rebecca");
		rebeccaLoop(2);
	}

	public static void rebeccaLoop(int number) {
		while (number < 10) {
			System.out.println(number);
			number++;
		}
	}

}