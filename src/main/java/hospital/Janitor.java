package hospital;

public class Janitor extends Employee implements Sweeping{
int employeeNumber = (getEmployeeNumber()); 
	public Janitor(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	private int getEmployeeNumber() {
		// TODO Auto-generated method stub
		return 0;
	}
	public boolean isSweeping(boolean sweeping) {
		if (sweeping) {
			return true;
		}
		return false;
	}

	@Override
	public void sweeping() {
		// TODO Auto-generated method stub
		
	}

//	public boolean isSweeping(boolean sweeping) {
//		// TODO Auto-generated method stub
//		return false;
//	}

}
