package demo;
import java.util.Scanner;
public class index {
public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Emter your id:");
	int id = sc.nextInt();
	
	System.out.println("Emter your name:");
	String name = sc.next();
	
	System.out.println("Emter your fees:");
	float fees = sc.nextFloat();
	
	System.out.println("ID: " + id + " Name: "+ name+ " Fees: " +fees);
	
}
}
