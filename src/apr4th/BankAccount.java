package apr4th;

public class BankAccount {
	
	
	private double balance=10000.00;
	
	
	public double getBalance(int pin)
	{
		if(pin==1234)
		{
			return balance;
		}
		
		else
		{
			
			return 0;
		}
		
		
	}
	
	

}
