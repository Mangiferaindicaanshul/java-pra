package demo;
import java.util.Scanner;

class myutils {
	public void getfact() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no.");
		int fact=1;
		int num=sc.nextInt();
		for (int i=1 ; i<=num ;i++)
			fact*=i;
		System.out.println("factorial is " + fact);
	}
	public void sum (int a,int b)
	{
		int c=a+b;
		System.out.println("ADD is " + c);
		
	}
	public String check(int num) {
		if (num%2==0)
	    return "the no. is even.";
		else 
		return "the no. is odd.";
	}
}
public class add {
    public static void main(String[] args) {
    	myutils st =new myutils();
    	st.getfact();
    	Scanner sc = new Scanner(System.in);
    	System.out.println("enter the first no.:");
    	int a =sc.nextInt();
    	System.out.println("enter the second no.:");
    	int b =sc.nextInt();
    	st.sum(a,b);
    	System.out.println(st.check(a));
    }
}