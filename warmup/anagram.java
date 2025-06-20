import java.util.*;
public class anagram
{
    public static boolean isanagram(String s, String t)
    {
        if(s.length() != t.length())
        {
            return false;
        }

        int [] count = new int[26];
        for (int i=0; i<s.length(); i++)
        {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) -'a']--;
        }

        for(int c : count)
        {
            if( c!= 0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String s = sc.nextLine();
        System.out.print("Enter the next string: ");
        String t = sc.nextLine();
        System.out.println(isanagram(s,t));
        sc.close();
    }
}
