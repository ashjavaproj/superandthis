package pdf4.Task4;

public class Check{
	  public void disp(int a, double b){
			System.out.println("Method A");
	   	}
	  public void disp(int a, double b, double c){
			System.out.println("Method B");
	 	 }
       public  void disp(int a, int b){
			System.out.println("Method C");
	   	}
	   public static void main(String args[]){
		   Check ch=new Check();
		   ch.disp(10, 14.6d);
		   ch.disp(57,3.45d, 39.5d);
		   ch.disp(12,11);
		//create object and call methods	
	 	}
}

