package myBank;

//INTERFACE: Defines the standard operations for any bank account
interface ITransaction {
	void deposit(double amount);

	void withdraw(double amount);

	void checkBalance();
}
