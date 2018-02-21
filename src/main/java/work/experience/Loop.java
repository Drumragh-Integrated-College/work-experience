/**
 * 
 */
package work.experience;

/**
 * @author bamcgill
 *
 */
public class Loop {

	public static int whileLoop(int one) {
		while (one > 0) {
			System.out.println(one);
			one--;
		}
		return one;
	}

	public static int forLoop(int one) {
		for (int var = one; one > 0; one--) {
			System.out.println(one);
			one--;
		}
		return one;
	}

}
