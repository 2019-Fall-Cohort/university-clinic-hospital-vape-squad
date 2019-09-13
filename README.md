# University Clinic Hospital

## Module 1 Mastery Project

### Team Members

- Team member
- Team member

### Objective

- Students will employ good software design and testing principles in order to create a class hierarchy using Object Oriented principles (Abstraction, Polymorphism, Inheritance and Encapsulation).
- Students will be able to define **base class**, **derived class**, **abstract**, **virtual**, and **override**.

## The Scenario

University Clinic Hospital is an organizational mess. They have unkempt files of employee information scattered throughout manilla folders, computer data files, and old tin filing cabinets. With the madness of the daily grind, patients are the priority. But the utmost care cannot be given to the patients if the hospital is disorganized. University Clinic Hospital wants to get it together. They have subcontracted We Can Code IT full-stack apprentices (who work for the reasonably inexpensive price of free) to come in and organize. They enable you to set up shop with a few company laptops in an old disheveled break room. Your mission is to create a set of classes that contain information on the employees at University Clinic Hospital:

**University Clinic Hospital has the following model at its facility:**

- `Employee`
  - `PaySalary()` abstract method with no specifications. It pays employee types differently by displaying different messages to the user.
- `Patient`
  - default `BLOOD_LEVEL` of 20
  - default `HEALTH_LEVEL` of 10

**University Clinic Hospital has the following classifications at its facility**

- `Doctor` is a type of Employee and gets paid 90,000
- `Nurse` is a type of Employee and gets paid 50,000
- `Receptionist` is a type of Employee and gets paid 45,000
- `Janitor` is a type of Employee and gets paid 40,000

## The Data

The following **Instance Data** will need to be taken care of for each employee

- `Employee`: Employee Name, Employee Number, Salary, whether or not they have been paid (For example “Phil”, 111, 90000, false)
- `Doctor`: All `Employee` data and Specialty Area (Heart, Brain, Foot, etc…)
- `Nurse`: All `Employee` data and Number of Patients they are taking care of
- `Receptionist`: All `Employee` data and whether they are on the phone or not
- `Janitor`: All `Employee` data and whether they are sweeping or not

The following **Behaviors** will need to be permitted

- You must be able to print out a list of your employees and their attributes.
- You must be able to pay employees. But employees can only be paid once during the session.
- You must be able to choose a medical employee and have them perform a task.
- Only `Doctor` and `Nurse` can draw blood and care for your patient. These actions effect `HEALTH_LEVEL` and `BLOOD_LEVEL` differently for Doctor and Nurse.

### Part 1

Let's get organized. Your team is meeting for the first time at University Clinic Hospital. Programming at this time is out of the question. You need to get a feel for the task at hand. You do not even want to create an algorithm yet.

Diagram the classes you will need for this program. What are the inheritance relationships? How and where does the problem tell you this information?

Hints:

- There must be a Program Class, Employee Class, and Patient Class
- There will be 4 classes derived from the Employee Class
- Think about states and behaviors in regard to what class should do what
- Classes must use appropriate methods in regard to their type
- Some classes will make use of abstract methods and some methods will be overridden where appropriate

### Part 2

Let's prepare a project and a test project where we can test drive information. Get up a git repository for your project and a corresponding one on GitHub.

### Part 3

Start programming. Choose one type of employee to create and test drive that class. Once that is finished, pick another and pull similarities up into a parent class.

### Part 4

Give Stretch Tasks a shot **ONLY** after requirements have been met. Completion of stretch tasks won't give you any extra credit, but, if your attempt breaks a requirement, that will cost you points. I suggest using feature branches to implement Stretch Tasks after requirements are finished.

- Stretch task: Add a tick method that changes `HEALTH_LEVEL`, number of patients Nurse is taking care of, toggles whether Receptionist is on the phone, and toggles whether Janitor is sweeping.
- Stretch task: Some Employees are medical professionals and some are not. How can we group them together as to not duplicate code?
- Stretch task: The hospital, is much like a patient too. Like patients, it has it own needs: Bills, Cleanliness, Guests, and the like. How can we use our staff to make sure the needs of the hospital are met?
- Stretch task: Tina is an `EmergencyDispatcher`. She is a trained medical professional and a first responder. She also has great people skills and can answer calls and manage what ambulance gets sent to a situation. She sometimes joins the crew and responds to calls on the fly. Add her as an employee and give her the proper functionality. This job pays 45,000.
- Stretch task: Through user input, type search for an employee by name and access their info/what they are doing
- Stretch task: add an employee, fire an employee
