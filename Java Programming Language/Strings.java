import java.util.*;
public class Strings
{
    public static void printletters(String gk)
    {
        for(int i=0; i<gk.length(); i++)
        {
            System.out.print(gk.charAt(i) + " ");
        }
        System.out.println();
    } 

    public static boolean ispalindrome(String shivam)
    {
        int n=shivam.length();
        for(int i=0; i<shivam.length()/2; i++)
        {
            if(shivam.charAt(i)!=shivam.charAt(n-1-i))
            {
                return false;
            }
        }
        return true; 
    }

    public static void main(String arg[])
    {
       // char arr[]={'a','b','c','d'};
        //String ss="abcd";

        //Scanner dd=new Scanner(System.in);
        //String name;
        //name=dd.nextLine();
        //System.out.println(name);

        //finding length of string
       // String best="Kunal & Gayatri are bestfriends";
        //System.out.println(best.length());

        //concatenation
       // String firstname="Gayatri";
        //String lastname="Korpakwad";
        //String fullname=firstname + " " + lastname;
        //System.out.println(fullname);
         // printletters(fullname);
         Scanner brother =new Scanner(System.in);
        String shivam=brother.next();

        System.out.println(ispalindrome(shivam));
    
    }
    
}
