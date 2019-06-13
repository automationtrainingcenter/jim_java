package bank;

public class Current extends Account{
	private final double MIN_BAL = 20000;

	public Current(String accHolderName, String address, double balance, long phNum) {
		super(accHolderName, address, balance, phNum);
	}
	
	@Override
	public double withdraw(double amount) {
		if (amount >= 0) {
			if (this.balance >= amount) {
				this.balance -= amount;
				System.out.println("withdraw success");
				if(this.balance < MIN_BAL) {
					this.balance -= 150;
				}
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
