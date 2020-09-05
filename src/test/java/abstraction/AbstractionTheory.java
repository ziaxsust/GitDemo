package abstraction;

public class AbstractionTheory {

	//Abstraction -- Abstraction is the process of hiding the implementation details and showing only the functionality to the user.
	
	//How to achieve abstraction? -- There are two ways to achieve abstraction in java.
	//1)Abstract class (0 to 100%)
	//2)Interface (Achieve 100% abstraction) 
	
	//abstract class must have a abstract keyword before the class name. It can have both abstract method and non abstract method. 
	//non abstract class cannot have abstract method
	
	//Points to remember about abstract method:
	//1)abstract method has no body.
	//2)it must be end with a semicolon
	//it must be in the abstract class
	//it must be overridden
	//it can never be final and static
	
	//we cannot create an object of abstract class but we can create a reference variable. By using reference variable we can create an object of sub class
	// - and can also use all the properties. 
	//abstract class cannot be instantiated which means cannot create an object of that class.
	
}
