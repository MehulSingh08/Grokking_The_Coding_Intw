import java.util.*;
public class tripletsZero
{
    private static List<List<Integer>> Triplets(int [] arr)
    {
        Arrays.sort(arr);
        List<List<Integer>> triplets = new ArrayList<>();
        for(int i=0; i<arr.length; i++)
        {
            if(i>0 && arr[i] == arr[i-1])
            {
                continue;
            }
            searchPair(arr, -arr[i], i+1, triplets);
        }
        return triplets;
    }

    private static void searchPair(int[] arr, int target, int left, List<List<Integer>> triplets)
    {
        int right = arr.length-1;
        while(left<right)
        {
            int curr = arr[left] + arr[right];
            if(curr == target)
            {
                triplets.add(Arrays.asList(-target, arr[left], arr[right]));
                left++;
                right--;
                while (left<right && arr[left]==arr[left-1])
                left++;
                while(left<right && arr[right] == arr[right-1])
                right--;
            }
            else if(target > curr)
            {
                left++;
            }
            else
            {
                right --;
            }
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        System.out.print("Enter the elements: ");
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        List<List<Integer>> result = Triplets(arr);
        System.out.println("The triplets are: ");
        for(List<Integer> triplet : result)
        {
            System.out.println(triplet);
        }
        sc.close();
        
    }
}