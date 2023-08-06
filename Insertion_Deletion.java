import java.util.Scanner;
public class Insertion_Deletion
{
    public static void main(String args[])
    {
        System.out.println("Enter the number of elements of the array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n+5];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
         int temp1=arr[0];
        int temp2=arr[n-1];
        System.out.println("Orginal array");
        for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");
        while(true)
        {
            System.out.println("\nEnter -1 to stop and 1 to continue");
            int c=sc.nextInt();
            if(c==-1)
            {
            System.exit(0);
            }
        System.out.println("Enter 1 for insertion\n2 for Deletion");
        int ch=sc.nextInt();
        switch (ch)
        {
            case 1:
                System.out.println("Enter the element and index of the element  to be inserted");
                int ele=sc.nextInt();
                int index=sc.nextInt();
                for(int i=index;i<n;i++)
                {
                    arr[i+1]=arr[i];
                }
                arr[index]=ele;
                n++;
                System.out.println("New array");
                    for(int i=0;i<n;i++)
                        System.out.print(arr[i]+" ");
                        break;
             case 2:
                System.out.println("Enter the  index of the element to be deleted");
                int index1=sc.nextInt();
                int temp=arr[index1];
                for(int i=index1;i<n-1;i++)
                {
                    arr[i]=arr[i+1];
                }
                n--;
                System.out.println("Deleted element "+temp);
                System.out.println("New array");
                    for(int i=0;i<n;i++)
                        System.out.print(arr[i]+" ");
                        break;
            default:
                System.out.println("Invalid entry");
        }
    }
    }
}