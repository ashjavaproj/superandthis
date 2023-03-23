package pdf3.Task3;

public class B extends A{
	  public B(){
		System.out.println("No-arg-constructor_B");
	  }
	public B(String x){
		super(10);
		System.out.println("arg-constructor_B");
	  }
	public static void main(String[] args) { 
		B b=new B();
		B b1=new B("cjc");
	   }
	}



