package interveiwprogram;

import java.util.Scanner;

public class Reverse_number {

	public static void main(String[] args) {
		System.out.println("Please Enter Number");
		Scanner s=new Scanner(System.in);
		int number=s.nextInt();
		int oldnumber=number;
		int reverse=0;
		while(number>0)
		{
        int r=number%10;
        reverse=reverse*10+r;
        number=number/10;
		}
        System.out.println(reverse +" is Reverse of the given number  ");
    		if (oldnumber==reverse)
        	{
        		System.out.println("Number is Palindrome ");
        	}
    	    else 
    	     {
    			System.out.println("number is not palindrome");
    	     }
	}
}
	