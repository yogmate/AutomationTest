package demo;

public class Animal1 {

	String color= "Black";
		int age= 3;
		String name= "kitty";
		
		//Behaviour
		
		public void run()
		{
		System.out.println("Animal1 is running");
		}
		
		public void eat()
		{
			System.out.println("Animal1 is eating");
			
		}
		public void walk()
		
		{
			System.out.println("Animal1 is walking");
			
		}
		
		public void bark()
		{
			
			System.out.println("Animal1 is barking");
			
		}
		
		public static void main(String[] args) {
			System.out.println("Executing main method");
			
			Animal1 cat = new Animal1();
			System.out.println(cat.name);
			System.out.println(cat.age);
			System.out.println(cat.color);
			
			//behaviour
			cat.run();
			cat.eat();
			cat.bark();
			cat.walk();
			
			
			
			
			
		
		
		
	}

}
