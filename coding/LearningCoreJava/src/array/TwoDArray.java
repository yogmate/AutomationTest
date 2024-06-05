package array;

public class TwoDArray {
	
	public static void main(String[] args) {
		
		int [][]arr1;
		
		int [][] arr= new int[2][2];
		arr[0][0]= 10;
		arr[0][1]= 100;
		arr[1][0]= 1000;
		arr[1][1]= 10000;
		
		for(int i= 0; i<arr.length; i++)
		for(int j=0; j<arr[i].length; j++)
			System.out.println(arr[i][j] + " ");
	}

}
