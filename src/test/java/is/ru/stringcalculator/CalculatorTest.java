package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest{

	@Test
	public void testEmptyString(){
		assertEquals(0, Calculator.add(""));
	}
	
	@Test
	public void testAddOneNumber(){
		assertEquals(1, Calculator.add("1"));
	}

	@Test
	public void testAddTwoNumbers(){
		assertEquals(3, Calculator.add("1,2"));
	}

	@Test
	public void testMultipleNumbers(){
		assertEquals(15, Calculator.add("1,2,3,4,5"));
	}

	@Test
	public void testNewline(){
		assertEquals(6, Calculator.add("1\n2,3"));
	}

	@Test
    public void testSingleNegativeNumber() {
        try {
            Calculator.add("-1,2");
        } catch (IllegalArgumentException e) {
			assertEquals("Negatives not allowed: -1", e.getMessage());
        }
    }

	@Test
    public void testTwoNegativeNumbers() {
        try {
            Calculator.add("-1,2,-3");
        } catch (IllegalArgumentException e) {
            assertEquals("Negatives not allowed: -1,-3", e.getMessage());
        }
    }
}
