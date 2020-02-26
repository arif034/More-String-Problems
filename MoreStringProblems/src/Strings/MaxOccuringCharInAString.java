package Strings;
import java.util.*;
public class MaxOccuringCharInAString  
{
    static char getMaxOccuringChar(String str) 
    {
        char ch = ' ';
        int max = -1;
        int len = str.length();
        int count[] = new int[256];
        for(int i=0;i<len;++i)
        {
        	++count[str.charAt(i)];
        }
        for(int i=0;i<len;++i)
        {
        	if(count[str.charAt(i)] > max)
        	{
        		max = count[str.charAt(i)];
        		ch = str.charAt(i);
        	}
        }
        return ch;
    }
    static int  getMaxOccuring(String str) 
    {
        char ch = ' ';
        int max = -1;
        int len = str.length();
        int count[] = new int[256];
        for(int i=0;i<len;++i)
        {
        	++count[str.charAt(i)];
        }
        for(int i=0;i<len;++i)
        {
        	if(count[str.charAt(i)] > max)
        	{
        		max = count[str.charAt(i)];
        		ch = str.charAt(i);
        	}
        }
        return max;
    }
    public static void main(String[] args) 
    {
    	Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); 
        System.out.println(getMaxOccuringChar(str));
        System.out.println(getMaxOccuring(str));
    } 
} 