import java.util.*;
public class Pattern3 
{
    public static void main(String arg[])
    {
        Scanner dd=new Scanner(System.in);
        int k=dd.nextInt();
        for(int i=1; i<=k; i++)
        {
            for(int j=1; j<=k-i+1; j++)
            {
                System.out.print("#");
            }
            System.out.println();
        }
    }
    
}
