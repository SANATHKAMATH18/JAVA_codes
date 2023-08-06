import java.util.Scanner;
public class Rotation_array
{
    public static void main(String args[])
    {
        System.out.println("Enter the number of elements of the array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int lrr[]=new int[n];
        int rrr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
         int temp1=arr[0];
        int temp2=arr[n-1];
        System.out.println("Orginal array");
        for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");
        System.out.println();
        for(int i=0;i<n-1;i++)
            {
                lrr[i]=arr[i+1];
            }
            lrr[n-1]=temp1;
         System.out.println("Left rotated array");
        for(int i=0;i<n;i++)
          System.out.print(lrr[i]+" ");  
          System.out.println();
          rrr[0]=temp2;
          for(int i=0;i<n-1;i++)
            {
                rrr[i+1]=arr[i];
            }
         System.out.println("Right rotated array");
        for(int i=0;i<n;i++)
          System.out.print(rrr[i]+" ");  
          System.out.println();
    }
}