package hospital;

public class Nurse extends Employee{
int emoloyeeNumber = (getEmployeeNumber());
	public Nurse(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	int nurseSalary = 50000;

	public int getNurseSalary() {
		return nurseSalary;
	}

}
