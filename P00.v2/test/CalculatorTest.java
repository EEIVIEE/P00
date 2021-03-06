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
		//act
		int a = 1234;
		int b = 8765;
		
		//assert
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		
		//arrange
		int expected = 9999;
		assertEquals(expected,actual);
	}
	
	
	@Test
	public void testSubtract() {
		//act
		int a = 9876;
		int b = 4321;
		
		//assert
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);
		
		//arrange
		int expected = 5555;
		assertEquals(actual,expected);
	}
	
	@Test
	public void testMultiply() {
		//act
		int a = 55;
		int b = 101;
		
		//assert
		Calculator cal = new Calculator();
		int actual = cal.multiply(a, b);
		
		//arrange
		int expected = 5555;
		assertEquals(actual,expected);
	}
	
	@Test
	public void testDivide() {
		//act
		int a = 5555;
		int b = 5;
		
		//assert
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);
		
		//arrange
		int expected = 1111;
		assertEquals(actual,expected);
	}
}
