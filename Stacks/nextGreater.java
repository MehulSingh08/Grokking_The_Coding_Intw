package Stacks;

import java.util.*;
public class nextGreater
{
    public static int[] greater(int[] arr)
    {
        int n = arr.length;
        int[] res = new int[n];

        for(int i=0; i<n; i++)
        {
            int next = -1;
            for(int j=i+1; j<n; j++)
            {
                if(arr[j] > arr[i])
                {
                    next = arr[j];
                    break;
                }
            }
            res[i] = next;
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
        int[] result = greater(arr);
        System.out.println(Arrays.toString(result));
        sc.close();
    }
}