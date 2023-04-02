
package Package;

public class Student2 {
	
	int age, rollno;
	
	public void display1()
	{
		System.out.println("Welcome to all of you");
	}
    public void display2()
    {
    	
    System.out.println("Automayion is very easy ");
    }
    
	public static void main(String[] args) {
		
		Student2 ref_var=new Student2();
		ref_var.display1();
		ref_var.display2();
		System.out.println("The age of the Student is "+(ref_var.age=20));
		System.out.println("The roll number of the student is "+(ref_var.rollno=51));
	

	}

}
