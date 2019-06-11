package bank;

public class TestAccount {
	
	public static void main(String[] args) {
		Account a1 =new Account("satish", "lingampalli", 10000.00, 9877666555l);
		System.out.println(a1.getAccNum());
		
		Account a2 =new Account("ritika", "lingampalli", 20000.00, 9877666112l);
		System.out.println(a2.getAccHolderName());
		a2.setAccHolderName("rithika");
		System.out.println(a2.getAccHolderName());
		
		Account a3 =new Account("sruthi", "miyapur", 50000.00, 9877111555l);
		System.out.println(a3.getAddress());
		a3.setAddress("Gachibowli");
		System.out.println(a3.getAddress());
		
		Account a4 = new Account("jim", "chandanagar", 15000.00, 8877711222l);
		System.out.println(a4.getPhNum());
		a4.setPhNum(7770011221l);
		System.out.println(a4.getPhNum());
	}

}
