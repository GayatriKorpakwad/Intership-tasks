public class stringlargest 
{
    public static void main (String kk [])
    {
        String gayatri []= { "sanika", "mughda" , "prachi "};

        String largest = gayatri[0];

        for(int i = 0;i<gayatri.length;i++)
        {
            if(largest.compareTo(gayatri[i])<0)
            {
                largest=gayatri[i];
            }
        }
        System.out.println(largest);
    }
}
