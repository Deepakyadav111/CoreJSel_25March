package interveiwprogram;

public class swap_2_Numbers {

	public static void main(String[] args) {
		
		int a=10,b=20,c;
		a=a+b;   //c=a+b; bynusing third variable 
		b=a-b;   //a=c-a;
		a=a-b;   //b=c-b;
		System.out.println("value of a is : "+a);
		System.out.println("value of b is : "+b);

	}

}
