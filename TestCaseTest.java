public class TestCaseTest {
	WasRun test;
	
	public void setUp(){
		test = new WasRun("testMethod");
	} 
	
	public void testTemplateMethod() throws Exception{
		WasRun test = new WasRun("testMethod");
		test.run();
		assert("setUp testMethod tearDown " == test.log);
	}
	
	public static void main(String args[]) throws Exception{	
		new TestCaseTest().setUp();
		new TestCaseTest().testTemplateMethod();
	}
}
