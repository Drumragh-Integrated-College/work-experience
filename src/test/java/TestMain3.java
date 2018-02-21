import junit.framework.TestCase;

public class TestMain3 extends TestCase{


	
	public void testDivideone() {
		assertEquals(2, Work.getDivideNum(10,5));
	}
	

	public void testDividetwo() {
		assertEquals(60, Work.getDivideNum(6000,100));
	}
	
	public void testDividethree() {
		assertEquals(35, Work.getDivideNum(700,20));
	}
	
	
}




