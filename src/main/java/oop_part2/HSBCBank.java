package oop_part2;

public class HSBCBank implements USBank, BrazilBank{ // we are achieving multiple inheritance
	// It is called Is-a relationship. 
	
	// if a class is implementing any Interface, then it is mandatory to define or override all the methods of Interface.
	
	// overriding from USBank
	public void credit() {
		System.out.println("hsbc----credit");
	}
	
	public void debit() {
		System.out.println("hsbc---debit");
	}
	
	public void transferMoney() {
		System.out.println("hsbc----transferMoney");
	}
	
	// seperate method of HSBCBank class
	public void educationloan() {
		System.out.println("hsbc-----education loan");
	}
	
	public void carloan() {
		System.out.println("hsbc-----car loan");
	}

	// overriding from BrazilBank
	public void mutualFund() {
		System.out.println("hsbc---mutual fund");
	}
}
