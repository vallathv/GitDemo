package Test1;

public class Student {
	
	int sid ;
	String sname;
	char grade;
	
	
	void print() {
		
		
		System.out.println(sid + " " +sname + " " + grade);
	}
	
void setStudentDats(String name , int id , char gr) {
	
	sid =id;
	sname =name;
	grade=gr;
	System.out.println(sid + " " +sname + " " + grade);
	
}


// constructor 
public Student(String name , int id , char gr) {
	sid =id;
	sname =name;
	grade=gr;
	
	
}

}
