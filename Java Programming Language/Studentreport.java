import java.util.*;
public class Studentreport {
    public static void main(String AA[])
    {
        Scanner fRIEND=new Scanner(System.in);
        int marks=fRIEND.nextInt();
        String Marksheet= (marks>=50)?"PASS":"FAIL";
         System.out.println(Marksheet);  
    }    
}
