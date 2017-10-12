package is.ru.hugb;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {
	
	@Test
	public void testEmptyString() {
		assertEquals(0, StringCalculator.add(""));
	}

	@Test
	public void testOneNumber() {
		assertEquals(1, StringCalculator.add("1"));
	}

	@Test
	public void testTwoNumber() {
		assertEquals(3, StringCalculator.add("1,2"));
	}

	@Test
	public void testMultiplesNumbers() {
		assertEquals(6, StringCalculator.add("1,2,3"));
	}
}