package demo.abc;

public class construt {
	public static void main(String args[]) {
//		Teacher st = new Teacher(10);
		Teacher st = new Teacher(22,"jai",422);
		st.printDetails();
	}
}
//class Teacher {
//	 public Teacher(){
//		this(10);
//		System.out.println("Non argument constructor");
//	}
//	 Teacher(int a){
//		this("jai");
//		System.out.println(" argument constructor");
//	}
//	 Teacher(String a){
//		System.out.println(" String argument constructor");
//	}
//}
class Teacher {
	int id;
	String name;
	float fee;
	public Teacher(int id, String name, float fee) {
		this.id = id;
		this.name = name;
		this.fee = fee;
	}
	public void printDetails() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(fee);
	}
}
