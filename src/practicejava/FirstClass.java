package practicejava;

public class FirstClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
FirstClass first = new FirstClass();
secondclass sc = new secondclass();
		System.out.println("Hi everyone");
		sc.setData();
		first.getdata();
	}

	public String getdata()
	{
		System.out.println("test");
		return "abc";
	}
}
