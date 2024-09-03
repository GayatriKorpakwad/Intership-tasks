import java.util.*;
public class Switch {
    public static void main(String GG[])
    {
        Scanner Work=new Scanner(System.in);
        int Career=Work.nextInt();
        switch(Career)
        {

           case 1:System.out.println("PERSON IS AN ENGINEER");
             break;

        case 2:  System.out.println("PERSON IS A DOCTOR");
        break;

        case 3:System.out.println("PERSON IS AN ARTIST");
        break;

        case 4:System.out.println("PERSON IS AN ACTOR");
        break;

        case 5:System.out.println("PERSON IS A CHEF");
        break;

        default:System.out.println("PERSON IS JOBLESS");
        break;
        }
        
    }
    
}
