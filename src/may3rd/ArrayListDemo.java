package may3rd;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList al=new ArrayList();
		
		System.out.println(al.size());
		
		al.add(10);
		
		al.add(20);
		
		System.out.println(al.size());
		
		
		al.add(100);
		
		al.add(200);
		
		al.add(1000);
		
		al.add(2000);
		
		al.add(2000.33);
		
		
		System.out.println(al.size());
		
		for(int i=0;i<al.size();i++)
		{
			
			System.out.println(al.get(i));
		}
		
		
		al.remove(3);
		
		System.out.println(al.size());
		
		for(int i=0;i<al.size();i++)
		{
			
			System.out.println(al.get(i));
		}
		

	}

}
