package Oops1;

public class Ram extends Dashrath
{
     public void method2 ()
     {
    	 System.out.println("I am Child of Dashrath-Ram");
     }
	public static void main(String[] args)
	{
		Ram ob=new Ram();
		ob.method2();
		ob.method1();
		ob.a=12;
		System.out.println(ob.a);
	}

}
