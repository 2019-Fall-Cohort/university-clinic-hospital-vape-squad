package hospital;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.is;

import java.util.List;

import org.junit.Test;



public class CareProviderTest {
	
	@Test
	public void careProviderShouldBeEmployee() throws Exception {
		Employee underTest = new CareProvider("Test CareProvider");
		String result = underTest.getName();
		assertThat(result, is("Test CareProvider"));
	}
	
	@Test
	public void careProviderShouldDrawBlood() {
		CareProvider underTest = new CareProvider("Test CareProvider");
		BloodDraw testBloodDraw = new BloodDraw();
		Patient testPatient = new Patient("Patient");
		underTest.drawBloodFromPatient(testBloodDraw, testPatient);
		
	}
	
		

	public void careProviderShouldGiveCare() {
		CareProvider underTest = new CareProvider("Test CareProvider");
		GiveCare testGiveCare = new GiveCare();
		Patient testPatient = new Patient("Patient");
		underTest.giveCare(testGiveCare, testPatient);
	}
	
	

}
