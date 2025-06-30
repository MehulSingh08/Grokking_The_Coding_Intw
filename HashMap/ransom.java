package HashMap;

import java.util.*;
public class ransom
{
    public static boolean check(String m, String r)
    {
        if(r.length()> m.length() || r.length() == 0 || m.length() == 0)
        return false;

        int[] alp_count = new int[26];

        for(char c : m.toLowerCase().toCharArray())
        {
            alp_count[c - 'a']++;
        }
        
        for(char c : r.toLowerCase().toCharArray())
        {
            if(alp_count[c-'a'] == 0)
            return false;
        
            alp_count[c - 'a']--;
        }
        return true;

    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the magazine string: ");
        String magazine = sc.nextLine();
        System.out.println("Enter the ransom string: ");
        String ransom = sc.nextLine();
        System.out.println(check(magazine, ransom));
        sc.close();
    }
}