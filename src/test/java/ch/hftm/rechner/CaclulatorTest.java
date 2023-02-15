package ch.hftm.rechner;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;

public class CaclulatorTest {

	private Calculator calculator;

	@BeforeEach
	public void setUp() throws Exception {
		calculator = new Calculator();
	}

	@Test
	public void addIntegers() {
		double result = calculator.pls(5, 0);
		Assertions.assertEquals(5, result, 0);
	}

	@Test
	public void test2() {
		double result = calculator.m(92, 1.2);
		Assertions.assertEquals(90.8, result, 0);
	}

	@Test
	public void test3() {
		double result = calculator.div(20, 5);
		Assertions.assertEquals(4, result, 0.001);
	}
}
