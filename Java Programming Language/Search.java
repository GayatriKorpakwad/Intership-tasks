public class Search
{
    public static int Linearsearch(int numbers[], int key)
    {
        for(int i=0; i<numbers.length; i++)
        {
            if(numbers[i]==key)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String arg[])
    {
        int numbers[]={1,2,3,4,5,6,7,8,9,10};
        int key=29;
        int index=Linearsearch(numbers, key);
        if(index==-1)
        {
            System.out.println("NUMBER NOT FOUND");
        }
        else
        {
            System.out.println("NUMBER IS PRESENT IN GIVEN ARRAY : " + index);

        }
    }
    
}
