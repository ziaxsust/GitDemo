package javabasics;

public class IncrementDecrementOperator {

	public static void main(String[] args) {
		
		// ++
		// --
		
		int i = 1;
		int j = i++; // post increment
		
		System.out.println(i); // output i = 2
		System.out.println(j); // output j = 1
		
		
		int a = 1;
		int b = ++a; // this is called pre-increment
		
		System.out.println(a); // output a = 2
		System.out.println(b); // output b = 2
		
		int m = 2;
		int n = m--; // post decrement
		
		System.out.println(m); // output m = 1
		System.out.println(n); // output n = 2
		
		
		int p = 2;
		int q = --p; // pre decrement. Decrease the value of p by 1 
		
		System.out.println(p); // output p = 1
		System.out.println(q); // output q = 1

	}
	
}
