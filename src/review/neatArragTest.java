package review;

import static org.junit.Assert.*;

import org.junit.Test;

public class neatArragTest {

	@Test
	public void test() {
		Integer[] neat = {1,2,3,4,5,6};
		boolean res = new neatArragement(neat).isOrder();
		assertEquals(true,res);
		Integer[] neat2 = {4,5,6,7,8,9,10,3};
		res = new neatArragement(neat2).isOrder();
		assertEquals(false,res);
		//fail("Not yet implemented");
	}

}
