public class Array6 
{
    public static void maxSubarraySum(int numbers[])
    {
        int currSum=0;
        int maxSum=0;
        int prefix[]=new int[numbers.length];

        prefix[0]=numbers[0];
        //calculate prefix array
        for(int i=1; i<prefix.length; i++)
        {
            prefix[i]=prefix[i-1]+numbers[i];
        }
        for(int i=0; i<numbers.length; i++)
        {
            int start=i;
            for(int j=i; j<numbers.length; j++)
            {
                int end=j;
                currSum=start==0? prefix[end] : prefix [end]-prefix[start-1];
                if(maxSum<currSum)
                {
                    maxSum=currSum;
                }
            }
        }
        System.out.println("maxSum= " + maxSum);
    }

    public static void main(String arg[])
    {
        int numbers[]={4,-9,0,7,-5,-10};
        maxSubarraySum(numbers);
    }
}
