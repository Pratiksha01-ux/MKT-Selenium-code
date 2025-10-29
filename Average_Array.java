package retail;

public class Average_Array {
	
	public static void main(String[]args)
	{
		int [] a = new int[3];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		
		
		int sum =0;
		for(int i=0;i<a.length;i++)
			
		{
			sum=sum+a[i];
			
		}
		
		
		int Avg=sum/a.length;
        System.out.println(Avg);
	}

}
