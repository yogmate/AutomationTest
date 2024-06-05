package incapsulation;

public class TestDemo {
	
	public static void main(String[] args) {
		
		Demo demo= new Demo();
		demo.setName("ABC");
		demo.setId(101);
		System.out.println(demo.getId());
		System.out.println(demo.getName());
	}

}
