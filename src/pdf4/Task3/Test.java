package pdf4.Task3;

class Test{
    public static void main(String[] args){ 
        		System.out.println("Normal main method"); 
        		Test.main("cjc"); 
    	} 
    	public static void main(String arg1){ 
        		System.out.println(arg1); 
        		Test.main("cjc", "classes"); 
    	} 
    	public static void main(String arg1, String arg2) { 
        		System.out.println(arg1	+" , "+arg2); 
    	} 
}
