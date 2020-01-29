package basics;

public class NumbersCalc {
	public static void main(String[] args) {
		System.out.println("Program is starting");
		printName();//function
		
		int numA = 10;//Variable
		int numB = 20; //Variable
		addNumbers(numA, numB); //Function
		System.out.println("The product of numbers " + numA + " and " + numB + " is " +  multiplyNumbers(numA, numB));
		
	}
	
	
	//setting up functions, the functions listed in Main will tell the fucntion the action to take. 
	static void printName() {
		//This just call the function with no parameter and no return type
		System.out.println("My name is Mack");
	}

	static void addNumbers (int numA, int numB) {
		//This function with parameter and return type
		int sum = numA + numB; 
		System.out.println("The sum of numbers "  + numA + " and "  + numB + " is "  + sum);
	}
	//This function has a return type in because we are not using static void.  Any method that is not declared void must contain a return statement with a corresponding return value, like this:
//return returnValue;
	
	static int multiplyNumbers(int numA, int numB) {
		int product = numA * numB; 
		return product;
		
		
	}
	
	
/*	
	multipleNumbers
/*
 * 
 */
}
