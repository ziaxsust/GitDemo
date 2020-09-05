package javabasics;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		// non generic
		ArrayList ar = new ArrayList();
		
		ar.add(100); // index-0
		ar.add(200);//1
		ar.add(300);//2
		
		System.out.println(ar.size());

		ar.add(400);//3
		ar.add(500);//4
		
		System.out.println(ar.size());
		
		ar.add("Tom");//5
		ar.add(12.33);//6
		ar.add('M');//7
		ar.add("Hello");//8
		ar.add('F');
		
		System.out.println("*********");
		System.out.println(ar.size());
		
		ar.remove(9);
		
		System.out.println(ar.size());
		System.out.println("*********");
		
		System.out.println(ar.get(5));
		//System.out.println(ar.get(10)); -- IndexOutOfBoundsException
		
		// To print all the values of ArrayList: Always use for loop
		
		for(int i=0; i<ar.size(); i++){
			System.out.println(ar.get(i));
		}
		
		// generic concept
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(100);
		//ar1.add("Tom");--not possible
		System.out.println(ar1.get(0));
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("Zia");
		
		System.out.println(ar2.get(0));
		System.out.println(ar2.size());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
