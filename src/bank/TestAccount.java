package bank;

public class TestAccount {
	
	public static void main(String[] args) {
//		Account a1 =new Account("satish", "lingampalli", 10000.00, 9877666555l);
		Account a1 = AccountFactory.createAccount("savings", "satish", "lingampalli", 10000.00, 9877666555l);
		System.out.println(a1.getAccNum());
		
		Account a2 =new Savings("ritika", "lingampalli", 20000.00, 9877666112l);
		System.out.println(a2.getAccHolderName());
		a2.setAccHolderName("rithika");
		System.out.println(a2.getAccHolderName());
		a2.showBalance();
		System.out.println("deposite money");
		a2.deposite(10000);
		a2.showBalance();
		System.out.println("withdraw money");
		double money = a2.withdraw(25000);
		System.out.println(money);
		a2.showBalance();
		
		Account a3 =new Current("sruthi", "miyapur", 50000.00, 9877111555l);
		System.out.println(a3.getAddress());
		a3.setAddress("Gachibowli");
		System.out.println(a3.getAddress());
		a3.showBalance();
		System.out.println("deposite money");
		a3.deposite(10000);
		a3.showBalance();
		System.out.println("withdraw money");
		money = a3.withdraw(45000);
		System.out.println(money);
		a3.showBalance();
		
		
		Account a4 = new CreditCard("jim", "chandanagar", 80000.00, 8877711222l);
		System.out.println(a4.getPhNum());
		a4.setPhNum(7770011221l);
		System.out.println(a4.getPhNum());
		a4.showBalance();
		System.out.println("deposite money");
		a4.deposite(10000);
		a4.showBalance();
		System.out.println("withdraw money");
		money = a4.withdraw(15000);
		System.out.println(money);
		a4.showBalance();
	}

}
