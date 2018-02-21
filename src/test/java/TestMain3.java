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
	
	

	
	public void testDivideone1() {
		assertEquals(5, Work.getDivideNum(10,2));
	}
	
	public void testDividetwo1() {
		assertEquals(4, Work.getDivideNum(100,25));
	}
	
	public void testDividethree1() {
		assertEquals(13, Work.getDivideNum(169,13));
	}
}
