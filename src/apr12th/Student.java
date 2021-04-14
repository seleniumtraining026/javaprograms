package apr12th;

public class Student {
	
	
	int rollNo;
	
	String sNa;
	
	public void setData(int rollNo,String sNa)
	{
		this.rollNo=rollNo;
		this.sNa=sNa;
			
		
	}
	
	
	public void display()
	{
		
		
		System.out.println("Roll No is "+rollNo+"\t"+"Student Name "+sNa);
	}

}
