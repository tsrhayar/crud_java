package crud;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		ArrayList<Student> StudentList = new ArrayList<Student>();
		ArrayList<Employee> EmployeeList = new ArrayList<Employee>();
		ArrayList<Book> BookList = new ArrayList<Book>();

		String name;
		String email;
		String title = null;
		int age;
		int count = 0;
		int id = count++;
		int salaire;
		int price = 0;

		Student nStudent = new Student(null, 0, null);
		Employee nEmployee = new Employee(null, 0, null, 0);
		Book nBook = new Book(0, null, 0);

		StudentList.add(new Student("Taha Srhayar", 24, "Taha@gmail.com"));
		EmployeeList.add(new Employee("empl1", 34, "empl1@gmail.com", 5000));
		BookList.add(new Book(1, "Book1", 34));

		while (true) {

			System.out.println("La liste d'etudiants" + StudentList);
			System.out.println("La liste d'employée" + EmployeeList);
			System.out.println("La liste des livres" + BookList);

			System.out.println("Taper \n a pour ajouter: \n m pour modifier: \n s pour supprimer:");
			String input = scanner.next();
			String input2;

			switch (input) {

			case "a":

				System.out.println(
						"Taper \n et pour ajouter Etudiant: \n  em pour ajouter Employee: \n  li pour ajouter Livre:");
				input2 = scanner.next();

				switch (input2) {
				case "et":
					System.out.println("Nom d'étudient");
					name = scanner.next();
					System.out.println("Age d'étudient (numéro obligatoire)");
					age = scanner.nextInt();
					System.out.println("Email d'étudient");
					email = scanner.next();

					nStudent = new Student(name, age, email);

					Student.addStudent(nStudent, StudentList);

					System.out.println("Ajouté avec success");
					System.out.println(StudentList);

					break;
				case "em":
					System.out.println("Nom d'employee");
					name = scanner.next();
					System.out.println("Age d'employée (numéro obligatoire)");
					age = scanner.nextInt();
					System.out.println("Email d'employée");
					email = scanner.next();
					System.out.println("Salaire d'employée");
					salaire = scanner.nextInt();

					nEmployee = new Employee(name, age, email, salaire);

					Employee.addEmployee(nEmployee, EmployeeList);

					System.out.println("Ajouté avec success");
					System.out.println(EmployeeList);

					break;

				case "li":
					System.out.println("Titre de livre");
					title = scanner.next();
					System.out.println("Prix de livre (numéro obligatoire)");
					price = scanner.nextInt();

					nBook = new Book(id, title, price);

					Book.addBook(nBook, BookList);

					System.out.println("Ajouté avec success");
					System.out.println(BookList);

					break;
				}

				break;
			case "m":
				System.out.println(
						"Taper \n et pour modifier Etudiant: \n  em pour modifier Employee: \n  li pour modifier Livre:");
				input2 = scanner.next();

				switch (input2) {
				case "et":
					if (StudentList.size() > 0) {

						System.out.println(StudentList);
						System.out.println("Taper id d'étudiant qui vous voulez modifier:");
						id = scanner.nextInt();
						System.out.println("Taper le nouveau nom");
						name = scanner.next();
						System.out.println("Taper le nouveau age");
						age = scanner.nextInt();
						System.out.println("Taper le nouveau email");
						email = scanner.next();

						Student.updateStudent(StudentList, id, name, age, email);

						System.out.println("Modifié avec sucess");
						System.out.println(StudentList);

					} else {
						System.out.println("La liste d'étudiants est vide !");
					}
					break;

				case "em":

					if (EmployeeList.size() > 0) {

						System.out.println(EmployeeList);
						System.out.println("Taper id d'employé qui vous voulez modifier:");
						id = scanner.nextInt();
						System.out.println("Taper le nouveau nom");
						name = scanner.next();
						System.out.println("Taper le nouveau age");
						age = scanner.nextInt();
						System.out.println("Taper le nouveau email");
						email = scanner.next();
						System.out.println("Taper le nouveau salaire");
						salaire = scanner.nextInt();

						Employee.updateEmployee(EmployeeList, id, name, age, email, salaire);

						System.out.println("Modifié avec sucess");
						System.out.println(EmployeeList);

					} else {
						System.out.println("La liste d'employé est vide !");
					}

					break;

				case "li":
					if (BookList.size() > 0) {

						System.out.println(BookList);
						System.out.println("Taper id de livre qui vous voulez modifier:");
						id = scanner.nextInt();
						System.out.println("Taper le nouveau titre");
						name = scanner.next();
						System.out.println("Taper le nouveau prix");
						age = scanner.nextInt();

						Book.updateBook(BookList, id, title, price);

						System.out.println("Modifié avec sucess");
						System.out.println(BookList);

					} else {
						System.out.println("La liste des livres est vide !");
					}
					break;
				}

			case "s":

				System.out.println(
						"Taper \n et pour supprimer Etudiant: \n  em pour supprimer Employee: \n  li pour supprimer Livre:");
				input2 = scanner.next();

				switch (input2) {
				case "et":

					if (StudentList.size() > 0) {

						System.out.println(StudentList);
						System.out.println("Taper id d'étudiant qui vous voulez supprimer:");
						id = scanner.nextInt();

						Student.deleteStudent(StudentList, id);
					} else {
						System.out.println("La liste d'étudiants est vide !");
					}
					break;
				case "em":

					if (EmployeeList.size() > 0) {

						System.out.println(EmployeeList);
						System.out.println("Taper id d'employée qui vous voulez supprimer:");
						id = scanner.nextInt();

						Employee.deleteEmployee(EmployeeList, id);
						System.out.println("Supprimé avec success");
					} else {
						System.out.println("La liste d'employée est vide !");
					}
					break;
					
				case "li":

					if (BookList.size() > 0) {

						System.out.println(BookList);
						System.out.println("Taper id de livre qui vous voulez supprimer:");
						id = scanner.nextInt();

						Book.deleteBook(BookList, id);
					} else {
						System.out.println("La liste des livres est vide !");
					}
					break;
				}

			}

		}

	}

}
