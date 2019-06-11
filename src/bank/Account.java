package bank;

public class Account {

	private int accNum = 100;
	private String accHolderName;
	private String address;
	private double balance;
	private long phNum;
	private static int i = 0;

	private Account() {
		this.accNum += i;
		i++;
	}

	public Account(String accHolderName, String address, double balance, long phNum) {
		this();
		this.accHolderName = accHolderName;
		this.address = address;
		this.balance = balance;
		this.phNum = phNum;
	}

	public String getAccHolderName() {
		return accHolderName;
	}

	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhNum() {
		return phNum;
	}

	public void setPhNum(long phNum) {
		this.phNum = phNum;
	}

	public int getAccNum() {
		return accNum;
	}

	@Override
	public String toString() {
		System.out.println("********************************************");
		return "account num : " + this.accNum + "\nname : " + this.accHolderName + "\naddress : " + this.address
				+ "\nbalance : " + this.balance + "\nphone number : " + this.phNum;
	}

}
