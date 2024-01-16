package staticpoly;

public class Calculator
{
public void sum(int a,int b)
{
	int c;
	c=a+b;
	System.out.println("Sum result is "+c);
}
	public int sum(int a1,int a2,int a3)   //here count is not equal so it will work  or overload 
	{
		int d;
		d=a1+a2+a3;
		System.out.println("Sum result is "+d);
		return d;
	}
	public static void main(String[] args) 
	{
	Calculator ob=new Calculator();
	ob.sum(10,3);
	ob.sum(10,30,9);
	}
	
}
