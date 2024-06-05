package array;

public class StudentRollNo 
{

	int id1= 1;
	int id2= 2;
	
	public static void main(String[] args)
	
	{
		
		int rollno[]= new int[100];
		
		//rollno[0]= 1;
		//rollno[1]= 2;
		//rollno[2]= 3;
		//rollno[3]= 4;
		//rollno[4]= 5;

		//System.out.println(rollno[0]);
		
		for(int i=0; i< rollno.length; i++)
		{
			
			rollno[i]= i;
		}
		
		for(int roll: rollno)
			
		{
			System.out.println(roll);
		}
	}
	
}
