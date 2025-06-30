import java.util.*;
public class chars
{
    public static int charsis(String str, char ch)
    {
        if(str.length() == 0)
        return 0;
        int count = 0;
        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i) == ch)
            {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        System.out.println("Enter the character to check: ");
        char ch = sc.next().charAt(0);
        int result = charsis(str, ch);
        System.out.println("The number of " +ch+ " in " +str+ " is: " +result); 
        sc.close();

    }

}