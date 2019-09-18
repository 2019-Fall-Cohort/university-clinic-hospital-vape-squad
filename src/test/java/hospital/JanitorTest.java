package hospital;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class JanitorTest {
	
	@Test
	public void janitorShouldBeEmployee() throws Exception {
		Janitor underTest = new Janitor("Test Janitor");
		String result = underTest.getName();
		assertThat(result, is("Test Janitor"));
	}

	@Test
	public void janitorShouldSweep() {
		Janitor underTest = new Janitor("Test Janitor");
		Boolean result = underTest.isSweeping(false);
		assertThat(result, is(false));
			
		}
}
