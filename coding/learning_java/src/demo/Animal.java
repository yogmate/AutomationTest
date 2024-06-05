package demo;

public class Animal {
	
	String color= "white";
	int age= 2;
	String name= "tom";
	
	//Behaviour
	
	public void run()
	{
		System.out.println("Animal is running");
	}

	public void eat()
	{
		System.out.println("Animal is eating");
	}
	
	public void walk()
	{
	
		System.out.println("Animal is walking");
	}
	public void bark()
	{
		
		System.out.println("Animal is barking");
	}
	
	public static void main(String[] args) {
		System.out.println("Executing main method");
	

		Animal dog = new Animal();
		System.out.println(dog.name);
		System.out.println(dog.color);
		System.out.println(dog.age);
		
//behaviour
		dog.bark();
		dog.walk();
		dog.eat();
		dog.run();
		
		
		
	}

}
