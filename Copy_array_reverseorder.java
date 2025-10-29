package retail;

import java.util.Arrays;

public class Copy_array_reverseorder {

	public static void main(String[]args) {
		
		int [] a = new int[3];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		
		int [] b = new int [3];
		
		for(int i=0, j=2;i<a.length; i++ ,j--)
		{
		
		b[j]=a[i];		
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
	}
	
}
