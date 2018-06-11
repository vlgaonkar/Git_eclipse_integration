import static org.junit.Assert.*;

import org.junit.Test;

public class SampleTest {

	@Test
	public void SampleTestPass(){
		
		
		int a = 1;
		int b = 2;
		assertTrue(a + b == 3)/*testing integration again after connecting to mobile network*/;
	}
	@Test
	public void SampleTestFail(){
		
		
		int a = 1;
		int b = 2;
		assertTrue(a * b * 2 == 4);
	}
}
