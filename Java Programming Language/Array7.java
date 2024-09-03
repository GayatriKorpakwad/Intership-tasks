public class Array7 
{
    public static void Kadanes(int numbers[])
    {
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++)
        {
            currsum=currsum + numbers[i];
            if(currsum<0)
            {
                currsum=0;
            }
            maxsum=Math.max(currsum,maxsum);
        }
        System.out.println("The maxSubarraySum of given array is : " + maxsum);

    }

    public static void main(String arg[])
    {
        int numbers[]={1,-2,-3,4,-1,-2,1,5,-3};
        Kadanes(numbers);
    }
    
}
