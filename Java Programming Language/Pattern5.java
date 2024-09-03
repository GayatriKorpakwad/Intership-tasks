import java.util.*;
class Pattern5
{
    public static void main(String arg[])
    {
        Scanner gg=new Scanner(System.in);
        int n=gg.nextInt();
        char ch= 'A';
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }  
    }
}