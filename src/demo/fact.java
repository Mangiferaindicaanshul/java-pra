package demo;
import java.util.Scanner;
public class fact {
public static void main(String args[]) {
	MyUtils myUtils = new MyUtils();
	myUtils.saySomthing();
	myUtils.getFact();
}
}
class MyUtils{
	public void saySomthing() {
		System.out.println("HELLO");
	}
	public void getFact() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		long fact = 1;
		for(int i=1; i<=num; i++) {
			fact = fact*i;
		}
		System.out.println("Factorial = " +fact);
		
	}
}
