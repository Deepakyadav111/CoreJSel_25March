package Learndebugging;

public class Deepak {

	int abc;
	public void method1()
	{
		System.out.println("First line of Method");
		System.out.println("Second Line of Method");
	}
	public void Method2()
	{
		System.out.println("Third Line of Method");
		System.out.println("Fourth Line of Method");
		int a=10/0;
	}
	public static void main(String[] args) 
	{
		System.out.println("first line of Method");
        Deepak ob=new Deepak();
    	System.out.println("Second Line of Method");
    	ob.method1();
    	System.out.println("Third Line of Method");
    	ob.Method2();
    	System.out.println("Final Line of Code");
    	
	} 

}
