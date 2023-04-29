package caching;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class UserValidateTest {

	UserValidate userValidate;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		userValidate = new UserValidate();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testValidate() {
		assertEquals(true, userValidate.validate("Neha", "Agrawal@123"));
	}

}
