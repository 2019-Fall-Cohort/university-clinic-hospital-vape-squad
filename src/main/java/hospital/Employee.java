package hospital;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class Employee {

	private String name;

	
	
	HashMap<String, Employee> employeeList;
//ArrayList<String> listOfEmployees = new ArrayList<String>(); 
//		listofemployees[1] = "Sam";
//		
	public Employee(String name) {
		employeeList = new HashMap<>();
	}
	
	public void addEmployeeToEmployeeList(Employee employeeToAdd) {
		employeeList.put(employeeToAdd.getName(), employeeToAdd);
	
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}



	public String getName() {
		//this.name = name;
		return "Test Person";
	}
	public boolean hasBeenPaid(boolean receivedPay) {
		if (receivedPay) {
			return true;
		}
		return false;
	}



	public void addSpecialistToEmployee(Employee underTestDoctor) {
		// TODO Auto-generated method stub
		
	}



	public Collection<Employee> retrieveEmployeeList() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
