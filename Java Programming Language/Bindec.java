public class Bindec 
{
    public static void bintodec(int binnum)
    {
        int newnum=binnum;
        int pow=0;
        int decnum=0;

        while(binnum>0)
        {
            int lastdigit=binnum%10;
            decnum=decnum+(lastdigit*(int)Math.pow(2,pow));

            pow++;
            binnum=binnum/10;

        }
        System.out.println("decimal of "+newnum+" =  "+decnum);
    }
   // public static void main(String arg[])
    {
        bintodec(999);

    }

    public static void dectobin(int m)
    {
        int mynum=m;
        int pow=0;
        int binnum=0;

        while(m>0)
        {
            int rem=m%2;
            binnum=binnum+(rem*(int)Math.pow(10,pow));

            pow++;
            m=m/2;
        }
        System.out.println("Binary form of" +mynum+" = "+binnum);
    }
    public static void main(String arg[])
    {
        dectobin(999);
    }

}
