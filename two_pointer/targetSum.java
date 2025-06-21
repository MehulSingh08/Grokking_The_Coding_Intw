import java.util.*;
public class targetSum
{
    public static int[] target(int[] arr, int n, int target)
    {
        Arrays.sort(arr);
        int left = 0;
        int right = n-1;
        while(left<right)
        {
            int curr = arr[left] + arr[right];
            if(curr == target)
            {
                return new int[] {arr[left], arr[right]};
            }
            if(target > curr)
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        return new int[] {-1, -1}; 
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target sum: ");
        int target = sc.nextInt();
        int[] result = target(arr, n, target);
        System.out.println(Arrays.toString(result));
        sc.close();
        
    }
}