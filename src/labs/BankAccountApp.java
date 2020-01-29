package labs;

import org.omg.CORBA.PRIVATE_MEMBER;

public class BankAccountApp {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount("465123456");
		BankAccount acc2 = new BankAccount("111111111");
		BankAccount acc3 = new BankAccount("222222222");
	}
	

}

class BankAccount {
//Properties of bank account
private static int iD = 1000;				  // Internal ID
private String accountNumber; //iD + random 2-digit number + first 2 of SSN
private String routingNumber;
private String name;
private String SSN;
private double balance;

//Constructor
public BankAccount (String SSN) {
	
	this.SSN = SSN;
	iD++;
	setAccountNumber();
}

private void setAccountNumber() {
	int random = (int) (Math.random() * 100);
	accountNumber = iD + "" + random + SSN.substring(0, 2);
	System.out.println("Your account number: " + accountNumber);
}
}