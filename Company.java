package emp_practice;

import java.util.Scanner;

public class Company {
	String sCompanyName;
	String sAddress;
	int iNoOfEmployees;

	void com(IBM emp1) {
		Employee e = new Employee();
		emp1.appoints(e);
		emp1.checkContactNo(e);
		emp1.display(e);
	}

	void com(TCS emp1) {
		Employee e = new Employee();
		emp1.appoints(e);
		emp1.checkContactNo(e);
		emp1.display(e);
	}

	Scanner scan = new Scanner(System.in);

	public void start(IBM com1, TCS com2) {
		int i, ch;
		String choice = "NULL";
		i = 1;
		Employee e = new Employee();
		while (i == 1) {
			System.out.println("select company");
			System.out.println("1.IBM");
			System.out.println("2.TCS");
			ch = scan.nextInt();
			if (ch == 1) {
				choice = "IBM";
			} else if (ch == 2) {
				choice = "TCS";
			}
			switch (choice) {
			case "IBM":
				int option;
				System.out.println("1.appoint\n2.display");
				option = scan.nextInt();

				switch (option) {
				case 1:
					com1.appoints(e);
					com1.checkContactNo(e);
					break;
				case 2:
					com1.display(e);
					break;
				}
				break;
			case "TCS":
				System.out.println("1.appoint\n2.display");
				option = scan.nextInt();
				switch (option) {
				case 1:
					com2.appoints(e);
					com2.checkContactNo(e);
					break;
				case 2:
					com2.display(e);
					break;
				}
				break;
			}
			
			System.out.println("press 1 to continue \n press 0 to exit");
			i=scan.nextInt();
		}
	}

}
