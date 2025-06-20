import java.util.*;
public class pangram
{
    public static boolean ispangram(String s)
    {
        s = s.toLowerCase();
        Set<Character> seen = new HashSet<>();
        for(int i=0; i<s.length(); i++)
        {
            char curr = (s.charAt(i));
            if(Character.isLetter(curr))
            {
                seen.add(curr);
            }
        }

        return seen.size() == 26;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        System.out.println(ispangram(s));
        sc.close();
    }
}