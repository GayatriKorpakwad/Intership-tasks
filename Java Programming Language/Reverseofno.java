public class Reverseofno 
{
    public static void main(String arg[])

    {
        int number=300303;
        while(number>0)
        {
           int lastdigit=number%10;
            System.out.print(lastdigit +"");
            number=number/10;

        }
        System.out.println(" ");
    }
    
}
