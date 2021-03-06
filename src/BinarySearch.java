import java.util.*;
public class BinarySearch {
    public static int binarySearch(int arr[] ,int l,int r,int x)
    {
        if(r>=l)
        {
            int mid=l+(r-l)/2;
            if(arr[mid]==x) {
                return mid;

            }
            if(arr[mid]>x)
            {
                return binarySearch(arr,l,mid-1,x);
            }
            else
            {
                return binarySearch(arr,mid+1,r,x);
            }

        }
        return -1;
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while (t-->0)
        {   int n=0;
            n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            int x=sc.nextInt();
            int a=0;
            a=binarySearch(arr,0,n-1,x);
            if(a==-1)
            {
                System.out.println("Element is not present!");
            }
            else
            {
                System.out.println("Element "+x+" is  present at index!"+a);
            }

        }

    }


}
//Time complexity=Theta(logn)