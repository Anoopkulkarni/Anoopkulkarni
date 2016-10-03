package emp_practice;
public class TCS extends Company implements Display, Appoints {

	TCS(String sCName, String Address, int iNoOfEmp) {
		sCompanyName = sCName;
		sAddress = Address;
		iNoOfEmployees = iNoOfEmp;
	}

	public void appoints(Employee e) {

		e.iEmpID = e.readEmpID();
		System.out.println("enter Employee name:");
		e.sEmpName = e.scan.next();
		System.out.println("enter contact no");
		e.lContactno = e.scan.nextLong();
		System.out.println("enter salary amount");
		e.dSalary = e.scan.nextDouble();

	}

	public void display(Employee e) {
		System.out.println("company name : " + sCompanyName + "\n Address : "
				+ sAddress);
		System.out.println("no of employees in " + sCompanyName + " : "
				+ iNoOfEmployees + "\n\n");
		System.out.println("Employee details:");
		System.out.println("Name : " + e.sEmpName);
		if(checkContactNo(e)==true){
			System.out.println("Contact no : " +e.lContactno);
		}else {
				System.out.println("Contact no : " +e.lContactno+"\n improper contact no");
		}
	}

	public boolean checkContactNo(Employee e) {
		if (e.lContactno > 6999999999l && e.lContactno <= 9999999999l) {
			return true;
		} else {
			return false;
		}
	}

}
