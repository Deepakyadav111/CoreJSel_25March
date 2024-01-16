package Package1;

public class ClassX 
{
	public ClassX ()
{
     
	System.out.println("This is default Constuctor ");
	}
	
	public ClassX (int m)
	{
    
		System.out.println("This is one parametrized  Constuctor ");
	}
	
	public ClassX (int a,int b)
	{

		System.out.println("This is two parameterized Constuctor ");
	}
	public ClassX (int a,int b,int c)
	{

		System.out.println("This is three parameterized Constuctor ");
	}

	public static void main(String[] args) {
		
		ClassX  abc=new ClassX (22);
   
	
	
	}

}
	


