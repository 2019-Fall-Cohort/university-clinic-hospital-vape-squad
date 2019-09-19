package hospital;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BloodDrawTest {
	Patient undertest;
	
	@Before //Runs this method before each test.
	public void setup() {
		undertest = new Patient("Tim");
	}
	
	@Test
	public void getBloodLevelTest() {
		int expectedBloodLevel = undertest.getBloodLevel();
		assertEquals(expectedBloodLevel, 20); 
	}	
	
	@Test
	public void drawingBloodDecreasesBloodLevel() {
		undertest.canDrawBlood(2);
		int expected = undertest.getBloodLevel();
		assertEquals(expected, 18);
	}

}
