package Package;

public class Bodmas {
	public int sum (int n1, int n2)
	{
	int n;
	n=n1+n2;
	System.out.println("The sum is "+n);
	return n;
	}
	public int subs(int a1,int a2)
	{
	int a;
	a=a1-a2;
	System.out.println("The substraction is "+a);
	return a;		
	}
    public int multi(int x1,int x2 )
    {
    int x;
    x=x1*x2;
    System.out.println("The Multiplication is  "+x);
    return x;
    }
    public void div(int d1,int d2)
    {
    	int d;
    	d=d1/d2;
    //System.out.println("The Final result  of (((((10+2)+2)-2)*2)/2) is "+d);
    System.out.println("The Final result  of (((((10*2)-2)+2)-2)/2)  is "+d);
    }
    public static void main(String[] args) {
    	       Bodmas ref_var=new Bodmas();
    	     //   int sumresult=ref_var.sum(10,2);
    	    //   int sumresult1=ref_var.sum(sumresult, 2);
      //  int sustractionresult=ref_var.subs(sumresult1,2);
    // int multiplicationresult=ref_var.multi(sustractionresult,2);
     //       ref_var.div(multiplicationresult,2);
    
    
    int multiplicationresult1=ref_var.multi(10,2);
   int sustractionresult2=ref_var.subs(multiplicationresult1,2);
   int sumresult2=ref_var.sum(sustractionresult2,2);
   int sustractionresult3=ref_var.subs(sumresult2,2);
    ref_var.div(sustractionresult3, 2);
   
	}
}
