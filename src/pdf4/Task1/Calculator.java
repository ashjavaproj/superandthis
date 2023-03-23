package pdf4.Task1;

class Calculator {
	int n1,n2,num3,addi;
	//number of parameters:
	public void add(int n1, int n2) {
		this.n1=n1;
		this.n2=n2;
		addi=n1+n2;
		System.out.println("2 int value Addition is ="+addi);
	}
  public void add(int num1, int num2, int num3){
  		this.num1=num1;
		this.num2=num2;
		this.num3=num3;
		addi=num1+num2+num3;
		System.out.println("3 int value Addition is ="+addi);
  	}
  	
  	float no1,no2,addi1;
  	double nu1, nu2,addi2;
  	//Type of parameters:
  	public void add(float no1, float no2){
  		this.no1=no1;
  		this.no2=no2;
  		addi1=no1+no2;
  		System.out.println("2 float value Addition ="+addi1);
  	}
  	public  void add(double nu1, double nu2){

  		this.nu1=nu1;
  		this.nu2=nu2;
  		addi2=nu1+nu2;
  		System.out.println("2 double value Addition ="+addi2);
  	}
  	 
  	double nm1,nm2,addi3; int num1,num2;
  	//Order of parameters:
  	public void add(double nm1, int num2){
  		
  		this.nm1=nm1;
  		this.num2=num2;
  		addi3=nm1+num2;
  		System.out.println("1 double &1 int value Addition ="+addi3);
  	}
  	public void add(int num1, double nm2) {
  		
  		this.num1=num1;
  		this.nm2=nm2;
  		addi3=nm2+num1;
  		System.out.println("1 int & 1 double value Addition ="+addi3);
  	}
  	
  	public static void main(String[] args){
		Calculator c=new Calculator();
		c.add(10,20);
		c.add(10,20,2);
		c.add(10.1f,20.2f);
		c.add(123d,23.3d);
		c.add(123d,12);
		c.add(12,122d);
		
	}	
}