package demo.abc;

public class test {
	public static void main(String args[]) {
		Student st=new Student();
		st.setValues(101,"jai",52255.0f);
		st.printDetails();
	}

}
class Student{
	int id;
	String name;
	float fee;
	public void setValues(int id, String name, float fee) {
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