package interveiwprogram;

import java.util.Scanner;

public class Even_odd {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner s=new Scanner(System.in);
		int number=s.nextInt();
		if (number%2==0)
		{
		System.out.println(number+" is Even");
	}
		else 
		{
			System.out.println(number+" is Odd");
		}
}}
