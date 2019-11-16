
public class ExceptionHandlingThrowException {
	
	public static void main(String[] args) {
		
		try {
			throwException();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	public static void throwException() throws Exception {
		
		
			System.out.println("hello world");
			int i = 1/0;
			System.out.println("completed");

		
	}
}
