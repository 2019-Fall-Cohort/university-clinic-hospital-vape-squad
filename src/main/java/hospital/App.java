package hospital;

import java.util.Scanner;

public class App {
	public static void main (String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Welcome to the University Clinic Hospital " + 
		"patient and employee portal\n" + "From this portal you can " +
				"admit or check on patients, \nand review and interact " +
		"with Hospital employees");
		System.out.print("Would you like to access the [P]atient portal\n"+
		"or the [E]mployee portal?\n>");
		
		String patientOrEmployee = userInput.nextLine();
		if (patientOrEmployee.equals("P")) {
			System.out.println("Patient");
		
		}else if (patientOrEmployee.equals("E")) {
			System.out.println("Employee");
		}
		
	}
	
	public static void patientMenu() {
		System.out.println("Welcome to the Patient Portal");
		System.out.println("[A]dmit a new patient");
		System.out.println("[V]iew a patient's health or blood level");
		System.out.println("[D]ischarge a patient");
		
	}
	
	public static void employeeMenu() {
		
	}

}
