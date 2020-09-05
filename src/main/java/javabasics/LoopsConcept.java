package javabasics;

public class LoopsConcept {

	public static void main(String[] args) {
		
		//1. while loop:
		// dis-advantage of while loop: it will generate infinite loop if you don't give incremental or decremental part
		//print 1 to 10
		int i = 1; // called initialization
		while(i<=10){ // this is called conditional part
			System.out.println(i);
			i = i + 1; // this is called incremental or decremental part
			
		}
		
		System.out.println("*********************");
		
		//2. for loop:
		//j++ means j=j+1
		// print 1 to 10
		for(int j=1;j<=10;j++){ // initialization, conditional and incremental/decremental part
			System.out.println(j);
			
		}
		System.out.println("-----------------------");
		// print 10 to 1
		// k-- means k = k-1
		for(int k=10; k>=1; k--){
			System.out.println(k); 
		}
			

	}

}
