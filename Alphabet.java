import java.util.*;
class Alphabet
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
		if(Character.isLetter(s1.charAt(0)))
				{
			System.out.print("Alphabet");
				}
		else
		{
			System.out.print("No");
        }
        
    }
}
