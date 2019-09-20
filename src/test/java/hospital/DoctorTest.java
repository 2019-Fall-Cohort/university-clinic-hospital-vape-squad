package hospital;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class DoctorTest {
	Doctor underTest;
	
	@Before //Runs this method before each test.
	public void setup() {
		underTest = new Doctor();
	}
	
	@Test
	public void getDoctorSalaryTest() {
		int expected = underTest.getDoctorSalary();
		assertEquals(expected, 90000); 
	}
	
	@Test
	public void getDoctorName(Employee name) {
		
	}

}
