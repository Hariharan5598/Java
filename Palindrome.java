import java.util.*;
class Palindrome
{
    public static void main(String args[])
    {
       String s1=sc.nextLine();
		StringBuffer sb=new StringBuffer(s1);
		sb.reverse();
		String s2=sb.toString();
		if(s1.equals(s2))
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
    }
}
