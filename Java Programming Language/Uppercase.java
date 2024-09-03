

public class Uppercase 
{

    public static String kunal(String str)
    {
        StringBuilder gk= new StringBuilder("");

        Character ch=Character.toUpperCase(str.charAt(0)); 
        gk.append(ch);

        for(int i=1; i<str.length(); i++)
        {
            if(str.charAt(i)==' ' && i<str.length()-1)
            {
                gk.append(str.charAt(i)); 
                i++;
                gk.append(Character.toUpperCase(str.charAt(i))); 
            }
            else
            {
                gk.append(str.charAt(i));
            }
        }
        return  gk.toString();
    }


    public static void main(String arg[])
    {
        String str="good morning to all present here";
        System.out.println(kunal(str));
    }
}
