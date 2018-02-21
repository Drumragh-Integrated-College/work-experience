import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import junit.framework.TestCase;

public class TestMain extends TestCase {

	public void testOne1() {
		Work rory = new Work();
		assertEquals(2, rory.getAddNum(1, 1));
		System.out.println("testone complete");
	}

	public void testEva1() {
		Work rory = new Work();
		assertEquals(3, rory.getAddNum(2, 1));
		System.out.println("testone complete");
	}

	public void testBarry() {
		Work rory = new Work();
		assertEquals(30000, Work.getAddNum(10000, 20000));
		System.out.println("testone complete");
	}

	public void testMac() {
		Work rory = new Work();
		assertEquals(10, Work.getAddNum(-10, 20));
		System.out.println("testone complete");
	}

	public void testToe() {
		Work rory = new Work();
		assertEquals(-200, Work.getAddNum(-100, -100));
		System.out.println("testone complete");
	}

	public void testExperience() {
		Work rory = new Work();
		assertEquals(250, Work.getAddNum(500, -250));
		System.out.println("testone complete");
	}

	public void testApple() {
		Work rory = new Work();
		assertEquals(100, rory.getAddNum(20, 80));
	}
	public void testBarry2() {
		Work rory= new Work();
		assertEquals(30000, rory.getAddNum(10000, 20000));
	}

	public void testApple2() {
		assertEquals(50, Work.getDivideNum(100, 2));
	}

public void testApple3() {
	Work rory = new Work();
	assertEquals(30.25, rory.getDivideNum(60.5, 2));
}

	public void testOne() {
		Work rory= new Work();
		assertEquals(2, rory.getAddNum(1, 1));
		System.out.println("testone complete");
	}
	
	public void testEva() {
		Work rory= new Work();
		assertEquals(3, rory.getAddNum(2, 1));
		System.out.println("testone complete");
	}
	
	public void testrose() {
		Work rory= new Work();
		assertNotEquals(3, rory.getAddNum(768, 357));
		System.out.println("testone complete");
    }

	public void testThree() {
		Work rory= new Work();
		assertEquals(2, rory.getAddNum(1, 1));
		System.out.println("testone complete");
	}
}
