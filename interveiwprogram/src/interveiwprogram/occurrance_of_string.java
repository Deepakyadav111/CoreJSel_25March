package interveiwprogram;

public class occurrance_of_string {

	public static void main(String[] args) {
		
		String s="Pooja is my sistero ";
		int count=0;
		for (int i=0;i<s.length();i++)
		{
		if(s.charAt(i)=='o')
		  {
			count++;
		  }
        }
		 System.out.println(count);
 }
}
