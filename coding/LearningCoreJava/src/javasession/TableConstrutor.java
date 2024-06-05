package javasession;

public class TableConstrutor {
	
	int lenght;
	int breadth;
	int height;
	
	public TableConstrutor(int lenght, int breadth, int height) {
		
		this.lenght = lenght;
		this.breadth = breadth;
		this.height = height;
		
	}
	
	public static void main(String[] args) {
		
		TableConstrutor table= new TableConstrutor(1,2,3);
		
		
		System.out.println("table lenght is: "+table.breadth);
		System.out.println("table lenght is: "+table.height);
		System.out.println("table lenght is: "+table.lenght);
		
	}
	

}


