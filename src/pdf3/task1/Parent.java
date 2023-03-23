package pdf3.task1;

public class Parent
{
   public Parent(){
	System.out.println("constructor_parent");
   }
 public Parent(String s){
	this();
	System.out.println("parameterized constructor_parent");
   }
}
