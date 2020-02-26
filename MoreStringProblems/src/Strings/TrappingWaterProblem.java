package Strings;
public class TrappingWaterProblem
{
	public static void main(String[] args)
	{
		int a[] = {3,0,0,2,0,4};
		int res = 0;
		for(int i=1;i<a.length-1;++i)
		{
			int left = a[i];
			int right= a[i];
			for(int j=0;j<i;++j)
			{
				if(a[j] > left)
				{
					left = a[j];
				}
			}
			for(int j=i+1;j<a.length;++j)
			{
				if(a[j] > right)
				{
					right = a[j];
				}
			}
			if(right > left)
				{
					res+=left-a[i];
				}
			else
			{
				res+=right-a[i];
			}
		}
		System.out.println(res);
	}
}