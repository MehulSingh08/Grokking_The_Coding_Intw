package Stacks;

import java.util.*;
public class DailyTemp 
{
    public static int[] days(int[] tempe)
    {
        int n = tempe.length;
        int[] res = new int[n];
        for(int i=0; i<n; i++)
        {
            int count =0; //counter resets after every iteration
            for(int j=i+1; j<n; j++)
            {
                count++;
                if(tempe[j] > tempe[i])
                {
                    res[i] = count;  // if encountered greater value then it is returned
                    break;
                }
                
            }
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
        int[] result = days(arr);
        System.out.println(Arrays.toString(result));
        sc.close();
    }
}
