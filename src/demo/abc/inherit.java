package demo.abc;

public class inherit {
public static void main (String args[]) {
//	Dog d = new Dog();
//	d.eat();
//	d.bark();
//	System.out.println();
//	System.out.println();
	babyDog b = new babyDog();
	b.eat();
	b.bark();
	b.cry();
}
}
class Animal{
	String color="Black";
	public void eat() {
		System.out.println("Animal is eating");
	}
}
class Dog extends Animal{
	int speed = 40;
	public void bark() {
		System.out.println("kuta bhok rha hai");
	}
}
class babyDog extends Dog{
	public void cry() {
		System.out.println("Baby dog is crying");
	}
}