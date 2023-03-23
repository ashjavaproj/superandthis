package pdf3.Task3;

public class A{
	  public A(){
		this(10.1f);
		System.out.println("No-arg-constructor_A");
	  }
	public A(int x){
		this();
		System.out.println("int_arg-constructor_A");
	  }
	public A(double x){
		System.out.println("double_arg-constructor_A");
	    }
	}
