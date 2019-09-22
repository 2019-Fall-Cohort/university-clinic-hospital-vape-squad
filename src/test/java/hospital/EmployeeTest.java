package hospital;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.is;

import java.util.Collection;
import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;

import hospital.Employee;

public class EmployeeTest {
	
	Employee underTest = new Employee("Test Person");

	@Test
	public void staffShouldHaveName() throws Exception {
		Employee underTest = new Employee("Test Person");
		String result = underTest.getName();
		assertThat(result, is("Test Person"));
	
	}
	
	@Test
	public void shouldBeAbleToAddDifferentTypesOfEmployees() {
		Employee underTestDoctor = new Doctor("TestDoctor");
		Employee underTestNurse = new Nurse("TestNurse");
		Employee underTestJanitor = new Janitor("TestJanitor");
		Employee underTestReceptionist = new Receptionist("TestReceptionist");
		Employee underTestCave = new Employee();
		underTestCave.addSpecialistToEmployee(underTestDoctor);
		underTestCave.addSpecialistToEmployee(underTestNurse);
		underTestCave.addSpecialistToEmployee(underTestJanitor);
		underTestCave.addSpecialistToEmployee(underTestReceptionist);

		Collection<Employee> addedEmployees = underTestCave.retrieveEmployeeList();
		assertThat(addedEmployees, containsInAnyOrder(underTestDoctor, underTestNurse,underTestJanitor, underTestReceptionist));
	}
	
//	@Test
//	public void shouldBeAbleToAddEmployees() {
//		Employee underTestReceptionist = new Receptionist("TestReceptionist");
//		Employee underTestJanitor = new Janitor("TestJanitor");
//		Employee underTestDoctor = new Doctor("TestDoctor");
//		Employee underTestNurse = new Nurse("TestNurse");
//
//		Employee underTestCave = new Employee();
//		underTestCave.addPetToShelter(underTestJanitor);
//		underTestCave.addPetToShelter(underTestReceptionist);
//		Collection<Dragon> addedPets = underTestCave.retrievePetList();
//		assertThat(addedPets, containsInAnyOrder(underTestFireRobotic, underTestOrganic));
//	}
	
	@Test 
	public void hasEmployeeBeenPaid() {
	boolean result = underTest.hasBeenPaid(true);
	assertThat(result, is(true));
}
	@Before 
	public void setUp() {
		employeeList = new HashMap<>(); 
	}
	
}
