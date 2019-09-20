package hospital;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;



public class DoctorTest {
	Doctor underTest = new Doctor("Test doctor");	
	@Before //Runs this method before each test.
	public void setup() {
		
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
