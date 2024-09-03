public class stringbuilder 
{
    public static void main(String arg[])
    {
        StringBuilder gk= new StringBuilder("");
        for( char ch='a'; ch<='z'; ch++)
        {
        gk.append(ch);
        }
        System.out.println(gk.length());
    }
    
}
