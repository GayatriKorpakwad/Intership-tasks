import java.util.*;
public class Search2 
{
    public static int Largest(int numbers[])
    {
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i=0; i<numbers.length; i++)
        {
            if(largest<numbers[i])
            {
                largest=numbers[i];
            }
            if(smallest>numbers[i])
            {
                smallest=numbers[i];
            }
        }
        System.out.println("The smallest number is : " +smallest);
        return largest;
    }

    public static void main(String arg[])
    {   int number[]=new int[10];
        Scanner kk=new Scanner(System.in);
        number[0]=kk.nextInt(); 
         number[1]=kk.nextInt();
         number[2]=kk.nextInt();
        number[3]=kk.nextInt();     
       
        System.out.println("The largest value is : " + Largest(number));
    }
    
}
