package Stacks;
import java.util.*;
public class DailyStack
{
    public static int[] daily(int[] arr)
    {
        int n = arr.length;
        int res[] = new int[n];
        Stack<Integer> stk = new Stack<>();
        for(int i=n-1; i>=0; i--)
        {
            while(!stk.isEmpty() && arr[stk.peek()] <= arr[i])
            {
                stk.pop();
            }

            if(stk.isEmpty())
            {
                res[i] = 0;
            }
            else
            {
                res[i] = stk.peek() - i;
            }
            stk.push(i);
        }
        return res;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++)
        {
            arr[i] =sc.nextInt();
        }
        int[] result = daily(arr);
        System.out.println(Arrays.toString(result));
        sc.close();
    }
}