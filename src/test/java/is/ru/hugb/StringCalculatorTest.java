package is.ru.hugb;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {
	
	@Test
	public void testEmptyString() {
		assertEquals(0, StringCalculator.add(""));
	}
}