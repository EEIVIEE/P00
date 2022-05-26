import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/*
 * I declare that this code was written by me. 
 * I do not copy or allow others to copy my code. 
 * I understand that copying code is considered as plagiarism.
 * 
 * Student Name: Puah Yu Hao Louis
 * Student ID: 21021397
 * Class: W64F
 * Date/Time created: Thursday 26-05-2022 09:57
 */

/**
 * @author User
 *
 */
public class CalculatorTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		//variables
		int a = 1234;
		int b = 8765;
		
		//functions - sum
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		
		//test
		int expected = 9999;
		assertEquals(expected,actual);
	}
	
	
	@Test
	public void testSubtract() {
		//variables
		int a = 9876;
		int b = 4321;
		
		//functions - subtraction
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);
		
		//test
		int expected = 5555;
		assertEquals(actual,expected);
	}
	
	@Test
	public void testMultiply() {
		//variables
		int a = 55;
		int b = 101;
		
		//functions - multiplication
		Calculator cal = new Calculator();
		int actual = cal.multiply(a, b);
		
		//test
		int expected = 5555;
		assertEquals(actual,expected);
	}
	
	@Test
	public void testDivide() {
		//variables
		int a = 5555;
		int b = 5;
		
		//functions - division
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);
		
		//test
		int expected = 1111;
		assertEquals(actual,expected);
	}
}
