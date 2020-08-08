package practicejava;

public class FunctionOverload {

	public void getData(int a) {
		System.out.println("Function overloading");
		System.out.println(a);
	}

	public void getData(String a) {
		System.out.println(a);
	}

	public void getData(int a, int b) {
		System.out.println(b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FunctionOverload cl = new FunctionOverload();
		cl.getData(2);
		cl.getData("hello");
		cl.getData(2, 5);

	}

}
