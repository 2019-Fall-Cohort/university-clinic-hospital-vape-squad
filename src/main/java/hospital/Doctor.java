package hospital;

public class Doctor extends Employee{
	
	//static Doctor doctorName;
	int doctorSalary = 90000;
	Doctor doctorSpecialty;
	Doctor specialty;
	
	
	
	public Doctor(String name) {
		super(name);
		
	}

	public int getDoctorSalary() {
		return doctorSalary;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

}
