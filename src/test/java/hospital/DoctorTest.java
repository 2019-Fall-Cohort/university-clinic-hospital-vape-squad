package hospital;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;



public class DoctorTest {
	Doctor underTest = new Doctor("Test doctor");	
	@Before //Runs this method before each test.
	public void setup() {
		
	}
	
	@Test
	public void doctorShouldBeEmployee() {
		Doctor underTest = new Doctor("Test Doctor");
		String result = underTest.getName();
		assertThat(result, is("Test Doctor"));
	}
	
	@Test
	public void getDoctorSalaryTest() {
		int expected = underTest.getDoctorSalary();
		assertEquals(expected, 90000); 
	}
	
	
//	@Test
//	public void getDoctorName(Employee name) {
//		
//	}

}
