import java.util.*;
public class nonrepeat
{
    public static Character nrc(String s, int k)
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

        int count = 0;
        for(Map.Entry<Character, Integer> entry : hash.entrySet())
        {
            if(entry.getValue() == 1)
            {
                count++;
                if(count == k)
                return entry.getKey();
            }
        }
        return null;


    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k = sc.nextInt();
        Character result = nrc(s,k);
        if (result != null) 
        {
            if(k==1)
            System.out.println(k+"st non-repeating character: " + result);
            else if(k==2)
            System.out.println(k+"nd non-repeating character: " + result);
            else if(k==3)
            System.out.println(k+"rd non-repeating character: " + result);
            else
            System.out.println(k+"th non-repeating character: " + result);

        } //it would always return some non zero value if there are nrc
        else 
        {
            System.out.println("No non-repeating character found.");
        } // for the edge cases like aabb etc
    }
}