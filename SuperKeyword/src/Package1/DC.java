package Package1;

public class DC extends DeepakYadav
  {
   public void m3()
   {
	   super.m1();   //parent class method
	   System.out.println("Child Class First Method");
	   super.m2();  //parent class method
	   super.abc=1222;
   }
     public void m4()
     {
    	 System.out.println("Child class second methods");
     }
     public static void main(String[] args) {
		 
    	 DC ob=new DC ();
    	 ob.m3();
    	 
	}
     
   }
