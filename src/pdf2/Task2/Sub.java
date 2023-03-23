package pdf2.Task2;


public class Sub extends Parent
{
	public Sub()
	{
      		System.out.println("Constructor_sub");
   	}
	public Sub(int x)
	{
		System.out.println("arg-constructor_sub");
   	}
  	public void display()
	{
		System.out.println("Hello");
   	}
   	public static void main(String args[])
	{
		Sub s= new Sub();
		s.display();
		Sub s1= new Sub(10);
		s1.display();
   	}
}
