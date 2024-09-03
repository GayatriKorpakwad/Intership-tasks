import java.util.*;
public class Whileloop3
{
    public static void main(String mm[])
    {
        Scanner sk=new Scanner(System.in);
        int n=sk.nextInt();
        int sum=0;
        int j=1;
        while(j<=n)
        {
            sum+=j;
            System.out.println(sum);
            j++;
        
        }
    }
    
}
