import java.util.*;
class Freq
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        ArrayList<Integer> al=new ArrayList<Integer>();
        ArrayList<Integer> al1=new ArrayList<Integer>();
        Set<Integer> ts=new TreeSet<Integer>();
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            al.add(a[i]);
            ts.add(a[i]);
        }
        for(int i:ts)
        {
            if(Collections.frequency(al,i)==1)
            {
                System.out.print(i);
            }
        }
        
        
    }
}
