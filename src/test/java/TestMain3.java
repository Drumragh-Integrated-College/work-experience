import junit.framework.TestCase;

public class TestMain3 extends TestCase{

	
	public void testDivideone() {
		assertEquals(5, Work.getDivideNum(10,2));
	}
	
	public void testDividetwo() {
		assertEquals(4, Work.getDivideNum(100,25));
	}
	
	public void testDividethree() {
		assertEquals(13, Work.getDivideNum(169,13));
	}
}

