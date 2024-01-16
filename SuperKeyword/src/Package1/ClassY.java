package Package1;

public class ClassY extends ClassX
{
	public ClassY()
	{
	     
		System.out.println("This is child default Constuctor ");
	}
	
	public ClassY (int m)
	{
    
		System.out.println("This is one parametrized child Constuctor ");
	}
	
	public ClassY (int a,int b)
	{
        //super(122,2224);
		System.out.println("This is two parameterized child Constuctor ");
	}
	public static void main(String[] args)
	
	{
	ClassY ab=new ClassY(12,21);	
	}
	
}
