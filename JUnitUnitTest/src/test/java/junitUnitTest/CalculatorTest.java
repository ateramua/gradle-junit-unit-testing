package junitUnitTest;


class CalculatorTest {
//	
//	Calculator calculator;
//	
//	@BeforeEach()
//	void methodA() {
//		System.out.println("Before Each Test Methods Are Executed");
//		 calculator = new Calculator();
//	}
//	
//	
//	@Test
//	@DisplayName("Substruction Test")
//	void testSubstruction() {
//		String result = String.valueOf(calculator.integerSubtraction(8, 2));
//		System.out.println(result + " Result of the substruction");
//	}
//	
//	@Test
//	@DisplayName("Division Test - lambda failed message")
//	void testDivision() {
//		String divisionResult = String.valueOf(calculator.integerDivision(8, 2));
//		assertEquals(4,calculator.integerDivision(8, 2), ()->"Division of 8 by 2 is NOT equal to 2");
//		System.out.println(divisionResult + " Division Result");
//	}
	
//	@DisplayName("Exception Validation Test")
//	@Test
//	void testThrowsExecption() {
//		String expected = "/ by zero";
//		ArithmeticException exception	= assertThrows(ArithmeticException.class,()->calculator.integerDivision(6, 0));
//		System.out.println(exception.getMessage() + " Exception Message is");
//		System.out.println(expected + " Expected Exeception message is ");
//		System.out.println(exception + " Exception Throws is");
//		assertEquals(expected,exception.getMessage()," Test should have thrown an exeception");
//	}
//	
//	//@Disabled("In progress")
//	@DisplayName("Parameterized Test - MethodSource annotation")
//	@ParameterizedTest
//	@MethodSource("integerAdditionInputParameter")
//	void additionTest(int x, int y, int expected) {
//		//A - initialization is completed in the BeforeEach method
//		
//		//AA - Action
//		int result = calculator.integerAddition(x, y);
//		//AAA - assertion
//		expected = x + y;
//		assertEquals(expected,result," Addition Method failed to produce the expected result");
//	}
//	
//	public static Stream<Arguments> integerAdditionInputParameter() {
//		return Stream.of(
//				
//				Arguments.of(3,4,7),
//				Arguments.of(5,9,14)
//				
//				);				
//	}
//	
//	@DisplayName("Parameterized Test - MethodSource annotation - String Concacnation")
//	@ParameterizedTest
//	@MethodSource("stringConcaInputParameter")
//	void stringConcaTest(String x, String y, String expected) {
//		//A - initialization is completed in the BeforeEach method
//		
//		//AA - Action
//		String result = calculator.printString(x, y);
//		//AAA - assertion
//		System.out.println("MethodSource String con result " + result);
//		System.out.println("MethodSource String con expected " + expected);
//		//expected = x + y;
//		assertEquals(expected,result," Addition Method failed to produce the expected result");
//	}
//	
//	public static Stream<Arguments> stringConcaInputParameter() {
//		return Stream.of(
//				
//				Arguments.of("Apple","Banana","Apple Banana"),
//				Arguments.of("a","b","a b")
//				
//				);				
//	}
//	
//	
//	
////	@Disabled("In progress")
//	@DisplayName("Parameterized Test - CSVSource annotation - number parameter Test")
//	@ParameterizedTest
//	@CsvSource({
//		"5,6,11",
//		"1,7,8"
//	})
//	void csvSourceTest(int x, int y, int expected) {
//		//A - initialization is completed in the BeforeEach method
//		
//		//AA - Action
//		int result = calculator.integerAddition(x, y);
//		//AAA - assertion
//		//expected = x + y;
//		assertEquals(expected,result," Addition Method failed to produce the expected result");
//	}
//	
////	@Disabled
//	@DisplayName("Parameterized Test - CSVSource annotation - String parameter Test")
//	@ParameterizedTest
//	@CsvSource({
//		"Apple,Banana,Apple Banana",
////		"Apple,'',Apple ",
//		"Apple,,Apple null"
//	})
//	void csvSourceStringParaTest(String x, String y, String expected) {
//		//A - Arrange - initialization is completed in the BeforeEach method
//		
//		//AA - Action
//		String result = calculator.printString(x, y);
//		System.out.println("This is the result found "+result);
//		//AAA - assertion
//		//expected = x + " " + y;
//		System.out.println("This is the expected result " + expected);
//		assertEquals(expected,result," String concanation Method failed to produce the expected result");
//	}
//	
//	//JUnit may not have a built-in ParameterResolver for handling String parameters with @CsvFileSource
//	@Disabled
//	@ParameterizedTest
//	@DisplayName("Parameterized Test - CsvFileSource annotation - String parameter Test")
//	@CsvFileSource(files="src/test/resources/addition.csv")
//	void csvFileSourceSParaTest(String a, String b, String expected) {
//		//A - Arrange - initialization is completed in the BeforeEach method
//		
//		//AA - Action
//		String result = calculator.printString(a, b);
//		System.out.println("This is the result found CSV File"+result);
//		//AAA - assertion
//	//	expected = x + " " + y;
//		System.out.println("This is the expected result CSV File" + expected);
//		assertEquals(" String concanation Method failed to produce the expected result",expected,result);
//	}
//	
//	//@Disabled
//	@ParameterizedTest
//	@DisplayName("Parameterized Test - CSVFileSource annotation - number parameter Test- using file")
//	@CsvFileSource(files="src/test/resources/additionfile.csv")
//	void csvFileSourceIntParaTest(int a, int b, int expected) {
//		//A - Arrange - initialization is completed in the BeforeEach method
//		
//		//AA - Action
//		int result = calculator.integerMultiplication(a, b);
//		System.out.println("This is the result found CSV File"+result);
//		//AAA - assertion
//	//	expected = x + " " + y;
//		System.out.println("This is the expected result CSV File" + expected);
//		//assertEquals(" String concanation Method failed to produce the expected result",expected,result);
//	}
//	
//	
////	@Test
//
//	
//	@AfterEach() 
//	void afterEachTestMethod() {
//		
//		System.out.println("After Each Test Methods Are Executed");
//	}
//	
//
//	
//	@AfterAll()
//	static void afterAllTestMethods() {
//		System.out.println("After All Test Methods Are Executed");
//	}
//	
//
//	
//
//	
//
//	//@Disabled
//	@ParameterizedTest
//	@DisplayName("Parameterized Test - CSVFileSource annotation - number parameter Test - usings resources")
//	@CsvFileSource(resources="/additionfile.csv")
//	void csvFileSourceIntParaResourcesTest(int a, int b, int expected) {
//		//A - Arrange - initialization is completed in the BeforeEach method
//		
//		//AA - Action
//		int result = calculator.integerMultiplication(a, b);
//		System.out.println("This is the result found CSV File"+result);
//		//AAA - assertion
//	//	expected = x + " " + y;
//		System.out.println("This is the expected result CSV File" + expected);
//	//	assertEquals(" String concanation Method failed to produce the expected result",expected,result);
//	}
//	
//	@ParameterizedTest
//	@ValueSource(ints= {1,2,3})
//	@DisplayName("Value source data provider Demo with Integer parameter")
//	void valueSourceDemoInt(int x) {
//		System.out.println("The value of parameter is :" + x);
//	}
//	
//	@ParameterizedTest
//	@ValueSource(strings= {"Apple","Orange","Banana"})
//	@DisplayName("Value source data provider Demo with Integer parameter")
//	void valueSourceDemoString(String x) {
//		System.out.println("The value of parameter is :" + x);
//	}
//	
//	
//	@Test
//	//@Disabled("In progress")
//	@DisplayName("Substruction Test")
//	void substructionTest() {
//		String result = String.valueOf(calculator.integerSubtraction(8, 2));
//		System.out.println(result + " Result of the substruction");
//	}
//	
//
//
//	@Test
//	void test() {
//	}

}
