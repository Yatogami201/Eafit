import java.util.Scanner;
public class Main
{
    public static void main(String args[])  
    {
	int i, j;
  int r = 3;
  int c = 4;
 Scanner scan = new Scanner(System.in);
      
	int mat[][] = new int[r][c];
      
	System.out.println("Ingrese 12 valores:");
      
 	for(i = 0; i < r; i++)
  	{
   	    for(j = 0; j < c; j++) 
     	    {
        	mat[i][j] = scan.nextInt();
        	System.out.print(" ");
            }
  	}
	System.out.println("Matriz Original:");
  	for(i = 0; i < r; i++)
    	{
      	    for(j = 0; j < c; j++)
            {
          	System.out.print(mat[i][j]+"\t ");
            }
            System.out.println(" ");
        }
 	System.out.println("Matriz Transpuesta: ");
  	for(i = 0; i < c; i++)
    	{
      	    for(j = 0; j < r; j++)
            {
                System.out.print(mat[j][i]+" \t");
            }
            System.out.println(" ");
        }
    }
}