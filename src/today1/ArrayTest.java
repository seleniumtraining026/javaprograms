package today1;

import java.util.HashMap;

public class ArrayTest {
	
	public static void main(String[] args) {
		
		
		int[] a= {1,2,3,4,5,1,2,4};
		
		
		HashMap<Integer,Integer> hMap=new HashMap<Integer,Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			
			if(hMap.containsKey(a[i]))
			{
				hMap.put(a[i], hMap.get(a[i])+1);
			}
			else
			{
				
				hMap.put(a[i], 1);
			}
		}
		
		System.out.println(hMap);
		
	}

}
