package review;

import static org.junit.Assert.*;

import org.junit.Test;

public class PrimeTest {

	@Test
	public void test() {
		boolean res = new PrimeNumbers(7).prime();
		assertEquals(true,res);
		res = new PrimeNumbers(20).prime();
		assertEquals(false,res);
		res = new PrimeNumbers(30).prime();
		assertEquals(false,res);
		res = new PrimeNumbers(97).prime();
		assertEquals(true,res);
		//fail("Not yet implemented");
	}

}
