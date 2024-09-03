//import java.util.*;
public class Prime2 
{
    public static boolean isPrime(int n)
    {
       boolean isPrime=true;
        for(int i=2; i<=n-1; i++)
        {
            if(n%i==0)
            {
                isPrime=false;
                
            }
        }
        return isPrime;
    }
    public static boolean isprime(int m)
    {
        if(m==2)
        {
            return true;
        }
        for(int i=2; i<=Math.sqrt(m); i++)
        {
            if(i%m==0)
            {
                return false;
            }

            
        } return true;
    }
    public static void gk(int k)
    {
        for(int j=2; j<=k; j++)
        {
            if(isprime(j))
            {
                System.out.println(j+" ");
            }
        }
        System.out.println(" ");
    }
    
    public static void main(String arg[])
    {
       // Scanner kk=new Scanner(System.in);
       // int k=kk.nextInt();
        System.out.println(isprime(20));

    }
    
    
}

