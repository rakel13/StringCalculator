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
		assertEquals(6, StringCalculator.add("1\n2,3"));
	}

	@Test
	public void testIfNegative() {
		("Negatives not allowed: -1").equals(StringCalculator.add("-1,2"));
		("Negatives not allowed: -4,-5").equals(StringCalculator.add("2,-4,3,-5"));

		//assertEguals("Negatives not allowed: -1", StringCalculator.add("-1,2"));
	}

	@Test
	public void testIfTooBig() {
		//assertEquals(6, StringCalculator.add("1,2,3"));
		assertEquals(2, StringCalculator.add("1001,2"));
	}

	@Test
	public void testDelimeter() {
		assertEquals(3, StringCalculator.add("//;\n1;2"));
	}
}