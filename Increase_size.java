import java.util.Scanner;
public class Increase_size
{
    public static void main(String args[])
    {
        System.out.println("Enter the number of elements of the array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int narr[]=new int[n+5];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        System.out.println("Orginal array");
        for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");
        for(int i=0;i<n;i++)
        narr[i]=arr[i];
        //narr=arr;Does not increase size of array but copies the element
        System.out.println("");
        for(int i=0;i<n+5;i++)
            System.out.print(narr[i]+" ");
    }
}