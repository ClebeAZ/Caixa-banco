package bank;

import java.util.Scanner;
import account.account;

public class bank {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		account count = new account();
		
		System.out.printf("Enter account number: ");
		int accountNumber = sc.nextInt();
		sc.nextLine();
		count.setNum_account(accountNumber);
		
		System.out.printf("Enter account Holder: ");
		String holder = sc.nextLine();
		count.setAccount_holder(holder);
		 
		count.response(sc);
		System.out.println();
		
		double deposit = count.getDeposit();
		System.out.println("Acount data:");
		System.out.println("Account "+ count.getNum_account()+", Holder: "+ count.getAccount_holder()+", balance: $"+ deposit);
		System.out.println();
		
		count.deposit(sc);
		System.out.println();
		
		double up = count.getBalance() + count.getDeposit();
		System.out.println("Acount data:");
		System.out.println("Account "+ count.getNum_account()+", Holder: "+ count.getAccount_holder()+", balance: $"+up);
		System.out.println();
		
		count.withdraw(sc); //nota: estava errando o saque, pois estava utilizando o count.deposit(sc).
		System.out.println();
		
		double saque = (up - count.getlastWithdrawalAmount() - 5);
		System.out.println("Account "+ count.getNum_account()+", Holder: "+ count.getAccount_holder()+", balance: $"+saque);
		System.out.println(count.getlastWithdrawalAmount());
		
		sc.close();
	}
}
