package Strings;
import java.util.*;
public class AllPossiblePermutations
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int len = a.length;
		for(int i=0;i<len;++i)
		{
			a[i] = sc.nextInt();
		}
		for(int i=0;i<len;++i)
		{
			for(int j=i;j<len;++j)
			{
				for(int k=i;k<=j;++k)
				{
					System.out.print(a[k]+" ");
				}
				System.out.println();
			}
		}
		for(int i=0;i<len/2;++i)
		{
			a[i]^=a[len-i-1];
			a[len-i-1]^=a[i];
			a[i]^=a[len-i-1];
		}
		for(int i=0;i<len;++i)
		{
			for(int j=i;j<len;++j)
			{
				for(int k=i;k<=j;++k)
				{
					if(i==j)
					{
						continue;
					}
					else
					{
					System.out.print(a[k]+" ");
					}
				}
				System.out.println();
			}
		}
	}
}