package Scannerpackage;

import java.util.Scanner;

public class Nestedifelse {

	public static void main(String[] args) {
	
		System.out.println("Please Enter Value of a");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		if(a>2)
		{
		if(a%2==0)
		{
			System.out.println("Number is Even "+a);	
		}
		else
		{
			System.out.println("Number is Odd "+a);
		}
		}
		else
		{
			System.out.println("Please neter the +ve number");
		}
	}
}


