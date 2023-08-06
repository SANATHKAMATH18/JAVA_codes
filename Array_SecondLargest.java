import java.lang.*;
import java.util.*;
public class Array_SecondLargest
{
    public static void main(String args[])
    {
        int n,temp,b[],sum=0,key;
        System.out.println("Enter the size of the array");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        boolean bool=false;
        b=new int[n];
        for (int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        b=arr;
        System.out.println("Enter the key element");
        key=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(arr[i]==key)
                bool=true;
                sum+=arr[i];
                for(int j=0;j<n-i-1;j++)
            {
                if(b[j]>b[j+1])
                {
                    temp=b[j];
                    b[j]=b[j+1];
                    b[j+1]=temp;
                }
            }
        }
        System.out.println(" Second largest elenment\n Sum of array\n Key is present or not\n Largest element\n"+b[n-2]+"\n"+sum+"\n"+bool+"\n"+b[n-1]);
    }
}