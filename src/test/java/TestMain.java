import static org.junit.Assert.assertNotEquals;

import junit.framework.TestCase;
import work.experience.Work;

public class TestMain extends TestCase {

	public void testEva1() {
		assertEquals(3, Work.getAddNum(2, 1));
	}

	public void testBarry() {
		assertEquals(30000, Work.getAddNum(10000, 20000));
	}

	public void testMac() {
		assertEquals(10, Work.getAddNum(-10, 20));
	}

	public void testToe() {
		assertEquals(-200, Work.getAddNum(-100, -100));
	}

	public void testExperience() {
		assertEquals(250, Work.getAddNum(500, -250));
	}

	public void testApple() {
		assertEquals(100, Work.getAddNum(20, 80));
	}

	public void testBarry2() {
		assertEquals(30000, Work.getAddNum(10000, 20000));
	}

	public void testApple2() {
		assertEquals(50, Work.getDivideNum(100, 2));
	}

	public void testApple3() {
		assertEquals(30.25, Work.getDivideNum(60.5, 2));
	}

	public void testOne() {
		assertEquals(2, Work.getAddNum(1, 1));
	}

	public void testEva() {
		assertEquals(3, Work.getAddNum(2, 1));
	}

	public void testrose() {
		assertNotEquals(3, Work.getAddNum(768, 357));
	}

	public void testThree() {
		assertEquals(2, Work.getAddNum(1, 1));
	}
}
