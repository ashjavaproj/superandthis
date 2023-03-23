package pdf4.Task5;

class Check_overloading{
	public void mt()
	{
		System.out.println("no parameter mt");
	}
	public void mt(int x){
		System.out.println("1 int  parameter mt");
	}
	public int mt(int x,int y){
		System.out.println("2 int  parameter mt");
	       return 10;
	} 
	public void mt(double x){	
		System.out.println("1 double  parameter mt");
	
	}
	public String mt(String s1,String s2){	
	return s1+s2;
	}
	public String mt(String s1){
		return s1;
	}
	public static void main(String args[])	
	{
	//craete object and call all the methods0;
		
		Check_overloading cho=new Check_overloading();
		cho.mt();
		cho.mt(10,20);
		cho.mt(123d);
		cho.mt("Abc","PQR");
		
	}
}