package apr30th;

public class ArraysDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Arrays Approach
		
		int[] b=new int[5];
		
		
		System.out.println("Length or Size of Array "+b.length);
		
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		
		
		String[] bNames=new String[5];
		
		System.out.println("Length or Size of Array "+bNames.length);
		
		for(int i=0;i<bNames.length;i++)
		{
			System.out.println(bNames[i]);
		}
		
		
		b[0]=100;
		
		b[1]=200;
		
		bNames[0]="Reyaz";
		
		System.out.println("Length or Size of Array "+b.length);
		
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		
		
		
		
		System.out.println("Length or Size of Array "+bNames.length);
		
		for(int i=0;i<bNames.length;i++)
		{
			System.out.println(bNames[i]);
		}
		
		

	}

}
