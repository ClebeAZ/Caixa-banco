package account;

import java.util.Scanner;

public class account {
	private int num_account;
	private String account_holder;
	private double deposit;
	private double balance;
	private double lastWithdrawalAmount;
	

	public account () {
	}
	
	public void setNum_account(int num_account) {
		this.num_account = num_account;
	}
	
	public int getNum_account() {
		return num_account;
	}
	
	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}
	
	public double getDeposit() {
		return deposit;
	}
	
	public void setNum_account (String account_holder) {
		this.account_holder = account_holder; 
	}
	
	public void setAccount_holder(String account_holder) {
		this.account_holder = account_holder;
	}
	
	public String getAccount_holder() {
		return account_holder;
	}
	
	public void setBalance(double balance) {
		this.balance += balance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setLastWithdrawalAmount(double lastWithdrawalAmount) {
		this.lastWithdrawalAmount += lastWithdrawalAmount;
	}
	
	public double getlastWithdrawalAmount() {
		return lastWithdrawalAmount;
	}
	

	public double deposit (Scanner scanner) {
		System.out.printf("Enter a deposit value: ");
		double deposito = scanner.nextDouble();
		return this.balance += deposito;
	}
	  public double withdraw(Scanner scanner) {
	        System.out.printf("Enter the amount to withdraw: ");
	        double amount = scanner.nextDouble();
	        return this.lastWithdrawalAmount =+ amount;
	  }


	public boolean response(Scanner scanner) {
		System.out.printf("Is there na initial deposit? (y/n)");
		String resposta = scanner.next();
		
		if (resposta.equalsIgnoreCase("y")) {
			System.out.printf("Enter initial deposit value: ");
			double deposit = scanner.nextDouble();
			setDeposit(deposit);
			return true;
		} else if (resposta.equalsIgnoreCase("n")) {
			return false;
		}else {
			return response(scanner);
		}
	}
}
