package apr19th;

public class AtmDemo {
	
	public static void main(String[] args) {
		
		
		//Atm obj=new Atm();
		
		Atm obj=new HdfcAtm();
		
		obj.withdrawl(10000);
		
		obj.miniBalance();
		
		//User 2
		
		
		Atm obj2=new ICICIAtm();
		
		obj2.withdrawl(2000);
		
		obj2.balanceTransfer(1000);
		
		
		
	}
	

}
