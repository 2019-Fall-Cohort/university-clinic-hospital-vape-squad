package hospital;

public class Receptionist extends Employee implements OnThePhone{
int employeeNumber = (getEmployeeNumber()); 
	public Receptionist(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public boolean receptionistOnThePhone(boolean onThePhone) {
		if (onThePhone) {
			return true;
		}
		return false; 
		
	}

	@Override
	public void onThePhone() {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
