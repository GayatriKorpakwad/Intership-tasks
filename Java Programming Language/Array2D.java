import java.util.*;
public class Array2D 
{

    public static boolean Search(int matrix[][], int key)
    {
        for(int i=0; i<matrix.length; i++)
        {
            for(int j=0; j<matrix[0].length; j++)
            {
                if(matrix[i][j]==key)
                {
                    System.out.print("key matched ("+ i +","+ j +")");
                    return true;
                }
            } 
            System.out.println();
            
        }

        return false;
       

    }
    public static void main(String arg[])
    {
        int matrix[][]=new int[3][3];
        int n=matrix.length, m=matrix[0].length;
        Scanner sk=new Scanner(System.in);
        
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                matrix[i][j]=sk.nextInt();
            }
        }

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                System.out.print(matrix[i][j] + " ");
            } 
            System.out.println();
        }

        int key=sk.nextInt();

        Search(matrix, key);
       
    }
   
    
}
