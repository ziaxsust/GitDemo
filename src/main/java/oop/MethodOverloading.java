package oop;

public class MethodOverloading {

	public static void main(String[] args) {
		
				
		MethodOverloading obj = new MethodOverloading();
		
		obj.sum();
		obj.sum(5);
		obj.sum(10,5);
		obj.sum(12.33);

	}
	
	// Can we overload main method?
	// Yes. we can overload main method also.
	
	public static void main(int p){
		
	}
	
	public static void main(int q, int h){
		
	}
	
	/* method overloading--when the method name is same with different arguments or input-
	-parameters [or different data type] within the same class.
	*/
	// you can't create a method inside a method
	// duplicate method -- i.e. same method name with same number of arguments are not allowed.

	public void sum(){ // 0 input parameter
		System.out.println("Sum method -- zero input parameter");
	}

	public void sum(int i){ // 1 input parameter
		System.out.println("Sum method -- one input parameter");
		System.out.println(i);
	}
	

	public void sum(double d){ // 1 input parameter
		System.out.println("Sum method -- one input parameter");
		System.out.println(d);
	}
	public void sum(int j, int k){ // 2 input parameter
		System.out.println("Sum method -- two two parameter");
		System.out.println(j+k);
	}


}
