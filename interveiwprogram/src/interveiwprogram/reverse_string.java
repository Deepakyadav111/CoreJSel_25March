package interveiwprogram;

public class reverse_string {

	public static void main(String[] args) {
		
		String a="My name is Deepak yadav";
		String b="";
		int c=a.length();
		for(int i=c-1;i>=0;i--)
		{
         b=b+a.charAt(i);
     	
		}
		System.out.println("Reverse of the String is " +b);
	}
}
