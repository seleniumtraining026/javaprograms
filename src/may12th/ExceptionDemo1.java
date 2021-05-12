package may12th;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=10;
		
		int y=0;
		
		try
		{
		int z=x/y;
		
		System.out.println("Quotient is "+z);
		
		System.out.println("Division is computed");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println("Division is Not Computed");
			System.out.println("Please Enter non Zero Value");
			
		}
		
		System.out.println("End of the Program");

	}

}
