package hospital;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class ReceptionistTest  {
	
	@Test
	public void receptonistShouldBeEmployee() throws Exception {
		Receptionist underTest = new Receptionist("Test Receptionist");
		String result = underTest.getName();
		assertThat(result, is("Test Receptionist"));
	}
	
		@Test
		public void receptionsitShouldAnswerPhone() {
			Receptionist underTest = new Receptionist("Test Receptionist");
			Boolean result = underTest.receptionistOnThePhone();
			
			
			//assertThat(CareProvider, contains(drawBlood));
		}

}
