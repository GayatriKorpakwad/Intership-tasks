import java.util.*;
public class Whileloop4 
{
    public static void main(String arg[])
    {
        Scanner SS=new Scanner(System.in);
        int n=SS.nextInt();
        int reverse=0;
        while(n>0)
        {
            int lastdigit=n%10;
            reverse=(reverse*10)+lastdigit;
            n=n/10;
            System.out.println(reverse);
        }
        
        
    }
    
}
