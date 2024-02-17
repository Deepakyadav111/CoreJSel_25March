package interveiwprogram;

public class Star_pattern3 {

	public static void main(String[] args) {
		
		for(int i=0;i<5;i=i+1)
	      {
		   for(int j=5-i;j>1;j=j-1)
		    {
			   System.out.print(" ");
		    }
			   for(int j=0;j<=i;j=j+1) 
			   {
		    	System.out.print("* ");
		    }	
		      System.out.println();
      }

	}

}

