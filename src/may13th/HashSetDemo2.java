package may13th;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSetDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//List<String> hs=new ArrayList<String>();
		
		Set<String> hs=new HashSet<String>();
		
		System.out.println(hs.size());
		
		hs.add("Selenium");
		
		hs.add("Cucumber");
		
		hs.add("Kosmik");
		
		hs.add("Reyaz");
		
				
		System.out.println(hs.size());
		
		Iterator<String> it=hs.iterator();
		
		
		while(it.hasNext())
		{
			
			System.out.println(it.next());
		}
		

		

	}

}
