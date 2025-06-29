import java.util.*;
public class unique
{
    public static int Unumber (int[] arr)
    {
        Map<Integer, Integer> freqmap = new HashMap<>();

        for(int n : arr)
        {
            if(freqmap.containsKey(n))
            {
                freqmap.put(n, freqmap.get(n) +1);
            }
            else
            {
                freqmap.put(n, 1);
            }
        }

        int maxUnique = -1;
        for(Map.Entry<Integer, Integer> entry:freqmap.entrySet())
        {
            if(entry.getValue() == 1)
            {
                maxUnique = Math.max(maxUnique, entry.getKey());
            }
        }
        
        return maxUnique;

    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i=0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        int result = Unumber(arr);
        System.out.println(result);
    }
}