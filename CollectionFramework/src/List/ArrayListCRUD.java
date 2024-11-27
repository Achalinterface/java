package List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Employee {
	private String name;
	private int age;

	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [name= " + name + ", age= " + age + "]";
	}

}

public class ArrayListCRUD {
	public static void main(String[] args) {
		List<Employee> employee = new ArrayList<Employee>();

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("Employee CRUD");
			System.out.println("1. Add Employee");
			System.out.println("2. Display");
			System.out.println("3. Update");
			System.out.println("4. Delete");
			System.out.println("5. Exit");
			System.out.println("Enter your choice");

			int choice = scanner.nextInt();

			switch (choice) {
			case 1: {
				System.out.println("Enter Employee Name");
				String name = scanner.next();
				System.out.println("Enter Employee Age");
				int age = scanner.nextInt();

				employee.add(new Employee(name, age));
				System.out.println("Employee added successfully!");
				break;
			}
			case 2: {
				if (employee.isEmpty()) {
					System.out.println("Employee list is empty");
				} else {
					System.out.println("Employee List");
					for (Employee emp : employee) {
						System.out.println(emp);
					}
				}
				break;
			}
			case 3: {
				if (employee.isEmpty()) {
					System.out.println("Employee list is empty");
				} else {
					System.out.println("Enter the index number of employee to update: ");
					int index = scanner.nextInt();
					scanner.nextLine();

					if (index >= 0 && index < employee.size()) {
						System.out.println("Enter new name");
						String newname = scanner.nextLine();
						System.out.println("Enter new age");
						int newage = scanner.nextInt();

						employee.get(index).setName(newname);
						employee.get(index).setAge(newage);
						System.out.println("Employee update successfully!");
					} else {
						System.out.println("invalid index");
					}
				}
				break;
			}
			case 4: {
				if (employee.isEmpty()) {
					System.out.println("Employee list is empty");
				} else {
					System.out.println("Enter the index of the employee to delete: ");
					int delete = scanner.nextInt();
					scanner.nextLine();

					if (delete >= 0 && delete < employee.size()) {
						employee.remove(delete);
						System.out.println("Employee deleted successfully!");
					} else {
						System.out.println("Invalid index");
					}
				}
				break;
			}
			case 5: {
				System.out.println("Exiting...");
				scanner.close();
				System.exit(0);
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}
		}

	}
}
