package array;

public class TwoDArrayForEachLoop {
	
	public static void main(String[] args) {
		
		int [][] arr= new int[2][2];
		
		arr[0][0]= 10;
		arr[0][1]= 100;
		arr[1][0]= 1000;
		arr[1][1]= 10000;
		
		for(int[] ar: arr)
		{
			for(int a: ar)
			{
				System.out.println(a);
			}
		}
	}

}
