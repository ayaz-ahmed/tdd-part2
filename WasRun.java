public class WasRun extends TestCase{

	public boolean wasRun = false;
	public boolean wasSetUp;

	public WasRun(String methodName) {
		super(methodName);
		this.wasRun = false;
		this.wasSetUp = true;
	}

	public void testMethod(){
		this.wasRun = true;
	}
	
	public void setUp(){
		this.wasRun = false;
		this.wasSetUp = true;
	}
	
}
