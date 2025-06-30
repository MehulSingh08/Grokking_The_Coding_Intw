import java.util.*;
public class vowels
{
    public static int count(String str)
    {
        if(str.length() == 0)
        return 0;

        int c_a = 0;
        int c_e = 0;
        int c_i = 0;
        int c_o = 0;
        int c_u = 0;
        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i) == 'a')
            {
                c_a++;
            }
            else if(str.charAt(i) == 'e')
            {
                c_e++;
            }
            else if(str.charAt(i) == 'i')
            {
                c_i++;
            }
            else if(str.charAt(i) == 'o')
            {
                c_o++;
            }
            else if(str.charAt(i) == 'u')
            {
                c_u++;
            }
        }

        int total = c_a + c_e + c_i + c_o + c_u;
        return total;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        int result = count(str);
        System.out.println("The number of vowels in " +str+ " is: " +result); 
        sc.close();

    }
}