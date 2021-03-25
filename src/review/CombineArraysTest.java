package review;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class CombineArraysTest {

	@Test
	public void test() {
		Integer[] param1 = {3,4,7};
		Integer[] param2 = {3,6,7};
		int[] res = new CombineTwoArrays(param1,param2).combine();
		int[] compare ={3,3,4,6,7,7};
		assertEquals(Arrays.toString(compare),Arrays.toString(res));
		//fail("Not yet implemented");
	}

}
