package junitUnitTest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;



@TestMethodOrder(MethodOrderer.Random.class)
class RandomOrderTest {

Calculator calculator;
	
	@BeforeEach()
	void beforeEachTestMethods() {
		System.out.println("Before Each Test Methods Are Executed");
		 calculator = new Calculator();
	}
	
	@Test
	//@Disabled("In progress")
	@DisplayName("Substruction Test C")
	void substructionTest() {
		String result = String.valueOf(calculator.integerSubtraction(8, 2));
		System.out.println(result + " Result of the substruction C");
	}
	
	@Test
	//@Disabled("In progress")
	@DisplayName("Division Test - lambda failed message B")
	void testDivision() {
		String divisionResult = String.valueOf(calculator.integerDivision(8, 2));
		assertEquals(4,calculator.integerDivision(8, 2), ()->"Division of 8 by 2 is NOT equal to 2");
		System.out.println(divisionResult + " Division Result B");
	}
	

	@Test
	@DisplayName("No Test A")
	void test() {
		System.out.println(" No Test A");
	}

}
