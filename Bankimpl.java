package bank;

public class Bankimpl implements Bank {
	int balance;
	
	Bankimpl(int balance)
	{
		this.balance=balance;
	}
	@Override
	public void deposit(int amount)
	{
		System.out.println("Depositing amount: "+ amount);
		balance=balance+amount;//balance+=amount
		System.out.println("amount Deposited successfully");
	}
	@Override
	public void withdraw(int amount)
	{
		if(balance>amount)
		{
		System.out.println("Withdrawing amount: "+ amount);
		balance=balance-amount;//balance-=amount
		System.out.println("Amount Withdrawn Successfully");
		}
		else {
			try
			{
				throw new InsufficientBalanceException("insufficient balance");
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
			
		}
	}
	@Override
	public int checkBal()
	{
		return balance;
	}
	@Override
	public String displayErroeMessage()
	{
		return "Invalid choicec ,please enter valid choice";
	}


}
