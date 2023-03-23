package pdf3.task1;

public class Child extends Parent{
	   public Child(){	
		super("Hi");
		System.out.println("Constructor_child");
	   }
	   public static void main(String args[]){		
		Child c1= new Child();	 
	   }
	} 

