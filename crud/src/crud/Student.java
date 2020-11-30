package crud;

import java.util.ArrayList;

public class Student extends Person {

	private static int count = 0;
	private int id;

	// public Student() {}

	public Student(String name, int age, String email) {
		super(name, age, email);

		this.id = count++;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + " ," + super.toString() + "]";
	}

	// add Student
	public static void addStudent(Student student, ArrayList<Student> StudentList) {
		StudentList.add(student);
	}

	// update Student
	public static void updateStudent(ArrayList<Student> StudentList, int id, String name, int age, String email) {
		for (int i = 0; i < StudentList.size(); i++) {
			if (id == StudentList.get(i).getId()) {
				StudentList.get(i).setId(id);
				StudentList.get(i).setName(name);
				StudentList.get(i).setAge(age);
				StudentList.get(i).setEmail(email);
			}
		}
	}

	// delete Student
	public static void deleteStudent(ArrayList<Student> StudentList,int id) {
		for (int i = 0; i < StudentList.size(); i++) {
			if (id == StudentList.get(i).getId()) {
				StudentList.remove(i);
			}
		}
	}
}
