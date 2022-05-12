package exception;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d=0,a;
		try {
			a=40/d;
			System.out.println("This will not be printed");
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("div by 0");
		}
		System.out.println("This will get printed");
	}

}
