package apr15th;

public class Dog extends Animal{
	
	int i=20;
	
	public Dog()
	{
		super();
		
		System.out.println("This is Dog Construtor");
	}
	
	public void display()
	{
		
		System.out.println(super.i);
		super.display();
		System.out.println("This is a Dog");
	}

}
