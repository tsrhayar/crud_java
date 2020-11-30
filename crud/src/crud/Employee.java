package crud;

import java.util.ArrayList;

public class Employee extends Person {

	private static int count = 0;
	private int id;
	private int salaire;

	public Employee(String name, int age, String email, int salaire) {
		super(name, age, email);

		this.id = count++;
		this.salaire = salaire;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTelephone() {
		return salaire;
	}

	public void setSalaire(int salaire) {
		this.salaire = salaire;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + " ," + super.toString() + " ," + "salaire = "+ this.salaire + "]";
	}
	
	// add employee
	public static void addEmployee(Employee employee, ArrayList<Employee> EmployeeList) {
		EmployeeList.add(employee);
	}

	// update employee
	public static void updateEmployee(ArrayList<Employee> EmployeeList, int id, String name, int age, String email, int salaire) {
		for (int i = 0; i < EmployeeList.size(); i++) {
			if (id == EmployeeList.get(i).getId()) {
				EmployeeList.get(i).setId(id);
				EmployeeList.get(i).setName(name);
				EmployeeList.get(i).setAge(age);
				EmployeeList.get(i).setEmail(email);
				EmployeeList.get(i).setSalaire(salaire);
			}
		}
	}
	
	
	// delete Employee
		public static void deleteEmployee(ArrayList<Employee> EmployeeList,int id) {
			for (int i = 0; i < EmployeeList.size(); i++) {
				if (id == EmployeeList.get(i).getId()) {
					EmployeeList.remove(i);
				}
			}
		}
}
