public class Array4 
{
    public static void PrimarySubarray(int numbers[])
    {
        int ts=0;
        for(int i=0; i<numbers.length; i++)
        {
            int start=i;
            for(int j=i; j<numbers.length; j++)
            {
                int end=j;
                for(int k=start; k<=end; k++ )
                {
                    System.out.print(numbers[k] + " ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subarrays are:" + ts);

    } 

    public static void main(String arg[])
    {
        int numbers[]={7,5,4,2,8,9,0};
        PrimarySubarray(numbers);
    }
    
}
