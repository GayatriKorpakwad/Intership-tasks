import java.util.*;public class Search4 
{
    public static void reverse(int numbers[])
    {
    int first=0; int last=numbers.length-1;
    while(first<last)
      {
        int temp=numbers[last];
         numbers[last]=numbers[first];
         numbers[first]=temp;

        first++;
        last--;
      }
   }
    public static void main(String arg[])
    {
    int numbers[]=new int[10];
    Scanner gk=new Scanner(System.in);
    numbers[0]=gk.nextInt();
    numbers[1]=gk.nextInt();
    numbers[2]=gk.nextInt();
    numbers[3]=gk.nextInt();
    numbers[4]=gk.nextInt();
    numbers[5]=gk.nextInt();
    numbers[6]=gk.nextInt();

    reverse(numbers);
    for(int i=0; i<numbers.length; i++)
    {
      System.out.print( " "+ numbers[i]);
    }

  }
  
}
