import java.util.*;
class Maxi
{
    public static void main(String args[])
    {
        String s1=sc.nextLine();
		String a[]=s1.split(" ");
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=0;i<a.length;i++)
		{
			al.add((Integer.valueOf(a[i])));
		}
		int max=Collections.max(al);
		System.out.print(max);
    }
}
