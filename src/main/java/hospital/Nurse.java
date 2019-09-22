package hospital;

public class Nurse extends Employee{
int emoloyeeNumber = (getEmployeeNumber());
	public Nurse(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	private int getEmployeeNumber() {
		// TODO Auto-generated method stub
		return 0;
	}

	int nurseSalary = 50000;

	public int getNurseSalary() {
		return nurseSalary;
	}

}
