public class DataManupulation 
{
    public static void evenorodd(int n)
    {
        int bitmask=1;
        if((n & bitmask)==0)
        {
            System.out.println("number is even");
        }
        else
        {
            System.out.println("number is odd");
        }
    }


    public static int GetIthBit(int n, int i)
    {
        int bitMask=1<<i;
        if((n & bitMask)==0)
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }

    public static int SetIthBit(int n, int i)
    {
        int bitMask=1<<i;
        return n | bitMask;
    }

    public static int ClearIthBit(int n,int i)
    {
        int bitMask=~(1<<i);
        return n & bitMask;
    }

    public static int ClearlastIthBits(int n, int i)
    {
        int bitMask=(-1)<<i;
        return n & bitMask;
    }

        public static void main(String argS[])
        {
           // evenorodd(13);
           // evenorodd(8);
          // System.out.println(GetIthBit(15,2));
         // System.out.println(SetIthBit(10,3));
         //System.out.println(ClearIthBit(10,1));
         System.out.println(ClearlastIthBits(15,2));

        }   
}
