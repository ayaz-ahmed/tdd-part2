
public class TestResult {

	private int runCount;
	
	public TestResult(){
		this.runCount = 0;	
	}
	
	public void testStarted(){
		this.runCount = this.runCount + 1;
	}
	public String summary(){
		return runCount + " run, 0 failed";
	}
}


