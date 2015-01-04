import java.lang.reflect.Method;


public class TestCase {
	private String methodName;

	public TestCase(String methodName){
		this.methodName = methodName;
	}
	
	public void setUp(){
		
	}
	
	public void run(TestResult result){
		result.testStarted();
		this.setUp();
		
		try{
			Method method = this.getClass().getMethod(this.methodName);
			method.invoke(this);	
		}catch(Exception ex){
			result.testFailed();
		}
		
		this.tearDown();		
	}
	
	public void tearDown(){
		
	} 
	
}
