import junit.framework.TestCase;

public class TestMain2 extends TestCase{


	public void testMultipleOne() {
		assertFalse(22 > Work.getMultiplyNum(5, 5));
	}
	
	

	public void testMultipletwo() {
		assertEquals(25 , Work.getMultiplyNum(5, 5));
	}
	

	public void testMultipleThree() {
		assertEquals(0 , Work.getMultiplyNum(0,0));
	}

	public void testMultiplefour() {
		assertEquals(5899410, Work.getMultiplyNum(1062,5555));
	}

	public void testMultiplefive() {
		assertEquals(68, Work.getMultiplyNum(34,2));
	}
	
	public void testMultiplesix() {
		assertEquals(-782, Work.getMultiplyNum(-34,23));
	}
	
	public void testMultipleseven() {
		assertEquals(47400, Work.getMultiplyNum(632,75));
	}
	
	
	public void testMultipleeight() {
		assertEquals(3.0, Work.getMultiplyDecimalNum(1.5,2));
	}

}

