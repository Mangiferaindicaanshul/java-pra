package demo.abc;

import java.util.Scanner;

class address {
	String pincode;
	String plot;
	String area;
	String district;

	public address(String pincode, String plot, String area, String district) {
		this.pincode = pincode;
		this.plot = plot;
		this.district = district;
		this.area = area;
	}

	public void details() {
		System.out.println(pincode);
		System.out.println(plot);
		System.out.println(district);
		System.out.println(area);
	}

}

class employee {
	String name;
	float salary;
	int id;
	address add;

	public employee(String name,float salary,int id,address add) {
		this.name=name;
		this.salary = salary;
		this.id=id;
		this.add=add;
	}

	public void details() {
		System.out.println(name);
		System.out.println(salary);
		System.out.println(id);
		System.out.println("Address = ");
		add.details();
	
	}
}

public class aryan {
	public static void main(String[] args) {

		address a1 = new address("302015", "369", "Barkat Nagar", "Jaipur");
		employee p1 = new employee("jai",32323,242,a1);
		p1.details();

	}
}