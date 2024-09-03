public class Factorial
{
    public static int factorial(int  n)
    {
        int f=1;
        for(int i=1; i<=n; i++)
        {
            f=i*f;

        }
        return f;

    }
    

    public static int Bincoeff(int n,int r)
    {
         int fac_n=factorial(n);
         int fac_r=factorial(r);
         int fac_nmr=factorial(n-r);
         int bincoeff=fac_n/(fac_r*fac_nmr);
        return bincoeff;
    }
    public static void main(String arg[])
    {
         System.out.println(bincoeff(40,6));
    }
}