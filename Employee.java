package emp_practice;

import java.util.Scanner;

public class Employee {

	protected static int counter;
	protected int iEmpID;
	protected String sEmpName,sDesignation,sAddress;
	protected double dSalary;
	protected int iYearOfJoining;
	protected long lContactno;
	Scanner scan =new Scanner(System.in);

	protected int readEmpID() {
		return ++counter;
	}
}
