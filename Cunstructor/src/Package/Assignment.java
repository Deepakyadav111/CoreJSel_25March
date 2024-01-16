package Package;

public class Assignment {
	
	public Assignment()
	{
        this(7,8,9);
		System.out.println("This is default Constuctor ");
	}
	
	public Assignment(int m)
	{
    
		System.out.println("This is one parametrized  Constuctor ");
	}
	
	public Assignment(int a,int b)
	{

		System.out.println("This is two parameterized Constuctor ");
	}
	public Assignment(int a,int b,int c)
	{

		System.out.println("This is three parameterized Constuctor ");
	}
	
	public Assignment(int a,int b,int c,int d)
	{
	         this (2,56);
		System.out.println("This is four parameterized Constuctor ");
	}
	public static void main(String[] args) {
		
	Assignment abc=new Assignment(22);
   
	
	
	}

}
