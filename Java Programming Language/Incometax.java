import java.util.*;
public class Incometax
 {
   public static void main(String FF[])
   {
    Scanner GG=new Scanner(System.in);
    int income=GG.nextInt();
    if(income<=200000)
    {
        System.out.println("APPLIES 0% INCOME TAX");    }
    else if(income>=200000 && income<1000000)
    {
        System.out.println("APPLIES 20% INCOME TAX");

    }
    else
    {
        System.out.println("APPLIES 30% INCOME TAX");
    }
   }
    
}
