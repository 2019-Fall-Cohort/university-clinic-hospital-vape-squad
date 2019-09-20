package hospital;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

import hospital.Employee;

public class EmployeeTest {
	
	Employee underTest = new Employee("Test Person");

	@Test
	public void staffShouldHaveName() throws Exception {
		Employee underTest = new Employee("Test Person");
		String result = underTest.getName();
		assertThat(result, is("Test Person"));
	
	}
	
	@Test 
	public void hasEmployeeBeenPaid() {
	boolean result = underTest.hasBeenPaid();
	assertThat(result, is(true));
}
	
}
