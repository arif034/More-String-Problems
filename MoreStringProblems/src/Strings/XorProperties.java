package Strings;

public class XorProperties
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
		int n = 13;
		int a[] = {3,3,4,4,5,5,5,4,3,2,2,2,6};
		int b[] = new int[a.length];
		for(int i=0;i<a.length;++i)
		{
			b[i] = ToBinary(a[i]);
		}
		for(int i=0;i<a.length;++i)
		{
			for(int j=0;j<3;++j)
			{
				
			}
		}
	}
}