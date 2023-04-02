package Package;

public class Student {

int a;
	
	public void Deepak()
	{
		
		System.out.println("Welcome to java");
	}

	public static void main(String[] args) {
		
		Student ref_var = new Student();
		ref_var.Deepak();
		ref_var.a=22;
		System.out.println("The roll number of Student Is " +( ref_var.a) );
}
}