import junit.framework.TestCase;

public class TestMain extends TestCase{

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

}
