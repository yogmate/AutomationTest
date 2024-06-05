package javasession;

public class Animal2 {
	
	int legs;
	String color;
	
	public void eat()
	{
		System.out.println("eat food");
	}
	
	public void run()
	{
		
		System.out.println("run");
	}
	
	public static void main(String[] args) {
		Animal2 dog= new Animal2();
		dog.eat();
		dog.run();
		
		dog.color= "white";
		dog.legs= 4;
		
		System.out.println(dog.color);
		System.out.println(dog.legs);
		
		System.out.println("===========================");

		Animal2 cat= new Animal2();
		cat.eat();
		cat.run();
		cat.color= "black";
		cat.legs= 2;
		
		System.out.println(cat.color);
		System.out.println(cat.legs);
		
	
		
		
	}
	
	
}

