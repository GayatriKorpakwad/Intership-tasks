public class Array5 
{
    public static void maxSubarraySum(int numbers[])
    {
        int currsum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++)
        {
            int start=i;
            for(int j=i; j<numbers.length; j++)
            {
                int end=j;
                currsum=0;
                for(int k=start; k<=end; k++)
                {
                    currsum +=numbers[k];
                }
                System.out.println(currsum);
                if(maxSum<currsum)
                {
                    maxSum=currsum;
                }
            }
        
        }
        System.out.println("maxSum = " +maxSum);

    }

    public static void main(String arg[])
    {
        int numbers[]={1,-7,8,-9,4};
        maxSubarraySum(numbers);

    }
    
}
