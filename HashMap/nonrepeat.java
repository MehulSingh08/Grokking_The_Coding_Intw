import java.util.*;
public class nonrepeat
{
    public static Character nrc(String s)
    {
        Map<Character, Integer> hash = new LinkedHashMap<>();

        for(char c : s.toCharArray())
        {
            if(hash.containsKey(c))
            {
                hash.put(c, hash.get(c) +1);
            }
            else
            {
                hash.put(c,1);
            }
        }

        for(Map.Entry<Character, Integer> entry : hash.entrySet())
        {
            if(entry.getValue() == 1)
            {
                return entry.getKey();
            }
        }
        return null;


    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Character result = nrc(s);
        System.out.println(result);
        if (result != null) 
        {
            System.out.println("First non-repeating character: " + result);
        } //it wpuld always return some non zero value if there are nrc
        else 
        {
            System.out.println("No non-repeating character found.");
        } // for the edge cases like aabb etc
    }
}