import java.util.*;
public class Invertedstar
{
    public static void main(String arg[])
    {
        Scanner jj=new Scanner(System.in);
        int m=jj.nextInt();
           for(int i=1; i<=m; i++)
           {
            for(int j=1; j<=m-i+1; j++)
            {
                System.out.print("*");
            }
            System.out.println();
           }
    
     }

    
}
