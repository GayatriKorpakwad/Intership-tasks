import java.util.*;
public class Largestof3
{
    public static void main(String ff[])
    {
        Scanner RR=new Scanner(System.in);
        int A=RR.nextInt();
        int B=RR.nextInt();
        int C=RR.nextInt();
        if(A>B && A>C)
        {
            System.out.println("A is the largest number");
        }
        else if(B>C)
        {
             System.out.println("B is the largest number");
        }
        else
        {
             System.out.println("C is the largest number");

        }
    }
    
}
