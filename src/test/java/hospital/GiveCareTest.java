package hospital;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class GiveCareTest {
	Patient undertest;
	
	@Before //Runs this method before each test.
	public void setup() {
		undertest = new Patient("Tim");
	}
	
	@Test
	public void getHealthLevelTest() {
		int expectedHealthLevel = undertest.getHealthLevel();
		assertEquals(expectedHealthLevel, 10); 
	}	

}


