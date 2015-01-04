public class TestCaseTest {
	
	public void testRunning() throws Exception {
		WasRun test = new WasRun("testMethod");
		assert(!test.wasRun);
		test.run();
		assert(test.wasRun);
	}
	
	public void testSetUp() throws Exception{
		WasRun test = new WasRun("testMethod");
		test.run();
		assert(test.wasSetUp);
	}
	
	public static void main(String args[]) throws Exception{	
		new TestCaseTest().testRunning();
		new TestCaseTest().testSetUp();
	}
}
