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


}
