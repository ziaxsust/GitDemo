package oop_part2;

public class TestCar {

	public static void main(String[] args) {
		
		// static polymorphism -- compile-time polymorphism
		BMW b = new BMW();
		
		b.start();
		b.stop();
		b.refuel();
		b.theftsafety();
		b.engine();
		
		System.out.println("*************");
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		// c.theftsafety(); -- not possible
		// parent class can't inherit any properties from child class-
		//-but child class can inherit all the properties from parent class
	
		System.out.println("-------***-------");
		// Top casting:
		Car c1 = new BMW(); // child class object can be referred by parent class reference variable-- dynamic polymorphism-->run time polymorphism  
		c1.start();
		c1.stop();
		c1.refuel();
		// c1.theftsafety(); -- not possible
		
		// Down casting:
		BMW b1 = (BMW)new Car(); // possible but it will give you "ClassCastException"
		// BMW b1 = new Car(); -- not possible
		
		
	
	}

}
