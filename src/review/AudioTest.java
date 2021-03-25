package review;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class AudioTest {

	@Test
	public void test() {
		Integer[] param = {-1,2,3,2,-1,2};
		Integer[] res =new AudioSignal(param).filter();
		Integer[] x = {2,3,2,2,0,0};
		assertEquals(Arrays.toString(x),Arrays.toString(res));
		//ail("Not yet implemented");
	}

}
