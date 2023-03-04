package bank;

public interface Bank {
	void deposit(int amount);
	void withdraw(int amount);
	int checkBal();
	String displayErroeMessage();

}
//All the above methods are automatically public and abstract
