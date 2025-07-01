//good question to check occurences of substring

import java.util.*;
public class SubstringCounter 
{
    public static int counter(String text, String pattern) 
    {
        if (pattern == null || pattern.isEmpty()) return 0;

        int count = 0;
        int index = 0;

        while ((index = text.toLowerCase().indexOf(pattern.toLowerCase(), index)) != -1) 
        {
            count++;
            index += pattern.length();  // move past the matched substring
        }

        return count;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the larger text to match: ");
        String text = sc.nextLine();
        System.out.println("Enter the pattern to match through it: ");
        String pattern = sc.nextLine();

        int result = counter(text, pattern);
        System.out.println("Occurrences: " + result); 
        sc.close();
    }
}

