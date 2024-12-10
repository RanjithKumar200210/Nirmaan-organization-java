package day14;

import java.util.Scanner;

public class SingleEmploymentManagement {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		Employee emp1 = null;
		boolean isTrue = true;
		while (isTrue) {
			System.out.println("1 for add");
			System.out.println("2 for update");
			System.out.println("3 for show");
			System.out.println("0 for exit");
			int key = scan.nextInt();
			scan.nextLine();

			switch (key) {
			case 1: {
				System.out.println("enter your name");
				String Name = scan.nextLine();

				System.out.println("enter your id");
				int id = scan.nextInt();

				System.out.println("enter your pHNUMBER");
				long phNumber = scan.nextLong();

				System.out.println("enter your department");
				String department = scan.next();
				emp1 = new Employee(Name, id, phNumber, department);
				break;

			}
			case 2: {
				System.out.println("enter your name");
				String Name = scan.nextLine();
				emp1.setName(Name);
				System.out.println("enter your id");
				int id = scan.nextInt();
				emp1.setId(id);
				System.out.println("enter your pHNUMBER");
				long phNumber = scan.nextLong();
				emp1.setPhNumber(phNumber);
				scan.nextLine();
				System.out.println("enter your department");
				String department = scan.next();
				emp1.setDepartment(department);

				System.out.println("updated");
				break;
			}
			case 3: {
				System.out.println(emp1);
				break;
			}
			case 0: {
				isTrue = false;
				System.out.println("THANK YOU");

			}
			}
		}
	}
}
