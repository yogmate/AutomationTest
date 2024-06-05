package variable;

public class InstanceVariable {

	String name= "Steve";
	
	public void nameDisplay()
	{
		System.out.println(" name is "+name);
	}
  public void nameDisplay2()
  
  {
	  System.out.println();
  }
  public void nameDisplay3()
	{
		System.out.println(" name is "+name);
	}
  
  
  public static void main(String[] args)
  
  {
	  InstanceVariable obj= new InstanceVariable();
	  obj.nameDisplay();
	  obj.nameDisplay2();
	  obj.nameDisplay3();
}
}
