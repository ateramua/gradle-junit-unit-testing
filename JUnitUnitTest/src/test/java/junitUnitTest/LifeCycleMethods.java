package junitUnitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LifeCycleMethods {
	
	//Before all and AfterAll methods has to be static because those method has to be run before test class is launched and after test class is closed respectively.
	

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println(" Before All Method - this has to be run before the test classs is launched, thus has to be a static the method can be acced ");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println(" After All Method - This has to be run after the test class is closed. thus has to be a static method to access it");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("This method has to be run before each test method is executed");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("This method has to be run after each test method is executed");
	}

	@Test
	void test() {
		System.out.println("This is the method under test");
	}
	

	
	

}
