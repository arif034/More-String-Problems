package Strings;
import java.util.*;
public class ReverseString
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	int len = s.length();
	char[] ch = new char[len];
	for(int i=0;i<len;++i)
	{
		ch[len-i-1] = s.charAt(i); 
	}
	String rev = "";
	for(int i=0;i<len;++i)
	{
		rev+=ch[i];
	}
	System.out.println(rev);
	}
}
