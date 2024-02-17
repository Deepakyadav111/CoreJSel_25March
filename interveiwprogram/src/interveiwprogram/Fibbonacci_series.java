package interveiwprogram;

public class Fibbonacci_series {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		System.out.println(a);
		System.out.println(b);
		int sum;
		for(int i=0;i<=10;i++)
		{
	    sum=a+b;
		System.out.println(sum);
        a=b;
        b=sum;
	}
	}
}
