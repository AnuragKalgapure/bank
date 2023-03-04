package bank;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		
		Bank bank=new Bankimpl(5000);
	Scanner Scan =new Scanner(System.in);
	while(true)
	{
	System.out.println("1:deposit\n2:Withdraw\n3:Check Balance");
	System.out.println("4:DisplayErroeMessage\n5:Exit");
	System.out.println("enter the choice");
	int choice=Scan.nextInt();
	switch(choice)
	{
	case 1:
		System.out.println("enter amount to be deposited:");
		int amountToDeposit=Scan.nextInt();
		bank.deposit(amountToDeposit);
		break;
	

	case 2:
		System.out.println("enter amount to be withdrawan:");
		int amountToWithdraw=Scan.nextInt();
		bank.withdraw(amountToWithdraw);
		break;
		
	case 3:
		System.out.println("available balance Rs :"+bank.checkBal());
		break;
	case 4:
		System.out.println("THANK YOU!!");
		System.exit(0);
	default:
		String message=bank.displayErroeMessage();
		System.out.println(message);
		
	}
	System.out.println("===============================");//after switch statement
}}
}
