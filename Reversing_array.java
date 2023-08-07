import java.util.Scanner;
public class Reversing_array
{
    public static void main(String args[])
    {
        System.out.println("Enter the number of elements of the array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int carr[]=new int[n];
        int rcarr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println("Orginal array");
        for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");
        for(int i=0;i<n;i++)
        {
            carr[i]=arr[i];
        }
        for(int i=arr.length-1;i>=0;i--)
        {
             rcarr[n-i-1]=arr[i] ;
        }
        System.out.println("\nCopied array");
        for(int x:carr)
        System.out.print(x+" ");
        System.out.println("\nREVERSE Copied array");
        for(int x:rcarr)
        System.out.print(x+" ");
    }
}