public class WasRun extends TestCase{

	public boolean wasRun = false;
	public boolean wasSetUp;
	public String log;
	
	public WasRun(String methodName) {
		super(methodName);
		this.wasRun = false;
		this.wasSetUp = true;
	}

	public void testMethod(){
		this.log= this.log + "testMethod ";
	}
	
	public void setUp(){
		this.log = "setUp ";
	}
	
	public void tearDown(){
		this.log = this.log + "tearDown";
	}	
	
	public void testBrokenMethod() throws Exception{
		throw new Exception();
	}
}
