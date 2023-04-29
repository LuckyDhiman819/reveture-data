package testing;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AirthmaticOperationTest {
	AirthmaticOperation demo;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		demo = new AirthmaticOperation();
	}

	@After
	public void tearDown() throws Exception {
		demo = null;
	}

	@Test
	public void test() {
		AirthmaticOperation demo = new AirthmaticOperation();
		int result = demo.addNumbers(10,20,30);
		
		assertEquals(60, result);
		
	}

}
