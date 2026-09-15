
public class Program {

	public static void main(String[] args) {

		// why employee array-> bcoz we want to store manage,engineer,salespersin in the
		// same array
		Employee[] employees = new Employee[100];
		int count = 0; // we need to know how many employees have been actually added
		int currentIndex = 0;

		int choice;
		do {
			System.out.println("\n===== Employee Management System =====");
			System.out.println("1. Add an Employee");
			System.out.println("2. Display");
			System.out.println("3. Sort");
			System.out.println("4. Save to File");
			System.out.println("5. Load from File");
			System.out.println("6. Exit");

			System.out.println("Enter your choice:");
			choice = ConsoleInput.getInt();

			switch (choice) {

			case 1:
				// Add Employee
				char addChoice;
				do {
					System.out.println("\n--- Add Employee ---");
					System.out.println("a. Manager");
					System.out.println("b. Engineer");
					System.out.println("c. Sales Person");
					System.out.println("d. Exit to Main Menu");

					System.out.println("Enter your choice:");
					addChoice = ConsoleInput.getString().charAt(0);

					switch (addChoice) {

					case 'a':
						// Add Manager
						System.out.println("Enetr Name: ");
						String n = ConsoleInput.getString();

						System.out.println("Enter Address");
						String a = ConsoleInput.getString();

						System.out.println("Enetr age");
						int ag = ConsoleInput.getInt();

						System.out.println("Enetr Gender");
						String g = ConsoleInput.getString();

						System.out.println("Enetr Basic Salary");
						float salary = ConsoleInput.getFloat();

						System.out.println("Enter HRF:");
						float h = ConsoleInput.getFloat();

						Manager m = new Manager(n, a, ag, g, salary, h);

						employees[count] = m;
						count++;

						System.out.println("Manager added successfully.");

						break;

					case 'b':
						// Add Engineer
						System.out.println("Enter Name:");
						String n1 = ConsoleInput.getString();

						System.out.println("Enter Address:");
						String a1 = ConsoleInput.getString();

						System.out.println("Enter Age:");
						int ag1 = ConsoleInput.getInt();

						System.out.println("Enter Gender:");
						String g1 = ConsoleInput.getString();

						System.out.println("Enter Basic Salary:");
						float salary1 = ConsoleInput.getFloat();

						System.out.println("Enter Overtime:");
						float ot1 = ConsoleInput.getFloat();

						Engineer e = new Engineer(n1, a1, ag1, g1, salary1, ot1);

						employees[count] = e;
						count++;

						System.out.println("Engineer added successfully.");

						break;

					case 'c':
						// Add Sales Person
						System.out.println("Enter Name:");
						String n2 = ConsoleInput.getString();

						System.out.println("Enter Address:");
						String a2 = ConsoleInput.getString();

						System.out.println("Enter Age:");
						int ag2 = ConsoleInput.getInt();

						System.out.println("Enter Gender:");
						String g2 = ConsoleInput.getString();

						System.out.println("Enter Basic Salary:");
						float salary2 = ConsoleInput.getFloat();

						System.out.println("Enter Commission:");
						float c2 = ConsoleInput.getFloat();

						SalesPerson s = new SalesPerson(n2, a2, ag2, g2, salary2, c2);

						employees[count] = s;
						count++;

						System.out.println("Sales Person added successfully.");
						break;

					case 'd':
						System.out.println("Returning to Main Menu...");
						break;

					default:
						System.out.println("Invalid choice");
					}
				} while (addChoice != 'd');

				break;

			case 2:
				// Display 
				char displayChoice;

				do {
					System.out.println("\n--- Display ---");
					System.out.println("a. All Employees");
					System.out.println("b. First Employee");
					System.out.println("c. Next Employee");
					System.out.println("d. Previous Employee");
					System.out.println("e. Last Employee");
					System.out.println("f. Exit to Main Menu");

					System.out.println("Enter your choice:");
					displayChoice = ConsoleInput.getString().charAt(0);

					switch (displayChoice) {

					case 'a':
						// All Employees
						for (int i = 0; i < count; i++) {
							employees[i].display();
							System.out.println();
						}
						break;

					case 'b':
						// First Employee
						if (count > 0) {
							employees[0].display();
						} else {
							System.out.println("No employees available.");
						}
						break;

					case 'c':
						// Next Employee
						if (count == 0) {
							System.out.println("No employees available.");
						} else if (currentIndex < count - 1) {
							currentIndex++;
							employees[currentIndex].display();
						} else {
							System.out.println("Already at the last employee.");
						}
						break;

					case 'd':
						// Previous Employee
						if (count == 0) {
							System.out.println("No employees available.");
						} else if (currentIndex > 0) {
							currentIndex--;
							employees[currentIndex].display();
						} else {
							System.out.println("Already at the first employee.");
						}
						break;

					case 'e':
						// Last Employee
						if (count > 0) {
							currentIndex = count - 1;
							employees[currentIndex].display();
						} else {
							System.out.println("No employees available.");
						}
						break;

					case 'f':
						System.out.println("Returning to Main Menu...");
						break;

					default:
						System.out.println("Invalid choice");
					}

				} while (displayChoice != 'f');
				break;

			case 3:
				// Sort
				char sortChoice;

				do {
					System.out.println("\n--- Sort ---");
					System.out.println("a. All Managers");
					System.out.println("b. All Engineers");
					System.out.println("c. All Sales Person");
					System.out.println("d. All Employees Alphabetic order ascending");
					System.out.println("e. All Employees Alphabetic order descending");
					System.out.println("f. Exit to Main Menu");

					System.out.println("Enter your choice:");
					sortChoice = ConsoleInput.getString().charAt(0);

					switch (sortChoice) {

					case 'a':
						// All Managers
						for (int i = 0; i < count; i++) {
							if (employees[i] instanceof Manager) {
								employees[i].display();
								System.out.println();
							}
						}
						break;

					case 'b':
						// All Engineers
						for (int i = 0; i < count; i++) {
							if (employees[i] instanceof Engineer) {
								employees[i].display();
								System.out.println();
							}
						}

						break;

					case 'c':
						// All Sales Person
						for (int i = 0; i < count; i++) {
							if (employees[i] instanceof SalesPerson) {
								employees[i].display();
								System.out.println();
							}
						}
						break;

					case 'd':
						// Alphabetic ascending
						for (int i = 0; i < count - 1; i++) {
							for (int j = i + 1; j < count; j++) {
								if (employees[i].getName().compareTo(employees[j].getName()) > 0) {
									Employee temp = employees[i];
									employees[i] = employees[j];
									employees[j] = temp;
								}
							}
						}
						for (int i = 0; i < count; i++) {
							employees[i].display();
							System.out.println();
						}
						break;

					case 'e':
						// Alphabetic descending
						for (int i = 0; i < count - 1; i++) {
							for (int j = i + 1; j < count; j++) {
								if (employees[i].getName().compareTo(employees[j].getName()) < 0) {
									Employee temp = employees[i];
									employees[i] = employees[j];
									employees[j] = temp;
								}
							}
						}
						for (int i = 0; i < count; i++) {
							employees[i].display();
							System.out.println();
						}
						break;

					case 'f':
						System.out.println("Returning to Main Menu...");
						break;

					default:
						System.out.println("Invalid choice");
					}

				} while (sortChoice != 'f');
				break;

			case 4:
				// Save to File
				break;

			case 5:
				// Load from File
				break;

			case 6:
				System.out.println("Exiting...");
				break;

			default:
				System.out.println("Invalid choice");
			}
		} while (choice != 6);
	}

}
