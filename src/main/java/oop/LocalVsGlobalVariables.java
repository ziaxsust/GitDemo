package oop;

public class LocalVsGlobalVariables {
	
	// Global variable -- class variable
	
	String name = "Tom";
	int age = 25;

	public static void main(String[] args) {
		
		int i = 10; // local variable for main method. we can't use those inside the sum method.
		System.out.println(i);
		
		// if we want to see the output of global variable, we have to create object. 
		LocalVsGlobalVariables obj = new LocalVsGlobalVariables();
		System.out.println(obj.name);
		System.out.println(obj.age);
		
		int a = obj.sum();
		System.out.println(a);
	}
	
	public int sum(){
		int i = 10; // local variable for sum method. We can't use those inside the main method.
		int j = 20; // or local variable, we can't use outside of the sum method
		int age = 25;
		
		return age;
	}

}
