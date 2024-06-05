package javasession;

public class Tree {
	
	String name;
	
	public static void main(String[] args) {
		
		Tree obj= new Tree();
		System.out.println(obj.name);
		obj.name= "Apple";
		System.out.println(obj.name);
		
		Tree obj2= new Tree();
		obj2.name= "mango";
		System.out.println(obj2.name);
		
	}

}
