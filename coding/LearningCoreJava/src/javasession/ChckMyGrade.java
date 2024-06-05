package javasession;

public class ChckMyGrade {
	
	public static void main(String[] args) {
		
		int marks= 80;
		
		if((marks>60) && (marks<70))
		{
			
			System.out.println("grade d");
		}
		
		else if((marks>70) && (marks<80))
		{
			
			System.out.println("grade c");
			
		}
		
		else if((marks>80) && (marks<90))
		{
			
			System.out.println("grade b");
	}
		else if(marks>90)
		{
			
			System.out.println("grade a");
	}

		else
		{
			
			System.out.println("invalid block");
		}
}
}

