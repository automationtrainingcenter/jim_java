package encapsulation;

public class TestEncapsulation {
	public static void main(String[] args) {
		EncapsulationDemo obj = new EncapsulationDemo(101, "ravi", "test lead", 60000.00);
		obj.display();
		
		obj.setPromotion("test manager");
		
		System.out.println(obj.getDesignation());
		obj.display();
	}

}
