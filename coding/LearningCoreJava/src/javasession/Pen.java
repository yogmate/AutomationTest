package javasession;

public class Pen {
	
	String size;
	
	public void write()
	{
		System.out.println("write in red color");
	}
	
	public void button()
	
	{
		
		System.out.println("pen having button");
	}
	
	public static void main(String[] args) {
		
		Pen parker= new Pen();
		parker.write();
		//Pen parker1= new Pen();
		//parker.write();
		parker.button();
		parker.size= "big";
	System.out.println(parker.size);
	
		
		
	}
	
	
}
