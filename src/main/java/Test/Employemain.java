package Test;

public class Employemain {

	public static void main(String[] args) {
		Employee emp= new Employee();
		emp.emp_id=101;
		emp.emp_name="Varsha";
		emp.job= "MAnager";
		emp.sal=6000;
		
		emp.display();
		
		Employee emp1= new Employee();
		emp1.emp_id=102;
		emp1.emp_name="arsha";
		emp1.job= "Anager";
		emp1.sal=16000;
		emp1.display();
		

	}

}
