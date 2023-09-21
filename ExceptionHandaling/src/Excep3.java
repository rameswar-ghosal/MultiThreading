//User Defined/Our own Exception-----


import java.util.Scanner;
@SuppressWarnings("serial")
class InvalidDataException extends Exception{

	public InvalidDataException(String msg) {
		super(msg);
	}
	
}
class Atm {
	int username;
	int password;
	int uname;
	int pword;
	Scanner s=new Scanner(System.in);
	public Atm() {
		username=3455;
		password=1000;
	}
	public void input() {
		System.out.println("Enter the user name and password...");
		System.out.print("Username :: ");
		uname=s.nextInt();
		System.out.print("Password :: ");
		pword=s.nextInt();
	}
	public void check() throws InvalidDataException {
		if((uname==username) && (pword==password))
		{
			System.out.println("Connection establish...");
		}
		else
		{
			InvalidDataException ide=new InvalidDataException("Wrong Info!!");
			//System.out.println(ide);
			System.out.println(ide.getMessage());
			throw ide;
		}
	}
}
class Bank {
	public void initiate() {
		Atm atm=new Atm();
		atm.input();
		try {
			atm.check();
		} catch (InvalidDataException e) {
			//e.printStackTrace();
			System.out.println("Disconnected due to wrong info!");
		}
	}
}
public class Excep3 {

	public static void main(String[] args) {
		Bank bank=new Bank();
		bank.initiate();
		System.out.println("Thank You!");
	}

}