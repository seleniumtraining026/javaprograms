package apr12th;

public class InheritDemo2 {
	
	
	public static void main(String[] args) {
		
		
		//User1
		
		Sum obj1=new Sum();
		
		obj1.setX(10);
		obj1.setY(20);
		obj1.add();
		
		//User 2
		
		Diff obj2=new Diff();
		
		obj2.setX(20);
		obj2.setY(30);
		
		obj2.sub();
		
	}
	

}
