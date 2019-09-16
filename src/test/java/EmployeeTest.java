import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class EmployeeTest {
	
	@Test
	public void staffShouldHaveName() throws Exception {
		Employee underTest = new Employee("Test Person");
		String result = underTest.getName();
		assertThat(result, is("Test Person"));
	
	}
}
