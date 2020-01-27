import java.util.Scanner;

public class SelectionSort {
    void sort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }

            }
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
    void printArray(int arr[])
        {
          int l=arr.length;
          for(int i=0;i<l;i++)
          {
              System.out.print(arr[i]+" ");

          }
          System.out.println();
        }
     public static void main(String[] args)
     {
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int arr[]=new int[n];
         for(int i=0;i<n;i++)
         {
             arr[i]=sc.nextInt();
         }
         SelectionSort ss=new SelectionSort();
         ss.sort(arr);
         ss.printArray(arr);

     }

}
//Time complexity=O(n*n)