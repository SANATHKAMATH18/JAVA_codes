import java.util.*;
public class Matrix_Operations
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       int m1,n1,m2,n2;
       System.out.println("Enter order of matrix 1: ");
       m1=sc.nextInt();
       n1=sc.nextInt();
       System.out.println("Enter order of matrix 2: ");
       m2=sc.nextInt();
       n2=sc.nextInt();
       int A[][]=new int[m1][n1];
       int B[][]=new int[m2][n2];
       int C[][]=new int[m1][n1];
       int D[][]=new int[m1][n2];
       int E[][]=new int[m1][n1];
        System.out.println("Enter  matrix 1: ");
        for(int i=0;i<A.length;i++ )
       {
           for(int j=0;j<A[0].length;j++)
           {
              A[i][j]=sc.nextInt();
           }
       }
        System.out.println("Enter  matrix 2: ");
       for(int i=0;i<B.length;i++ )
       {
           for(int j=0;j<B[0].length;j++)
           {
              B[i][j]=sc.nextInt();
           }
       }
       for(int x[]:A )
       {
           for(int y:x)
           {
               System.out.print(y+" ");
           }
           System.out.println("");
       }
       System.out.println("");
       for(int x[]:B )
       {
           for(int y:x)
           {
               System.out.print(y+" ");
           }
           System.out.println("");
       }
       System.out.println("Matrix addition");
       if(m1==m2 && n1==n2)
       {
          for(int i=0;i<B.length;i++ )
       {
           for(int j=0;j<B[0].length;j++)
           {
              C[i][j]=A[i][j]+B[i][j];
           }
       }
          for(int x[]:C )
       {
           for(int y:x)
           {
               System.out.print(y+" ");
           }
           System.out.println("");
       }
       }
       else
       {
           System.out.print(" not possible\n");
       }
       System.out.println("Matrix multiplication");
       if(n1==m2)
       {
          for(int i=0;i<A.length;i++ )
       {
           for(int j=0;j<B[0].length;j++)
           {
               D[i][j]=0;
               for(int k=0;k<(A[0].length+B.length)/2;k++)
               {
                   D[i][j]+=A[i][k]*B[k][j];
               }
        }
       }
          for(int x[]:D )
       {
           for(int y:x)
           {
               System.out.print(y+" ");
           }
           System.out.println("");
       }
       }
       else
       {
           System.out.print(" not possible\n");
       }
       System.out.println("Matrix subtraction");
       if(m1==m2 && n1==n2)
       {
          for(int i=0;i<B.length;i++ )
       {
           for(int j=0;j<B[0].length;j++)
           {
              E[i][j]=A[i][j]-B[i][j];
           }
       }
          for(int x[]:E )
       {
           for(int y:x)
           {
               System.out.print(y+" ");
           }
           System.out.println("");
       }
       }
       else
       {
           System.out.print(" not possible\n");
       }
   }
}
