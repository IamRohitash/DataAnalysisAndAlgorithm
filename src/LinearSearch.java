import java.util.*;
public class LinearSearch {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int s=sc.nextInt();
            int a=0;
             a=search(arr,s);
            if(a==-1)
            {
                System.out.print("Number "+s+" is not found:");
            }
            else
            {
                System.out.print("Number "+s+" is  found at index:"+a);
            }
        }

    }
    public static int search(int arr[],int s)
    {
      int l=arr.length;
      for(int i=0;i<l;i++)
      {
          if(arr[i]==s)
          {
              return i;
          }
      }
      return -1;
    }


}
//Time complexity=O(n)