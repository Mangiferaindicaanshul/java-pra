
package demo;
import java.util.Scanner;
public class remo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee st=new Employee();
		System.out.println("Before initialization");
		System.out.println(st.id);
		System.out.println(st.name);
		System.out.println(st.salary);
		System.out.println("Enter id : ");
//		int id = sc.nextInt();
		st.id = sc.nextInt();
		System.out.println("Enter name : ");
		st.name = sc.next();
		System.out.println("Enter Salary : ");
		st.salary = sc.nextFloat();
		System.out.println("After initialization");
		System.out.println(st.id);
		System.out.println(st.name);
		System.out.println(st.salary);
	}

}
class Employee {
	int id;
	String name;
	float salary;
}
