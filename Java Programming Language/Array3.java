public class Array3 
{
    public static void pairs(int numbers[])
    {
        int tp=0;
        for(int i=0;i<numbers.length; i++)
        {
            int latestno=numbers[i];
            for(int j=i+1; j<numbers.length; j++)
            {
                System.out.print("( " + latestno + "," + numbers[j] + ")" );
                tp++;
                
            }
            System.out.println();
        }
        System.out.println("total pairs are: "+tp);
    }

    public static void main(String arg[])
    {
        int numbers[]={4,5,6,8,9,0};
        pairs(numbers);
    }
    
}
