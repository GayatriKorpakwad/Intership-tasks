public class CompareString 
{
    public static void main(String xy[])
    {
        String a ="energy";
        String b ="energy";
        String c =new String("energy");

        if(a==b)
        {
            System.out.println("String is equal");
        }
        else
        {
            System.out.println("String is not equal");
        }

       // if(a==c)
     //   {
      //      System.out.println("String is equal");
      //  }
      //  else
       // {
      //      System.out.println("String is not equal");
       // }
        
        if(a.equals(c))
        {
            System.out.println("String is equal");
        }
        else
        {
            System.out.println("String is not equal");
        }

    }
    
}
