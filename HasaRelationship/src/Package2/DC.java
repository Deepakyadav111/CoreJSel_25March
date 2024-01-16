package Package2;

import Package1.Auto;

	public class DC
	{
		public void methodd()
		{
			System.out.println("I am a Method of DC");
		}
		public static void main(String[] args)
		{
			DC ob=new DC();
			ob.methodd();
	        Auto a=new Auto(); //Has a relationship   
	        a.m1();
	        a.m2();
		}

	}


