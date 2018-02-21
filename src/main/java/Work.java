public class Work {
	public static void main(String[] args) {

		System.out.println("Hello, World!");
		System.out.println(getAddNum(4, 7));
		System.out.println(getMultiplyNum(17, 20));
	}

	public static int getAddNum(int one, int two) {
		return one + two;
	}
	
	public static int getMultiplyNum(int one, int two) {
		return one * two;
	}
	
	public static int getDivideNum(int one, int two) {
		return one / two;
	}
}
