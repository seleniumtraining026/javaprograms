package apr30th;

public class ArraysDisAdvantagesDeno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] a=new int[5];
		

		System.out.println("Length or Size of Array "+a.length);
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		
		System.out.println("Length or Size of Array "+a.length);
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		//a[5]=60;
		
		a[3]=40.44;
		
		System.out.println("Length or Size of Array "+a.length);
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		

	}

}
