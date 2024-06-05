package exceptionhandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test9 {

	
	public static void main(String[] args) throws IOException  {
		
		
		FileReader file= new FileReader("./file1.txt");
		
		BufferedReader fileInput= new BufferedReader(file);
		
		for(int counter= 0; counter<3; counter++)
			System.out.println(fileInput.readLine());
		
		fileInput.close();		
	}
}
