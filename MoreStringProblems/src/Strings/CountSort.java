package Strings;
import java.util.*;
public class CountSort
{
	public static int ToBinary(int n)
	{
		int res = 0;
		while(n>0)
		{
			res = res*10 + (n%10);
			n/=10;
		}
		return res;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a[] = {1,1,1,2,2,2,3,3,3,4,4,4,5,5,5,6};
		int bin[] = new int[a.length];
		for(int i=0;i<a.length;++i)
		{
			bin[i] = ToBinary(a[i]);
		}
		
//		binary to decimal conversion me hi n(2) complexity lagti hai
//		
	}
}