package oop;

public class StaticAndNonStaticConcept {
	
	// global variable -- the scope of global variable will be available across all the functions with some conditions.
	
	String name = "Tom"; // non static global variable
	static int age = 25; // static global variable
	
	public static void main(String[] args) {
		
		// how to call static methods and variables:
		// two ways we can call static methods and variables
		//1. direct calling:
		sum();
		//2. calling by class name:
		StaticAndNonStaticConcept.sum();
		// for variables
		System.out.println(age); // direct calling
		System.out.println(StaticAndNonStaticConcept.age); // calling by class name
		
		// how to call non static variables and methods:
		// we have to create objects first and then will call by objectName.[methodName or variableName]
		
		StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
		
		System.out.println(obj.name); // I can't access "name" variable directly because it is a non static variable
		obj.sendMail();
		// static variables and static methods are not a part of object
		// Q -- Can I access static methods by using object reference? 
		// A -- Yes but a warning will be given
		
		obj.sum(); // warning is here & this is not a good practice
		
		
	}

	public void sendMail(){ // non static method
		System.out.println("send mail method");
	}
	
	public static void sum(){ // static method
		System.out.println("sum method");
	}
	
	
	
}
