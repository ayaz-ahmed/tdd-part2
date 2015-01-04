import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class TestSuite {

	List<TestCase> tests = null;
	
	
	public TestSuite(){
		tests = new ArrayList<TestCase>();
	}
	
	public void add(TestCase test){
		tests.add(test);	
	}
	
	public TestResult run(TestResult result){
		for (TestCase test : tests) {
			test.run(result);
		}		
		return result;
	}
}
