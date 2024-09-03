import java.util.*;
class Break
{
    public static void main(String arg[])
    {
        Scanner gayatri=new Scanner(System.in);
        do
        {
            int a=gayatri.nextInt();
            if(a%10==0)
            {
                break;
            }
            System.out.println("system not suppporting");
         
        }while(true);
    }
}
