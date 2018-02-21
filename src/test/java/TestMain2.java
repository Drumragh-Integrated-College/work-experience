import junit.framework.TestCase;
import work.experience.Work;

public class TestMain2 extends TestCase {

	public void testMultiplefive1() {
		assertEquals(300, Work.getMultiplyNum(60, 5));
	}

	public void testMultiplesix1() {
		assertEquals(30, Work.getMultiplyNum(6, 5));
	}

	public void testMultipleseven1() {
		assertEquals(-300, Work.getMultiplyNum(-10, 30));
	}

	public void testMultiplefive() {
		assertEquals(68, Work.getMultiplyNum(34, 2));
	}

	public void testMultiplesix() {
		assertEquals(-782, Work.getMultiplyNum(-34, 23));
	}

	public void testMultipleseven() {
		assertEquals(47400, Work.getMultiplyNum(632, 75));
	}

	public void testMultipleeight() {
		assertEquals(3.0, Work.getMultiplyDecimalNum(1.5, 2));
	}

}
