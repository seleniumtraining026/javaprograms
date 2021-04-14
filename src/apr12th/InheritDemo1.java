package apr12th;

public class InheritDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Student s1=new Student();
		
		//.setData(1, "John");
		
		//s1.display();
		
		//single level Inheritance
		//Marks s1=new Marks();
		//s1.setData(1, "John");
		//s1.setMarks(80, 90, 80);
		//s1.display();
		//s1.getResults();
		
		
		//Multilevel
		
		Leave s1=new Leave();
		
		s1.setData(1, "John");
		s1.setMarks(80, 90, 90);
		s1.setLeaves(10, 12);
		s1.display();
		s1.getResults();
		s1.getLeaves();
		
				

	}

}
