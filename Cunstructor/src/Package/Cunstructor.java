package Package;

public class Cunstructor {
	
	public Cunstructor()
	
	{
	System.out.println("This Default Constructor");
	}
	
	public Cunstructor(int a)
	{	
		this(3,5);
		System.out.println("This is one Prameterized Cunstrutor");
	}
	public Cunstructor(int a,int b)
	{	
		System.out.println("This is two Prameterized Cunstrutor");
	}
	public static void main(String[] args) {
		
		Cunstructor obc=new Cunstructor();
	//	Cunstructor xyz=new Cunstructor(22);
		//Cunstructor abc=new Cunstructor(225,121);
		

	}

}