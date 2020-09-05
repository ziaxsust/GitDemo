package oop;

public class FunctionsInJava {

	// main method--> starting point of execution
	// main method is void because we never write "return" statement inside main method
	// main method is void -- never returns a value 
	public static void main(String[] args) {
		
		FunctionsInJava obj = new FunctionsInJava();
		// one object will be created, obj is the reference variable, referring to this object
		// after creating the object, the copy of all non static methods will be given to this object
		
		obj.test();
		
		int l = obj.pqr();
		System.out.println(l);
		
		String s1 = obj.qa();
		System.out.println(s1);
		
		int div = obj.division(30, 10);
		System.out.println(div);
		
		
	}
	
	// non-static methods
	
	// void means -- doesn't return any value
	// return type = void 
	public void test(){ // no input, no output
		System.out.println("test method");
	}
	
	// return type = int 
	public int pqr(){ // no input, some output
		System.out.println("PQR method");
		int a = 10;
		int b = 20;
		int c = a+b;
		
		return c;
	}
	
	// return type = String
	public String qa(){ // no input, some output
		System.out.println("QA method");
		String s = "Selenium";
		
		return s;
	}
	
	// return type = int
	// x, y --> input parameters/arguments
	public int division(int x, int y){
		System.out.println("Division method");
		int d = x/y;
		
		return d;
		
	}

}
