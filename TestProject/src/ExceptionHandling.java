
public class ExceptionHandling {
	public static void main(String[] args) {
		
		try {
		
		System.out.println("hello world");
		int i = 1/0;
		System.out.println("completed");
		
		}
		catch(Exception exp) {
			System.out.println("i am running catch block");
			System.out.println("message is" + exp.getMessage());
			System.out.println("cause is" + exp.getCause());
			exp.printStackTrace();
			
		}
		finally {
			System.out.println("i am executing finally block");
		}
	}

}
