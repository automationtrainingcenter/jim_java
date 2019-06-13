package bank;

public class CreditCard extends Account {
	private double cashLimit = 20000;
	private final double creditLimit;

	public CreditCard(String accHolderName, String address, double balance, long phNum) {
		super(accHolderName, address, balance, phNum);
		this.creditLimit = balance;
	}

	@Override
	public void deposite(double amount) {
		if (amount >= 0) {
			if (this.balance < this.creditLimit) {
				this.balance += amount;
				System.out.println("deposite success");
			}else {
				System.out.println("No Due to pay");
			}
		} else

		{
			System.out.println("invalid amount");
		}
	}

	@Override
	public double withdraw(double amount) {
		if (amount >= 0) {
			if (this.cashLimit >= amount) {
				this.balance -= (amount + 50);
				this.cashLimit -= amount;
				System.out.println("withdraw success and remainig cash limit is " + this.cashLimit);
				return amount;
			} else {
				System.out.println("insufficient balance");
				return 0;
			}
		} else {
			System.out.println("invalid amount");
			return 0;
		}
	}

}
