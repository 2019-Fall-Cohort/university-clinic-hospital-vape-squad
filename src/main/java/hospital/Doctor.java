package hospital;

public class Doctor extends Employee{
int employeeNumber = (getEmployeeNumber()); 
	//static Doctor doctorName;
	int doctorSalary = 90000;
	Doctor doctorSpecialty;
	Doctor specialty;
	
	
	
	public Doctor(String name) {
		super(name);
		
	}

	private int getEmployeeNumber() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getDoctorSalary() {
		return doctorSalary;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

}
