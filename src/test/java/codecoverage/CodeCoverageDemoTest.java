package codecoverage;

import static org.junit.Assert.*;

import org.junit.Test;

import codecoverage.CodeCoverageDemo;

public class CodeCoverageDemoTest {

	@Test
	public void testSquare() {
		CodeCoverageDemo demo = new CodeCoverageDemo();
		int a = demo.square(5);
		assertEquals(25,a);
	}

	@Test
	public void testCube() {
		CodeCoverageDemo demo = new CodeCoverageDemo();
		int a = demo.cube(5);
		assertEquals(125,a);
	}
	
	@Test
	public void testProduct() {
		CodeCoverageDemo demo = new CodeCoverageDemo();
		int a = demo.product(5,6);
		assertEquals(30,a);
	}
}
