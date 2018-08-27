import java.util.*;
class Reverse1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String a[]=s1.split(" ");
        for(int i=0;i<a.length;i++)
        {
            StringBuffer sb=new StringBuffer(a[i]);
            sb.reverse();
            if(i==a.length-1)
            {
                System.out.print(sb);
            }
            else
            {
                System.out.print(sb+" ");
            }
        }
    }
}
     
