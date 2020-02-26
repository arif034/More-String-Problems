package Strings;
import java.util.*;
public class MaxOccuringCharacterUsingCountSort
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int len = s.length();
		int temp[] = new int[255];
		for(int i=0;i<255;++i)
		{
			temp[i] = 0;
		}
		for(int i=0;i<s.length();++i)
		{
			++temp[s.charAt(i)];
		}
		int max = temp[s.charAt(0)];
		char maxChar = ' ';
		for(int i=0;i<s.length();++i)
		{
			if(temp[s.charAt(i)] > max)
			{
				max = temp[s.charAt(i)];
				maxChar = s.charAt(i);
			}
		}
		System.out.println(max);
		System.out.println();
		System.out.println(maxChar);
	}
}