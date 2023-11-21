package junitUnitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(OrderAnnotation.class)
class OrderByIndexTest {


	Calculator calculator;
	

	@BeforeEach()
	void methodA() {
		System.out.println("Before Each Test Methods Are Executed");
		 calculator = new Calculator();
	}
	
	@Order(2)
	@Test
	@DisplayName("Substruction Test B")
	void methodB() {
		String result = String.valueOf(calculator.integerSubtraction(8, 2));
		System.out.println(result + " Result of the substruction");
	}
	
	@Order(3)
	@Test
	@DisplayName("Division Test - lambda failed message C")
	void methodC() {
		String divisionResult = String.valueOf(calculator.integerDivision(8, 2));
		assertEquals(4,calculator.integerDivision(8, 2), ()->"Division of 8 by 2 is NOT equal to 2");
		System.out.println(divisionResult + " Division Result");
	}
	

	@Order(1)
	@Test
	@DisplayName("Division Test - lambda failed message D")
	void methodD() {
		System.out.println("This test should be executed first");
	}

}
