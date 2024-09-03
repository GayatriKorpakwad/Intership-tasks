import java.util.*;
public class Functions2 
{
    public static int gayatri(int a, int b)
    {
        int multiply=a*b;
        return multiply;
    }
    public static void main(String arg[])
    {
        Scanner ff=new Scanner(System.in);
        int a=ff.nextInt();
        int b=ff.nextInt();
        int multiply=gayatri(a,b);
        System.out.println( +multiply);
        
    }
    
}
