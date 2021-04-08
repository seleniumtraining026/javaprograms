package apr4th;

public class PersonDemo {

	
	public static void main(String[] args) {
		
		
		Person p1=new Person();
		
		
		System.out.println(p1.name);
		
		System.out.println(p1.age);
		
		System.out.println(p1.ph);
		
		p1.greet();
		
		p1.name="John";
		
		p1.age=35;
		
		p1.ph=9800098000l;
		
		System.out.println(p1.name);
		
		System.out.println(p1.age);
		
		System.out.println(p1.ph);
		
		p1.greet();
		
		
		
		
		
	}
}
