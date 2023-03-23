package pdf4.Task2;


public class A{
	int x,a,b;
	
	public void display()
	{
		System.out.println("display_method");
	}
	public int display(int x)
	{
		this.x=x;
		return x;
	}
	public void display(String msg)
	{
		System.out.println("my string is ="+msg);
	}
	public int display(int a,int b)
	{
		this.a=a;
		this.b=b;
		int c=a+b;
		return c;
	}
	public static void main(String[] args) {
		
	A a=new A();
	a.display();
	a.display(10);
	System.out.println("return value is ="+a.display(10));
	a.display("hi");
	a.display(10,2);
	System.out.println("Addition of 2 return values ="+a.display(10, 20));	
	}
}