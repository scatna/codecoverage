package codecoverage;

import static org.junit.Assert.*;

import org.junit.Test;

import com.copart.codecoverage.CodeCoverageDemo;

public class CodeCoverageDemoTest {

	@Test
	public void testSquare() {
		CodeCoverageDemo demo = new CodeCoverageDemo();
		int a = demo.square(5);
		assertEquals(25,a);
		
	}

}
