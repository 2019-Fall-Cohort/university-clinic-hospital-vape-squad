package hospital;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class NurseTest {
	Nurse underTest;

	@Before 
	public void setup() {
		underTest = new Nurse();
	}
	
	@Test
	public void getNurseSalaryTest() {
		int expected = underTest.getNurseSalary();
		assertEquals(expected, 50000); 
	}

}
