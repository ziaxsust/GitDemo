package oop_part2;

public interface USBank {

	int min_bal = 100;
	
	public void credit();
	
	public void debit();
	
	public void transferMoney();
	
	
	// only method declaration
	// no method body -- only method prototype
	// In Interface, we can declare the variables and variables are by default static in nature.
	// variables value will not be changed, its final or constant in nature
	// no static method is allowed in Interface
	// we can't create the object of Interface
	// Interface is abstract in nature
}
