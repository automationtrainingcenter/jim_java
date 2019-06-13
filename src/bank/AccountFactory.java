package bank;

public class AccountFactory {

	public static Account createAccount(String accName, String accHolderName, String address, double balance, long phNum) {
		Account acc = null;
		if (accName.equalsIgnoreCase("savings")) {
			acc = new Savings(accHolderName, address, balance, phNum);
		}else if (accName.equalsIgnoreCase("current")) {
			acc = new Current(accHolderName, address, balance, phNum);
		}else if(accName.equalsIgnoreCase("creditcard")) {
			acc = new CreditCard(accHolderName, address, balance, phNum);
		}else {
			System.out.println("invalid account type");
		}
		return acc;
	}

}
