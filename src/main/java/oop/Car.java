package oop;

public class Car {
		
		// class variable:
		int mod;
		int wheel;
		
	public static void main(String[] args) {
		
		// new Car(); -- this is the object of Car class
		// new key word is used to create the object
		// a, b, c are object reference variables
				
		Car a = new Car();
		Car b = new Car();
		Car c = new Car();
		
		a.mod = 2019;
		a.wheel = 4;
		
		b.mod = 2017;
		b.wheel = 4;
		
		c.mod = 2013;
		c.wheel = 4;
		
		System.out.println("before assigning the references");
		
		System.out.println(a.mod);
		System.out.println(a.wheel);

		System.out.println(b.mod);
		System.out.println(b.wheel);
		
		System.out.println(c.mod);
		System.out.println(c.wheel);
		
		System.out.println("after shifting the references");
		
		a=b;
		b=c;
		c=a;
		
		a.mod = 10;
		System.out.println(a.mod); //10
		
		c.mod = 20;
		System.out.println(a.mod); //20
		System.out.println(c.mod); //20
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
