import java.util.Scanner;
public class Two_D_ARRAY
{
   public static void main(String args[])
   {
       int A[][]=new int[5][5];
       int [][]F;
       F=new int[5][8];
       for(int x[]:A)
       {
           for(int y:x)
           {
               System.out.print(y+" ");
           }
           System.out.println("");
       }
   }
}
