import java.util.*;
public class Displacement
{
    public static float shortestpath(String hm)
    {
        int x=0;
        int y=0;
        for(int i=0; i<hm.length(); i++)
        {
            char direction=hm.charAt(i);
            
            //north
            if(direction == 'N')
            {
                y++;
            }

            //south
            else if(direction == 'S')
            {
                y--;
            }

            //east
            else if(direction == 'E')
            {
                x++;
            }

            //west
            else(direction == 'W')
            {
                x--;
            }
        }
         int X=x*x;
         int Y=y*y;
        return(float) Math.sqrt( X +Y );
    }
`111                                                                                                                11111111111111111111111111111111111111111111111111111``````````
    public static void main(String arg[])
    {
        Scanner kk=new Scanner(System.in);
        String sk=kk.next();

        System.out.println(shortestpath(sk));
            
    }
    
    
}
