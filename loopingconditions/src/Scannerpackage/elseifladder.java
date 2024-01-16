package Scannerpackage;

import java.util.Scanner;

public class elseifladder {
	
	public static void main(String[] args) 
	{
	System.out.println("Please Enter Marks");
	Scanner s=new Scanner(System.in);
	int Marks=s.nextInt();
	if((Marks>=0)&&(Marks<35))
	{
		System.out.println("Failed");
	}
	else if((Marks>=35)&&(Marks<60))
	{
		System.out.println("Pass...");
	}
	else if((Marks>=60)&&(Marks<80))
	{
		System.out.println("First Div");
	}
	else if((Marks>=80)&&(Marks<100))
	{
		System.out.println("Merit");
	}
	else
	{
		System.out.println("Please enter Corrent marks");
	}
	
	}

}

