//import java.util.Arrays;
public class BasicSorting 
{
    public static void BubbleSort(int arr[])
    {
        for(int turn=0; turn<arr.length-1; turn++)
        {
            for(int i=0; i<arr.length-2-turn; i++)
            {
                if(arr[i]>arr[i+1])
                {
                    //swap
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
    }

    public static void printarr(int arr[])
    {
        for(int j=0; j<arr.length; j++)
        {
            System.out.print(arr[j] +" ");
        }
        System.out.println();
    }


    public static void SelectionSort(int arr[])
    {
        for(int i=0; i<arr.length-1; i++)
        {
            int minposition=i;
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[minposition]>arr[j]) //for ascending order
                //if(arr[minposition]<arr[j]) //for descending order
                {
                    minposition=j;
                }
            }
            //swap
            int temp=arr[minposition];
            arr[minposition]=arr[i];
            arr[i]=temp;

        }
    }

    public static void InsertionSort(int arr[])
    {
        for(int i=1; i<arr.length; i++)
        {
            int curr=arr[i];
            int pre=i-1;
            //finding out the correct position to enter
            while(pre>=0 && arr[pre]>curr)// ascending
           // while(pre>=0 && arr[pre]<curr) //descending
            {
                arr[pre+1]=arr[pre];
                pre--;
            }
            //insertion
            arr[pre+1]=curr;
        }
    }

    public static void CountingSort(int arr[])
    {
        int largest=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++)
        {
            largest=Math.max(largest,arr[i]);
        }
        int count[]=new int[largest+1];
        for(int i=0; i<arr.length; i++)
        {
            count[arr[i]]++;
        }
        int j=0;
        for(int i=0; i<count.length; i++)
        {
            while(count[i]>0)
            {
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }

    public static void main(String arg[])
    {
        int arr[]={1,2,3,1,4,5,4,7,9,9,5};
        //BubbleSort(arr);
       // SelectionSort(arr);
      // InsertionSort(arr);
     // Arrays.sort(arr);
     //Arrays.sort(arr, 2, 5);
     CountingSort(arr);
        printarr(arr);  
    }
    
}
