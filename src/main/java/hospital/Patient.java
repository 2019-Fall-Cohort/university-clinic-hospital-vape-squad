package hospital;

import java.util.ArrayList;

import org.junit.Before;





public class Patient {
	int bloodLevel = 20;
	int healthLevel = 10;
	private String name;

	public Patient(String string) {
		this.name = name;
	}

	public int getBloodLevel() {
		// TODO Auto-generated method stub
		return bloodLevel;
	}

	public int canDrawBlood(int drawBlood) {
		bloodLevel = bloodLevel - drawBlood;
		// TODO Auto-generated method stub
		return bloodLevel;
	}

	public int getHealthLevel() {
		// TODO Auto-generated method stub
		return healthLevel;
	}
	
	
	

	

}
