import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HelloTest {

	@Test
	void testAddNumbers() {
		//fail("Not yet implemented");
		Hello hello = new Hello();
		assertEquals(hello.addNumbers(10, 20),30);
	}

	@Test
	void testSubtractNumbers() {
		//fail("Not yet implemented");
		Hello hello = new Hello();
		assertEquals(hello.subtractNumbers(20, 10),10);
	}

	@Test
	void testMultipleNumbers() {
		//fail("Not yet implemented");
		Hello hello = new Hello();
		assertEquals(hello.multipleNumbers(20, 10),200);
	}

	@Test
	void testDivisionNumbers() {
		//fail("Not yet implemented");
		Hello hello = new Hello();
		assertEquals(hello.divisionNumbers(20, 10),2);
	}

}
