public class Substring
{

    public static String gayatri(String xyz,int si, int ei)
    {
        String gk="";
         for(int i=si; i<ei; i++)
         {
           gk += xyz.charAt(i);
         }
         return gk;

    }
    public static void main(String arg[])
    {
        String xyz="Education";
        System.out.println(gayatri(xyz,2,6));

    }


        

    
    
}
