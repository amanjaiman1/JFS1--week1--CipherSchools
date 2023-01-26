public class ConstructorEmployee {
	
	int employeeId;
	int salary;
	String dept;
	
	ConstructorEmployee(int empId,int sal,String dep){
		 employeeId = empId;
		 salary = sal;
		 dept = dep;
	}
	public static void main(String[] args) {
		
		ConstructorEmployee rahul = new ConstructorEmployee(101,3000,"CSE");
		
		System.out.println(rahul.employeeId+" Salary "+rahul.salary+" Dept "+rahul.dept);

	}

}
