package Strings;
import java.util.*;
public class RemovingDuplicateCharactersFromAString
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int len = s.length();
		StringBuilder sb = new StringBuilder("");
		char[] ch = new char[256];
		for(int i=0;i<256;++i)
		{
			ch[i] = 0;
		}
		for(int i=0;i<len;++i)
		{
			++ch[s.charAt(i)];
		}
		for(int i=0;i<256;++i)
		{
			if(ch[i]!=0)
			{
				sb.append((char)i);
			}
		}
		System.out.println(sb);
	}
}