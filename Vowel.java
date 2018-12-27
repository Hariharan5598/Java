import java.util.*;
class Vowel
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        if(Character.isLetter(s1.charAt(0)))
        {
            char c=s1.charAt(0);
            if(c=='a' || c=='e'||c=='i' || c=='o' || c=='u')
            System.out.print("Vowel");
            else
            System.out.print("consonant");
        }
        else
        System.out.print("invalid");
    }
}
