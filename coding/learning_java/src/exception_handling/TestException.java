package exception_handling;

public class TestException {
	
	public static void main(String[] args) throws CustomException {
		
		throw new CustomException("data not found");
		
	}

}
