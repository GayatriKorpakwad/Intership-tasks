import java.util.Scanner;


class Calculator
{
    public static void main(String kk[])
    {
        Scanner gayatri = new Scanner (System.in);
        System.out.println("ENTER NUMBER A =");
        int A = gayatri.nextInt();
        System.out.println("ENTER NUMBER B  =");
        int B = gayatri.nextInt();
        System.out.println("ENTER THE OPERATOR");
        char GK = gayatri.next().charAt(0);

        switch(GK)
        {
            case '+' : System.out.println((A+B));
                break;

            case '-' : System.out.println((A-B));
            break;
                
                
             case '*'  : System.out.println((A*B));
                break;


                 case '/' : System.out.println((A/B));
                break;



                 case '%': System.out.println((A%B));
                break;

                default : System.out.println("FUCK OFF");
                break;
        }
    }
}
