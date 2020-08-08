package practicejava;

public class FunctionOverriding extends InheritParent{

	String name ="QAClickAcademy";


	public FunctionOverriding()
	{
	super();// this should be always be at first line
	System.out.println("child class construtor");

	}
	public void getStringdata()
	{
	System.out.println(name);
	System.out.println(super.myname);
	}


	public void getData()
	{
	System.out.println("I am in child class");
	}
	public static void main(String[] args) {
	// TODO Auto-generated method stub

		FunctionOverriding fo = new FunctionOverriding();

	fo.getStringdata();
	fo.getData();
	}

	}