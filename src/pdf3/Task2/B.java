package pdf3.Task2;

public class B extends A{
	  public B(){
		  this("hi");
		System.out.println("No-arg-constructor_B");
		
	}
	public B(String x){
		super();
		System.out.println("arg-constructor_B");
	
	}
	public static void main(String[] args) { 
		B b=new B();
		
	     }
	}
