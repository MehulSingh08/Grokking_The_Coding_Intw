import java.util.*;
public class palindrome
{
    public static boolean isPalin(String s)
    {
        s= s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int i = 0;
        int j = s.length()-1;

        while(i<j){
            if(s.charAt(i) != s.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        System.out.println(isPalin(s));
        sc.close();

    }
}