public class Search3 
{
    public static int Binarysearch(int numbers[], int key)
    {
        int start=0, end=numbers.length-1;
        while(start <= end)
        {
            int mid=(start+end) / 2;
            if(numbers[mid]==key)
            {
              return mid;  
            }
            if(numbers[mid]<key)
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;

            }

        }
        return -1;
        
    }
    public static void main(String arg[])
    {
        int numbers[]={2,5,7,8,10,14,17};
        int key=25;
        
        System.out.println("The index for key is: " + Binarysearch(numbers , key));
    }
    
}
