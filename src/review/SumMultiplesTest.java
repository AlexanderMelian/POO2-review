package review;

import static org.junit.Assert.*;

import org.junit.Test;

public class SumMultiplesTest {

	@Test
	public void test() {
		int res = new SumOfMultiples(10).sumaMultiplos();
		assertEquals(23,res);
		res = new SumOfMultiples(16).sumaMultiplos();
		assertEquals(60,res);
		//fail("Not yet implemented");
	}

}
