package review;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConsonantsTest {

	@Test
	public void test() {
		String param = "hola como estas";
		String res = new Consonants(param).consonantes();
		String x = "hl cm sts";
		assertEquals(x,res);
		//fail("Not yet implemented");
	}

}
