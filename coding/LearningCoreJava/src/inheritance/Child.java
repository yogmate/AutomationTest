package inheritance;

public class Child extends Parent

{
	
	public void play()
			 {
		
		System.out.println("child class play methos");
	}
public static void main(String[] args) {
	
	Child c= new Child();
	c.play();
	c.run();
}	

}

class Grandson extends Child
{

public void play()
{
	
	System.out.println("Grandson play methos");
}


	public static void main(String[] args) {
		
		Grandson obj =  new Grandson();
		
		obj.play();
		obj.run();
		obj.play();
		
	}
	
	
	
	
}