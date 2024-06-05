package javasession;

public class Table {
	
	//instance variable
	
	String color;
	int price;
	
	public Table(String colors, int prices)
	{
		color= colors;
		price= prices;
		
	}
	
	public static void main(String[] args) {
		
		Table obj= new Table("White",100);
		System.out.println(obj.color+" : "+obj.price );
		
		Table obj1= new Table("Balck",200);
		System.out.println(obj1.color+" : "+obj1.price );
		
		Table obj2= new Table("red",300);
		System.out.println(obj2.color+" : "+obj2.price );
		

	}

}
