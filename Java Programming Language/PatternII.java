import java.util.*;
public class PatternII 
{
    public static void  h_rectangle(int rows,int columns)
    {
        for(int i=1; i<=rows; i++)
        {
            for(int j=1; j<=columns; j++)
            {
                if(i==1 || i==rows || j==1 || j==columns)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }




    public static void inverted_triangle(int n)
    {
        for(int i=1; i<=n; i++)
        {
             //spaces
             for(int j=1; j<=n-i; j++)
             {
             System.out.print(" ");
             }  
            //stars
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
           
            System.out.println();      
        }
    }

    public static void inverted_half_pyramid_withnum(int n)
    {
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n-i+1; j++)
            {
                System.out.print(j);
            }
            
            System.out.println();
        }
        
    }

    public static void floyds(int n)
    {
        int counter=1;
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(counter);
                counter++;
            }
            System.out.println();
        }
    } 

    public static void zero_one_triangle(int n)
    {
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                if((i+j)%2==0)
                {
                    System.out.print("1");
                }
                else
                {
                    System.out.print("0");

                }
            }
            System.out.println();
        }
    }


    public static void solid_rhombus(int n)
    {
        for(int i=1; i<=n; i++)
        {
            //spaces
            for(int j=1; j<=(n-i); j++)
            {
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=n; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void hollow_rhombus(int n)
    {
        for(int i=1; i<=n; i++)
        {
            //for spaces
            for(int j=1; j<=(n-i); j++)
            {
                System.out.print(" ");
            }

            //for hollow rectangle stars
            for(int j=1; j<=n; j++)
            {
                if(i==1 || i==n || j==1 ||j==n)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }

    public static void daimond(int n)
    {
        for(int i=1; i<=n; i++)
        {
            //1st half
            for(int j=1; j<=(n-i); j++)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=2*(i-1); j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
         
         //2nd half
         for(int i=n; i>=1; i--)
        {
            //1st half
            for(int j=1; j<=(n-i); j++)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=2*(i-1); j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
 
    
    public static void main(String arg[])
    {
      // h_rectangle(10,5);
      Scanner gk=new Scanner(System.in);
      int m=gk.nextInt();
    //  inverted_half_pyramid_withnum(7);
    //floyds(m);
     //zero_one_triangle(m);
     //solid_rhombus(m);
     //hollow_rhombus(m);
     daimond(m);
    }

    
}
