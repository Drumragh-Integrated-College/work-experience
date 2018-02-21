import junit.framework.TestCase;
import work.experience.Loop;

public class TestLoop extends TestCase {

	public void testWhileLoop() {
		assertFalse(0 > Loop.whileLoop(5));
	}
	
	public void testWhileLoop2() {
		assertEquals(0 , Loop.whileLoop(5));
	}

	public void testForLoop() {
		assertFalse(0 > Loop.whileLoop(5));
	}
	
	public void testForLoop2() {
		assertEquals(0 , Loop.whileLoop(5));
	}

}
