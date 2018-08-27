import java.util.*;
class Sum1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int a[]=new int[n1];
        int sum=0;
        for(int i=0;i<n1;i++)
        {
            a[i]=sc.nextInt();
            sum=sum+a[i];
        }
        System.out.print(sum);
    
    }
}
     
