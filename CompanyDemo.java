package emp_practice;

public class CompanyDemo {

	public static void main(String[] args) {
		Company com=new Company();
		IBM com1= new IBM("Abc", "Hubballi", 50);
		TCS com2= new TCS("xyz", "Mumbai", 200);
		com.start(com1,com2);
	}
}
