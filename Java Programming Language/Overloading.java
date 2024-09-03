public class Overloading 
{
    public static int multiply(int a, int b)
    {
         return a*b;
    }
    public static int multiply(int a, int b,int c)
    {
        return a*b*c;
    }  
    public static float multiply(float a,float b)
    {
        return a*b;
    }
    public static void main(String arg[])
    {
        System.out.println(multiply(7,8));
        System.out.println(multiply(10,5,8));
        System.out.println(multiply(2.22f,7.9f));
    }  
     
}
