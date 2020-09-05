package javabasics;

public class ArrayConcept {

	public static void main(String[] args) {
		
		// array : to store similar data type values in a array variable.

		//1. int array:
		
		// lowest bound/index o
		// upper bound/index (n-1) where n is size of array.
		// one dimensional array
		// advantage: I can store multiple values in one variable (with similar data type)
		// disadvantage of array:
		// 1) size is fixed--that's called static array.(You can't go beyond the size)-- To overcome of this problem,
		//--we use Collections -- ArrayList, HashTable -- this are called dynamic array.
		// 2) stores only similar data types --  To overcome of this problem, we use Object array.
		
 		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		
		System.out.println(i[2]);
		System.out.println(i[0]);
		
		// famous interview question. I can't fetch the values if the location or index is not exist. 
		// System.out.println(i[4]); // if the index is not exist then it will give/show you ArrayIndexOutOfBoundsException
		
		System.out.println(i.length); // .length will give you the size/length of array
		
		// print all the values of array. We have to use for loop concept.
		for(int j=0;j<i.length;j++){
			System.out.println(i[j]);
						
		}
		
		//2. double array:
		
		double d[] = new double[3];
		d[0] = 12.33;
		d[1] = 23.55;
		d[2] = 45.22;
		System.out.println(d[2]);
		System.out.println(d[0]);
		System.out.println(d.length);
		
		for(int k=0; k<d.length; k++){
			System.out.println(d[k]);
		}
		
		//3. char array:
		
		char c[] = new char[3];
		c[0] = 'a';
		c[1] = '$';
		c[2] = 'z';
		System.out.println(c[1]);
		
		System.out.println(c.length);
		
		for(char r=0; r<c.length; r++){
			System.out.println(c[r]);
		} 
		
		//4. boolean array:
		
		boolean b[] = new boolean[2];
		b[0] = true;
		b[1] = false;
		System.out.println(b[0]);
		System.out.println(b[1]);
		
		System.out.println(b.length);
		
		
		for(int e=0; e<b.length; e++){
			System.out.println(b[e]);
		}
		
		
		//5. String array:
		
		String s[] = new String[4];
		s[0] = "Hello";
		s[1] = "Java";
		s[2] = "test";
		s[3] = "Array";
		System.out.println(s[2]);
		System.out.println(s[3]);
		
		System.out.println(s.length);
		
		for(int t = 0; t<s.length; t++){
			System.out.println(s[t]);
		}
		
		
		System.out.println("*****************************");
		
		//6. Object array: (Object is a class) -- is used to store different data types values.
		
		Object ob[] = new Object[6];
		
		ob[0] = "Tom";
		ob[1] = 25;
		ob[2] = 12.33;
		ob[3] = "1/1/1990";
		ob[4] = 'M';
		ob[5] = "London";
		
		System.out.println(ob[5]);
		System.out.println(ob.length);
		System.out.println(ob[3]);
		
			
			
	}

}
