package may12th;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetDemo {

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
		
		System.out.println(hs);
		
		hs.add("Reyaz");
		
		hs.add("Cucumber");
		
		System.out.println(hs.size());
		
		System.out.println(hs);
		
		
		
		

	}

}
