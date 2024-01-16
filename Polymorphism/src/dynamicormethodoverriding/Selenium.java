package dynamicormethodoverriding;

public class Selenium extends Automation
{
	public void Calculation(int a1,int a2)
	{
		int r;
		r=a1-a2;
		System.out.println("Substra tion result is "+r);
		
	}
	
public static void main(String[] args) 
{
Selenium ob=new Selenium();
ob.Calculation(12,11);
}

}
