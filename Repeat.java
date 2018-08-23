import java.util.*;
class Repeat
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
            int n1=Collections.frequency(al,i);
            if(n1>1)
            {
                System.out.print(i+" ");
            }
        }
        
    }
}
