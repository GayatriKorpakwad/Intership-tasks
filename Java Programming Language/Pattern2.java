import java.util.*;
public class Pattern2 
{
    public static void main(String jj[])
    {
        Scanner board=new Scanner(System.in);
        int n=board.nextInt();
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
            System.out.print("*");
            }
            System.out.println();
        }
    }    
}
