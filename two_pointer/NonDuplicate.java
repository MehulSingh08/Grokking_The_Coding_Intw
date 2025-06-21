import java.util.*;
public class NonDuplicate
{
    public static int Dup(int [] arr)
    {
        Arrays.sort(arr);
        int pos =1;
        for(int i=1; i<arr.length; i++)
        {
            if(arr[i] != arr[i-1])  //starts from the index 0 and then matches the second index
            {                       //if there is a match we will skip otherwise we will keep the number and keep updating the array
                arr[pos] = arr[i];
                pos++;
            }
        }
        return pos;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        int[] arr = new int[n];
        for(int i=0; i<n;i++)
        {
            arr[i] =sc.nextInt();
        }
        int result = Dup(arr);
        System.out.println("Length after removing duplicates is: " +result);
        for(int i=0; i<result; i++)
        {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
    
