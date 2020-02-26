package Strings;
import java.util.*;
public class SpiralReadingofMatrix
{
	public static void main(String[] args)
	{
		int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int r1=0,c1=0,r2=2,c2=2;
		while(r1<=r2)
		{
			for(int i=c1;i<3;++i)
			{
				System.out.println(a[r1][i]);
			}
			++r1;
		}
		
	}
}