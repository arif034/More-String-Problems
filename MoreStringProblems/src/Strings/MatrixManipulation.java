package Strings;
import java.util.*;
public class MatrixManipulation
{
	public static void main(String[] args)
	{
		int a[][] = {{0,1,0},{1,1,0},{1,0,0}};
		int len = a.length;
		int Len = len*3;
		int newA[][] = new int[Len][Len];
		for(int i=0;i<len;i++)
		{
			for(int j=0;j<len;++j)
			{
				int curr = a[i][j];
				for(int k=3*i;k<3*i+3;++k)
				{
					for(int l=3*j;l<3*j+3;++l)
					{
						newA[k][l] = curr;
					}
				}
			}
		}
		for(int i=0;i<Len;i++)
		{
			for(int j=0;j<Len;++j)
			{
				System.out.print(newA[i][j]);
				if((j+1)%3 == 0)
				{
//					

				}
			}
			System.out.println();
		}
	}
}