package junitUnitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

class RepeatTest {

	Calculator calculator;
	
	@BeforeEach()
	void methodA() {
		System.out.println("Before Each Test Methods Are Executed");
		 calculator = new Calculator();
	}
	
//	@Disabled	
	@RepeatedTest(1)
	@DisplayName("Substruction Test")
	void substructionTest(TestInfo testInfo, RepetitionInfo repInfo) {
		String result = String.valueOf(calculator.integerSubtraction(8, 2));
		System.out.println(result + " Result of the substruction");
		
		System.out.println("Current Repetition number is " + repInfo.getCurrentRepetition());
		
		System.out.println("Method Name is " + testInfo.getTestMethod().get().getName());
	}
	

	@RepeatedTest(value=3, name="{displayName} Repetition {currentRepetition} of {totalRepetitions}")
	void divisionMethod() {
		String divisionResult = String.valueOf(calculator.integerDivision(8, 2));
		assertEquals(4,calculator.integerDivision(8, 2), ()->"Division of 8 by 2 is NOT equal to 2");
		//System.out.println(divisionResult + " Division Result");
	}

}
