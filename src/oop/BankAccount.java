package oop;

public class BankAccount implements IRate {
	//Static belongs to the class not the object instance, so if it changes for one object it changes for all of them.
	//final >> constant (often you see final and static together) by adding final it will not allow you to set routing number = to anything else.  it will flag an error.
	String accountNumber;
	private static final String routingNumber = "102345";
	
	//Instance Variable// can be called by any method 
	private String name;
	private String ssn;
	String accountType;	
	double balance = 0;
			
	// Constructor definitions: unique methods
		//1. They are used to define/setup/initialize properties of an object
		//2. Constructors are IMPLICITYLY called upon instantiation.  Called automatically when new object is created.
		//3. The same name as the class itself
		//4. Constructors have NO return type (No void, public or static)
	
	BankAccount() {
		System.out.println("New Account Created");
	}
	//Overloading: call same method name with different arguments/Parameters.This is Polymorphism 
	BankAccount(String accountType) {
		System.out.println("NEW ACCOUNT: " + accountType);
		
	}
	//initdeposit is a local variable and cannot be called outside of this method
	BankAccount(String accountType, double initDeposit) {
		System.out.println("NEW ACCOUNT: " + accountType);
		System.out.println("INITIAL DEPOSIT OF: $" + initDeposit);
		
	}
	
	
	//Getter / Setters
	
	//we want to allow the user to define the name
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	//Interface Methods have to be listed inrder to be used
	public void setRate() {
		System.out.println("Setting Rate");
		}
	public void increaseRate() {
		System.out.println("Increasing Rate");
		}
	
	
	
	//define methods
	public void deposit(double amount) {
		balance = balance + amount;
		showActivity("Depsit");

}
	void withdraw(double amount) {
		balance = balance + amount; 
		showActivity("Withdraw");
	}	
	//Private: can only be called within the class	
	private void showActivity(String activity) {
		System.out.println("Your recent transaction: " + activity);
		System.out.println("Your new balance is: " + balance);
		
	}
	
	void checkBalance() {
		
	}
	void getStatus () {
		
	}
	
	@Override 
	public String toString() {
		return "[ Name: " + name + ". Account Number: " + accountNumber + " . Routing Number" + routingNumber + " Balance: $" + balance +" ]"; 
	}
	
}

	
