package apr9th;

public class Clock {
	
	
	int hr,min,sec;
	
	
	public Clock(int hr)
	{
		
		this.hr=hr;
	}
	
	public Clock(int hr,int min)
	{
		
		this.hr=hr;
		this.min=min;
		
	}
	
	public Clock(int hr,int min,int sec)
	{
		
		this.hr=hr;
		this.min=min;
		this.sec=sec;
		
	}
	
	public void getClock() {
		
		
		
		System.out.format("%02d:%02d:%02d",hr,min,sec);
	}
	
	


}
