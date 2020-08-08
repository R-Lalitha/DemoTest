package practicejava;

public class InheritChild extends InheritParent {
	String childname = "child";

	public InheritChild() {
		// super();
		System.out.println("constructor of child");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InheritChild ch = new InheritChild();
		ch.getdata();
		ch.getchildDate();

	}

	public void getdata() {
		super.getdata();
		System.out.println("child class");
	}

	public void getchildDate() {
		System.out.println(super.myname);
		System.out.println(childname);
	}

}
