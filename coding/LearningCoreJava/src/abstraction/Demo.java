package abstraction;

public class Demo {

	public void display()
	
	{
       System.out.println("display method called");	
	}
	
public void show()
	
	{
		System.out.println("show method called");
	}

}

class TestDemo2
{
	
	public static void main(String[] args) {
		
		Demo demo= new Demo();
		demo.display();
		demo.show();
		
	}
}