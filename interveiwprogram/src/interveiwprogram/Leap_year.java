package interveiwprogram;

import java.util.Scanner;

public class Leap_year {

public static void main(String[] args) {
  System.out.println("Please enter year");
  Scanner s=new Scanner(System.in);
  int year=s.nextInt();
      if(year%4==0)
      {
System.out.println(year +" is a Leap year ");
	}
      else {
    	  System.out.println(year +" is  not a Leap year ");
}
}
}