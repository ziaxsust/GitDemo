package javabasics;

public class StringConcatenation {

	public static void main(String[] args) {
		
		// + sign is called a concatenation operator.
		
		int a = 100;
		int b = 200;
		
		String x = "Hello";
		String y = "World";
		
		double c = 12.33;
		double d = 10.33;
		
		System.out.println(a+b);
		System.out.println(x+y);
		
		// left to right execution
		
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		
		System.out.println(x+y+(a+b));
		System.out.println(a+b+x+y+a+x+b+y);

		System.out.println(a+b+x+y+a+b);
		
		System.out.println(c+d);
		System.out.println(x+y+c+d);
		
		System.out.println("Hello World");
		System.out.println(a);
		System.out.println("a");
		System.out.println("The value of a is:"+a);
		System.out.println("The value of d is :"+d);
		System.out.println("The addition of a+b is :"+(a+b));
		
		// println -- is used to print on the console with a new line.
		// 'ln' means line new.
		// print -- is just used to print on the console.
		
		System.out.print("Hello Selenium ");
		System.out.println("Hello Testing");
				
		
		
	}

}
