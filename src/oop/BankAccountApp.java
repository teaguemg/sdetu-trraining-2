package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		// Creating a new bank account >> think instantiate an object

		BankAccount acc1 = new BankAccount();
		//acc1.name = "Rodger Hue";
		//With Encapsulation | think public API methods
		acc1.setName("Roger Hue");
		System.out.println(acc1.getName());
		acc1.setSsn("123456545");
		System.out.println("SSN: " + acc1.getSsn());
		
		
		acc1.accountNumber = "0641233";
		acc1.balance = 10000;
		acc1.setRate();
		acc1.increaseRate();
		
		acc1.deposit(1500);
		acc1.deposit(1000);
		acc1.deposit(500);
		acc1.withdraw(2000);
		
		
		//Polymorphism through overriding
		System.out.println(acc1.toString());
		
		//Polymorphism through overloading
		//Polymorphism = same method, but using different parameters 
		BankAccount acc2 = new BankAccount("Checking Account");
		acc2.accountNumber = "0641266";
		
		BankAccount acc3 = new BankAccount("Savings Account", 5000);
		acc3.accountNumber = "0641242";
		
		
		/*
		acc3.checkBalance();
		
		
		//demo for inheritance 
		CDAccount cd1 = new CDAccount();
		cd1.balance = 3000;
		cd1.name = "Juan";
		System.out.println(cd1.toString()); 
		cd1.compount();
	} */	

	}}
