package apr12th;

public class Leave extends Marks {
	
	int sL,cL;
	
	public void setLeaves(int sL,int cL)
	{
		this.sL=sL;
		this.cL=cL;
	}
	
	public void getLeaves()
	{
		
		System.out.println("Total Sick Leaaves "+sL);
		
		System.out.println("Total Causal Leaaves "+cL);
	}

}
