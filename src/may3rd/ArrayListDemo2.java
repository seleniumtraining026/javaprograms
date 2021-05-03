package may3rd;

import java.util.ArrayList;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		System.out.println(al.size());
		
		al.add(10);
		
		al.add(20);
		
		System.out.println(al.size());
		
		
		al.add(100);
		
		al.add(200);
		
		al.add(1000);
		
		al.add(2000);
		
		//al.add(2000.33);
		
		
		
		System.out.println(al.size());
		
		for(Integer a:al)
		{
			
			System.out.println(a);
		}

	}

}
