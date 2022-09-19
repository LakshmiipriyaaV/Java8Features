package java8;


	interface Sayable{  
	    void say();  
	}  
	public class MethodRef {  
	    public static void saySomething(){  
	        System.out.println("Hello, this is mthod reference java8 features.");  
	    }  
	    public static void main(String[] args) {  
	         
	        Sayable sayable = MethodRef::saySomething;  
	         
	        sayable.say();  
	    }  
	}  

