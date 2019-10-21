
import static org.junit.Assert.*;

import org.junit.Test;

class validlSB {

	@Test
	public void checkAValid10DigitISBN() {
		validisb validator = new validisb();
		boolean result = validator.checkISBN("0140449116");
		assertTrue("first value", result);
		result = validator.checkISBN("0140177396");
		assertTrue("second value", result);
	}
	
	@Test 
	public void checkAValid13DigitISBN() {
		validisb validator = new validisb();
		boolean result = validator.checkISBN("9781853260087");
		assertTrue("first value", result);
		result = validator.checkISBN("9781853267338");
		assertTrue("second value", result);
	}
	
	@Test
	public void TenDigitISBNNumbersEndingInAnXAreValid() {
		validisb validator = new validisb();
		boolean result = validator.checkISBN("012000030X");
		assertTrue(result);
	}
	
	@Test
	public void checkAnInvalid10DigitISBN() {
		validisb validator = new validisb();
		boolean result = validator.checkISBN("0140449117");
		assertFalse(result);
	}
	
	@Test
	public void checkAnInvalid13DigitISBN() {
		validisb validator = new validisb();
		boolean result = validator.checkISBN("9781853267336");
		assertFalse(result);
	}
	
	@Test(expected = NumberFormatException.class)
	public void nineDigitISBNsAreNotAllowed() {
		validisb validator = new validisb();
		validator.checkISBN("123456789");
	}
	
	@Test(expected = NumberFormatException.class)
	public void nonNumericISBNsAreNotAllowed() {
		validisb validator = new validisb();
		validator.checkISBN("helloworld");
	}

}



