package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertTrue(1==1);
		MyInteger n = new MyInteger(5);
		assertTrue(n.isOdd());
		assertFalse(n.isEven());
		
		MyInteger a= new MyInteger(13);
		assertTrue(a.isPrime());
		
		assertTrue(MyInteger.isEven(4));
		assertFalse(MyInteger.isEven(5));
		assertTrue(MyInteger.isOdd(3));
		assertFalse(MyInteger.isOdd(6));
		assertTrue(MyInteger.isPrime(11));
		assertFalse(MyInteger.isPrime(15));
		

		
		
	}

}
