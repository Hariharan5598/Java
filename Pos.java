import java.util.*;
class Pos
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int a[]=new int[n1];
        for(int i=0;i<n1;i++)
        {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        System.out.print(a[n1-n2]);
    }
}
     
