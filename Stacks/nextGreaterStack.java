package Stacks;

import java.util.*;
public class nextGreaterStack
{
    public static int[] Stack(int[] elem)
    {
        int n = elem.length;
        int[] res = new int[n];
        Stack<Integer> stk = new Stack<>();
        for(int i=n-1; i>=0; i--)
        {
            // keep popping the stack untill we find greater element
            while(!stk.isEmpty() && stk.peek() <= elem[i]) 
            {
                stk.pop();
            }

            if(stk.isEmpty())
            {
                res[i] = -1;
            }
            else
            {
                res[i] = stk.peek();
            }

            stk.push(elem[i]);
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
        int[] result = Stack(arr);
        System.out.println(Arrays.toString(result));
        sc.close();
    }
}