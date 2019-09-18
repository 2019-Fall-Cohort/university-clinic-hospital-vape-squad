package hospital;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class PatientTest {
	Patient underTest;
	
	@Before //Runs this method before each test.
	public void setup() {
		underTest = new Patient("Tim");
	}
	@Test
	public void getBloodLevelTest() {
		int expected = underTest.getBloodLevel();
		assertEquals(expected, 20); 
	}	
	
	@Test
	public void drawingBloodDecreasesBloodLevel() {
		underTest.canDrawBlood(2);
		int expected = underTest.getBloodLevel();
		assertEquals(expected, 18);
	}

}
